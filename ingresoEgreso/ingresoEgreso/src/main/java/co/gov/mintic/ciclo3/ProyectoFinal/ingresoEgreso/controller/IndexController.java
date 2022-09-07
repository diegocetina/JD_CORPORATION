package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class IndexController {
    @GetMapping("/")
    public String teste(){
        System.out.println(IndexController.class + " - index");
        return "index";
    }

}
