package co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity;

public class movimientoDinero {
    private double montoMovimiento;
    private double montoPositivo;
    private double montoNegativo;
    private double idEmpleadoMovimiento;

    public movimientoDinero(double montoMovimiento, double montoPositivo, double montoNegativo, double idEmpleadoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.montoPositivo = montoPositivo;
        this.montoNegativo = montoNegativo;
        this.idEmpleadoMovimiento = idEmpleadoMovimiento;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public double getMontoPositivo() {
        return montoPositivo;
    }

    public void setMontoPositivo(double montoPositivo) {
        this.montoPositivo = montoPositivo;
    }

    public double getMontoNegativo() {
        return montoNegativo;
    }

    public void setMontoNegativo(double montoNegativo) {
        this.montoNegativo = montoNegativo;
    }

    public double getIdEmpleadoMovimiento() {
        return idEmpleadoMovimiento;
    }

    public void setIdEmpleadoMovimiento(double idEmpleadoMovimiento) {
        this.idEmpleadoMovimiento = idEmpleadoMovimiento;
    }

    @Override
    public String toString() {
        return "movimientoDinero{" +
                "montoMovimiento=" + montoMovimiento +
                ", montoPositivo=" + montoPositivo +
                ", montoNegativo=" + montoNegativo +
                ", idEmpleadoMovimiento=" + idEmpleadoMovimiento +
                '}';
    }
}
