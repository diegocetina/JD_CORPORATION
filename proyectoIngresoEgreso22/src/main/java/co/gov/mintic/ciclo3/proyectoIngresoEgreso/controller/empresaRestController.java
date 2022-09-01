package co.gov.mintic.ciclo3.proyectoIngresoEgreso.controller;


import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.empresa;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.idRol;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class empresaRestController {
    @Autowired
    public EmpresaService restempresa;
    @GetMapping("/enterprises")
    public List<empresa> findAll2(){

        return restempresa.findAll2();
    }
    @PostMapping("/enterprises")
    public empresa createEmpresa(@RequestBody empresa crearEmpresa){

        return restempresa.createEmpresa(crearEmpresa);
    }
    @GetMapping("/enterprises/[id]")
    public empresa findById(@PathVariable long id){

        return restempresa.findById(id);
    }
    @PutMapping("/enterprises/[id]")
    public empresa updateEmpresa(@PathVariable long id, @RequestBody empresa datos) {
        return restempresa.updateEmpresa(id,datos);
    }
    @DeleteMapping("/enterprises/[id]")
    public void deleteEmpresa(@PathVariable long id){
        restempresa.deleteEmpresa(id);
    }
}
