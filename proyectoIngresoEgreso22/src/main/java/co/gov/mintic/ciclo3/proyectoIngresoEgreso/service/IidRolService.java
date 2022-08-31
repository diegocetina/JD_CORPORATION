package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.idRol;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IidRolService {

    public List<idRol> findAll();

    public idRol createRol(idRol rol1);

    public idRol findById(long id);

    public idRol updateRol(long id, idRol rol);

    public void deleteidRol(long id);
}
