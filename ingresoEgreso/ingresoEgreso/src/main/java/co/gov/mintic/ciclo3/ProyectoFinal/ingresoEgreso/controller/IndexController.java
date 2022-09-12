package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;


@Controller
public class IndexController {
    private final Logger LOG = Logger.getLogger(""+IndexController.class);
    @GetMapping("/")
    public String teste(Model model){
        LOG.log(Level.INFO, "Index");
        var mensaje = "hola desde el index controller";
        model.addAttribute("mensaje",mensaje);
        return "index";
    }
}
