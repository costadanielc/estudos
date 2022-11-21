package br.atosdaniel.petshop.controller;

import br.atosdaniel.petshop.model.Cliente;
import br.atosdaniel.petshop.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping(path = "/")
    public String index(Model model){
        List<Cliente> clientes = (List<Cliente>) clienteRepository.findAll();

        model.addAttribute("clientes",clientes);
        return "index";
    }
}
