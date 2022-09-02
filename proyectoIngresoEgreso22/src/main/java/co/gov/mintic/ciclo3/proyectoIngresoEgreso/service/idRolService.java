package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;


import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.idRol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class idRolService implements IidRolService{

    @Override
    public List<idRol> findAll() {
        List<idRol> roles = new ArrayList<>();
        idRol rol1 = new idRol();
        rol1.setIdRol(1);
        rol1.setDescripcion("Administrativo");
        rol1.setEstado(true);
        roles.add(rol1);
        idRol rol2 = new idRol();
        rol2.setIdRol(2);
        rol2.setDescripcion("Operativo");
        rol2.setEstado(true);
        roles.add(rol2);
        return roles;
    }

    @Override
    public idRol createRol(idRol rol1) {
        idRol newrol = new idRol();
        newrol.setDescripcion(rol1.getDescripcion());
        newrol.setEstado(rol1.isEstado());
        return newrol;
    }

    @Override
    public idRol findById(long id) {
        idRol rol = new idRol();
        rol.setIdRol(id);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        return rol;
    }

    @Override
    public idRol updateRol(long id, idRol rol) {
        idRol putRol = findById(id);
        putRol.setDescripcion(rol.getDescripcion());
        putRol.setEstado(rol.isEstado());
        return putRol;
    }

    @Override
    public void deleteidRol(long id) {
        idRol deleteRol = findById(id);
    }
}
