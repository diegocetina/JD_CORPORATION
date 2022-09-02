package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.empresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmpresaService implements IempresaService{
    @Override
    public List<empresa> findAll2() {
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

    @Override
    public empresa createEmpresa(empresa crearEmpresa) {
        empresa newEmpresa = new empresa();
        newEmpresa.setNombreEmpresa(crearEmpresa.getNombreEmpresa());
        newEmpresa.setDireccion(crearEmpresa.getDireccion());
        newEmpresa.setTelefono(crearEmpresa.getTelefono());
        newEmpresa.setNIT(crearEmpresa.getNIT());
        newEmpresa.setIdAdministrador(crearEmpresa.getIdAdministrador());
        return newEmpresa;

    }

    @Override
    public empresa findById(long id) {
        empresa findIdEmpresa = new empresa();
        findIdEmpresa.setNombreEmpresa("J&D CORPORATION");
        findIdEmpresa.setDireccion("CRA 10");
        findIdEmpresa.setTelefono("312234345");
        findIdEmpresa.setNIT("1241-4");
        findIdEmpresa.setIdAdministrador(3);
        return findIdEmpresa;
    }

    @Override
    public empresa updateEmpresa(long id, empresa datos) {
        empresa updateEmpresa1 = new empresa();
        updateEmpresa1.setNombreEmpresa(datos.getNombreEmpresa());
        updateEmpresa1.setDireccion(datos.getDireccion());
        updateEmpresa1.setTelefono(datos.getTelefono());
        updateEmpresa1.setNIT(datos.getNIT());
        updateEmpresa1.setIdAdministrador(datos.getIdAdministrador());
        return updateEmpresa1;
    }

    @Override
    public void deleteEmpresa(long id) {
        empresa deleteDato = findById(id);
    }
}
