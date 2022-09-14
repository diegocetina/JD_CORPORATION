package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.repository;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository<empleado, Long> {
}
