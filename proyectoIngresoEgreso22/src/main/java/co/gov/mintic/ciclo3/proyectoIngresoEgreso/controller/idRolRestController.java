package co.gov.mintic.ciclo3.proyectoIngresoEgreso.controller;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.Rol;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.idRol;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.service.idRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class idRolRestController {

    @Autowired
    public idRolService rolService;

    //Get en direccion (/entreprise)

    @GetMapping("/enterprise")
    public List<idRol> findAll(){
        return rolService.findAll();
    }
    //create en direccion (/entreprise)
    @PostMapping("/enterprise")
    public idRol createRol(@RequestBody idRol rol1){

        return rolService.createRol(rol1);
    }

    //Get en direccion (/entreprise/{id})
    @GetMapping("/enterprises/{id}")
    public idRol findById(@PathVariable long id){

        return rolService.findById(id);
    }

    //put en direccion (/entreprise/{id})

    @PutMapping("/enterprises/{id}")
    public idRol updateRol(@PathVariable long id, @RequestBody idRol rol){

        return rolService.updateRol(id, rol);
    }
    //delete en direccion (/entreprise/{id})
    @DeleteMapping
    public void deleteidRol(@PathVariable long id){
        rolService.deleteidRol(id);
    }


}
