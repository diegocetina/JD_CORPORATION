package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.movimientoDinero;
import org.springframework.stereotype.Service;

@Service
public class movimientoDineroService implements ImovimientoDineroService{
    @Override
    public movimientoDinero findById(long id) {
        movimientoDinero byIdMovimiento = new movimientoDinero();
        byIdMovimiento.setMontoMovimiento(23414);
        byIdMovimiento.setIdEmpleadoMovimiento(1);
        byIdMovimiento.setMontoPositivo(121);
        byIdMovimiento.setMontoNegativo(-13);
        return byIdMovimiento;
    }

    @Override
    public movimientoDinero CreateNuevoMovimiento(movimientoDinero movimientoDinero2, long id) {
        movimientoDinero create = new movimientoDinero();
        create.setMontoMovimiento(movimientoDinero2.getMontoMovimiento());
        create.setIdEmpleadoMovimiento(movimientoDinero2.getIdEmpleadoMovimiento());
        create.setMontoPositivo(movimientoDinero2.getMontoPositivo());
        create.setMontoNegativo(movimientoDinero2.getMontoNegativo());
        return create;
    }

    @Override
    public movimientoDinero updateMovimiento(long id, movimientoDinero nuevoMovimiento) {
        movimientoDinero  update = new movimientoDinero();
        update.setMontoMovimiento(nuevoMovimiento.getMontoMovimiento());
        update.setIdEmpleadoMovimiento(nuevoMovimiento.getIdEmpleadoMovimiento());
        update.setMontoPositivo(nuevoMovimiento.getMontoPositivo());
        update.setMontoNegativo(nuevoMovimiento.getMontoNegativo());
        return update;
    }

    @Override
    public void deleteMovimiento(long id) {
        movimientoDinero deleteFull = findById(id);
    }
}
