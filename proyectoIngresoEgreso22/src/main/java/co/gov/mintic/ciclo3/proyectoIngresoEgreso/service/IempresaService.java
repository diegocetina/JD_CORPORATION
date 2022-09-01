package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.empresa;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IempresaService {

    public List<empresa> findAll2();

    public empresa createEmpresa(empresa crearEmpresa);

    public empresa findById(long id);

    public empresa updateEmpresa(long id, empresa datos);

    public void deleteEmpresa(long id);
}
