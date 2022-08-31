package co.gov.mintic.ciclo3.proyectoIngresoEgreso.controller;


import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.empresa;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.idRol;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class empresaRestController {

    @GetMapping("/users")
    public List<empresa> findAll2(){
        List<empresa> roles2 = new ArrayList<>();
        empresa rol1 = new empresa();
        rol1.setNombreEmpresa("J&D CORPORATION");
        rol1.setDireccion("calle 14");
        rol1.setTelefono("3142453345");
        rol1.setNIT("12421553-2");
        rol1.setIdAdministrador(1);
        //set para rol1
        roles2.add(rol1);
        empresa rol2 = new empresa();
        rol2.setNombreEmpresa("J&D DEVELOPERS");
        rol2.setDireccion("calle 15");
        rol2.setTelefono("3121412235");
        rol2.setNIT("241414-4");
        rol2.setIdAdministrador(2);
        roles2.add(rol2);
        return roles2;
    }
    @PostMapping("/users")
    public empresa createEmpresa(@RequestBody empresa crearEmpresa){
        empresa newEmpresa = new empresa();
        newEmpresa.setNombreEmpresa(crearEmpresa.getNombreEmpresa());
        newEmpresa.setDireccion(crearEmpresa.getDireccion());
        newEmpresa.setTelefono(crearEmpresa.getTelefono());
        newEmpresa.setNIT(crearEmpresa.getNIT());
        newEmpresa.setIdAdministrador(crearEmpresa.getIdAdministrador());
        return newEmpresa;
    }
}
