package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.empleado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class empleadoService implements IEmpleadoService{
    @Override
    public List<empleado> findAll3() {
        List<empleado> employed = new ArrayList<>();
        empleado empleado1 = new empleado();
        empleado1.setNombreEmpleado("Javier gonzalez");
        empleado1.setCorreo("javi@gmail.com");
        empleado1.setEmpresaPerteneciente("J&D CORPORATION");
        empleado1.setIdEmpleado(1);

        //set para empleado1
        employed.add(empleado1);
        empleado empleado2 = new empleado();
        empleado2.setNombreEmpleado("Diego Cetina");
        empleado2.setCorreo("diego@gmail.com");
        empleado2.setEmpresaPerteneciente("J&D CORPORATION");
        empleado2.setIdEmpleado(2);
        employed.add(empleado2);
        return employed;
    }

    @Override
    public empleado createEmpleado(empleado crearEmpleado) {
        empleado newEmpleado = new empleado();
        newEmpleado.setNombreEmpleado(crearEmpleado.getNombreEmpleado());
        newEmpleado.setCorreo(crearEmpleado.getCorreo());
        newEmpleado.setEmpresaPerteneciente(crearEmpleado.getEmpresaPerteneciente());
        newEmpleado.setIdEmpleado(crearEmpleado.getIdEmpleado());
        return newEmpleado;
    }

    @Override
    public empleado findById(long id) {
        empleado findIdEmpleado = new empleado();
        findIdEmpleado.setNombreEmpleado("Diego Cetina");
        findIdEmpleado.setCorreo("Diegooo@gmail.com");
        findIdEmpleado.setEmpresaPerteneciente("J&D CORPORATION");
        findIdEmpleado.setIdEmpleado(4);
        return findIdEmpleado;
    }

    @Override
    public empleado updateEmpleado(long id, empleado datosEmpleado) {
        empleado updateEmpleado1 = new empleado();
        updateEmpleado1.setNombreEmpleado(datosEmpleado.getNombreEmpleado());
        updateEmpleado1.setCorreo(datosEmpleado.getCorreo());
        updateEmpleado1.setCorreo(datosEmpleado.getCorreo());
        updateEmpleado1.setIdEmpleado(datosEmpleado.getIdEmpleado());
        return updateEmpleado1;
    }

    @Override
    public void deleteEmpresa(long id) {
        empleado deleteEmpleado = findById(id);
    }
}
