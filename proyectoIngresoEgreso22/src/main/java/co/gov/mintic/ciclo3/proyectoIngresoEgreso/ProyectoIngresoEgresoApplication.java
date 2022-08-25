package co.gov.mintic.ciclo3.proyectoIngresoEgreso;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.empleado;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.empresa;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.movimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.*;
import java.util.Scanner;

@SpringBootApplication
public class ProyectoIngresoEgresoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoIngresoEgresoApplication.class, args);
		int dato;
		Scanner seleccion = new Scanner(System.in);
		System.out.println("BIENVENIDO SELECCIONA UNA DE LAS OPCIONES A CONTINUACION\n"
						+ "1. Crear empresa\n"
						+ "2. Crear empleado\n"
						+ "3. Nuevo movimiento de dinero");
		dato = seleccion.nextInt();
		switch (dato) {
			case 1:
				empresa datos = new empresa();
				datos.setNombreEmpresa();
				datos.setDireccion();
				datos.setTelefono();
				datos.setNIT();
				datos.setIdAdministrador();
				System.out.println(datos.toString());
				break;
			case 2:
				empleado employed = new empleado();
				employed.setNombreEmpleado();
				employed.setCorreo();
				employed.setEmpresaPerteneciente();
				employed.setIdEmpleado();
				System.out.println(employed.toString());
				break;
			case 3:
				movimientoDinero dinero = new movimientoDinero();
				dinero.setMontoMovimiento();
				dinero.setMontoPositivo();
				dinero.setMontoNegativo();
				dinero.setIdEmpleadoMovimiento();
				System.out.println(dinero.toString());
				break;
			default:
				System.out.println("opcion no valida reincie el programa");
				break;

		}

	}

}
