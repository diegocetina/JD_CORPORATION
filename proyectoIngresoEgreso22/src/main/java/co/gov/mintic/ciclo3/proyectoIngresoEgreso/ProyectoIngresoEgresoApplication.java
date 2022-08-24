package co.gov.mintic.ciclo3.proyectoIngresoEgreso;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity.empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoIngresoEgresoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoIngresoEgresoApplication.class, args);
		empresa datos = new empresa();
		datos.setNombreEmpresa();

		//comentario

		System.out.println(datos.toString());

	}

}
