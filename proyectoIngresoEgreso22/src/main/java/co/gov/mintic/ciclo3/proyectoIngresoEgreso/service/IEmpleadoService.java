package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.empleado;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IEmpleadoService {
    public List<empleado> findAll3();

    public empleado createEmpleado(empleado crearEmpleado);

    public empleado findById(long id);

    public empleado updateEmpleado( long id, empleado datosEmpleado);

    public void deleteEmpresa(long id);
}
