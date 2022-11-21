package br.atosdaniel.petshop.controller;

import br.atosdaniel.petshop.model.Cliente;
import br.atosdaniel.petshop.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

   @GetMapping(value = "/add")
    public String addCliente (){
        return "cliente";
    }

    @PostMapping(value = "/add")
    public String addCliente (Cliente cliente){
        clienteRepository.save(cliente);
        return "redirect:/cliente/add";
    }

    @GetMapping(value = "/list")
    public ModelAndView listCliente(){
       ModelAndView mv = new ModelAndView("clienteLista");
       Iterable<Cliente> clientes = clienteRepository.findAll();
        mv.addObject("clientes",clientes);
       return mv;
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteCliente(@PathVariable ("id") int idReq){
       clienteRepository.deleteById(idReq);
       return "redirect:/cliente/list";
    }

}
