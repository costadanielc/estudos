package com.costadanielc.cadastro.controller;

import com.costadanielc.cadastro.data.TitularRepositorio;
import com.costadanielc.cadastro.model.Titular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TitularController {

    @Autowired //Instancia o objeto sempre que eu chamar ele na página
    TitularRepositorio titularRepositorio;

    @RequestMapping(value="/cadastroTitular", method= RequestMethod.GET)
    public String cadastroTitular(){
        return "cadastroTitular";
    }

    @RequestMapping(value = "/cadastroTitular", method= RequestMethod.POST)
    public String cadastroTitular(Titular titular){
        titularRepositorio.save(titular);
        return "cadastroTitular";
    }

    @RequestMapping(value = "/listaTitulares", method= RequestMethod.GET)
    public ModelAndView ListaTitulares(){
        ModelAndView titularModelAndView = new ModelAndView("listaTitulares");
        Iterable<Titular> titulares = titularRepositorio.findAll();
        titularModelAndView.addObject("listaTitulares",titulares);
        return titularModelAndView;
    }

    @DeleteMapping(value = "/deletaTitular/{id}")
    public void deletaTitular(@PathVariable("id") Integer id){
            titularRepositorio.deleteById(id);
        }
}
