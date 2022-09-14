package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.controller;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.idRol;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.IEmpleadoService;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.IidRolService;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.empleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class empleadoController {

    @Autowired
    private IEmpleadoService listaEmpleados;

    @Autowired
    private IidRolService rolService;
    private final Logger LOG = Logger.getLogger(""+empleadoController.class);

    @GetMapping("/empleado/listaUsuarios") //Get de Datos
    public String getListEmpleados(Model model){
        LOG.log(Level.INFO, "getListEmpleados");
        List<empleado> empleados = listaEmpleados.findAll3();
        for(empleado user : empleados)
            System.out.println(user.toString());
        model.addAttribute("empleados", empleados);
        return "empleado/listaUsuarios";
    }

    @GetMapping("/empleado/modificarEmpleado")
    public String createEmpleado(Model createModel){
        LOG.log(Level.INFO, "createEmpleados");
        //Empleado
        empleado empleado = new empleado();
        createModel.addAttribute("usuario",empleado);
        //Rol
        List<idRol> rol = rolService.findAll();
        createModel.addAttribute("roles" , rol);
        return "empleado/modificarEmpleado";
    }

}
