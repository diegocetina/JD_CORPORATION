package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.movimientoDinero;

public interface ImovimientoDineroService {
    public movimientoDinero findById(long id);

    public movimientoDinero CreateNuevoMovimiento(movimientoDinero movimientoDinero2, long id);

    public movimientoDinero updateMovimiento (long id, movimientoDinero nuevoMovimiento);

    public void deleteMovimiento(long id);
}
