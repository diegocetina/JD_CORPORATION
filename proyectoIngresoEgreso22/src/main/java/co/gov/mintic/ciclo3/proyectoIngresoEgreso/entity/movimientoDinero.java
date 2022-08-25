package co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity;

import java.util.Scanner;

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

    public movimientoDinero() {

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

    public void setMontoMovimiento() {
        Scanner montoDinero = new Scanner(System.in);
        double cantidadCapital;
        System.out.println("ingrese el monto del movimiento: ");
        cantidadCapital = montoDinero.nextDouble();
        this.montoMovimiento = cantidadCapital;
    }

    public void setMontoPositivo() {
        Scanner montoPositivo = new Scanner(System.in);
        double cantidadPositiva;
        System.out.println("ingrese el monto positivo del movimiento: ");
        cantidadPositiva = montoPositivo.nextDouble();
        this.montoPositivo = cantidadPositiva;
    }

    public void setMontoNegativo() {
        Scanner montoNegativo = new Scanner(System.in);
        double cantidadNegativa;
        System.out.println("ingrese el monto negativo del movimiento: ");
        cantidadNegativa = montoNegativo.nextDouble();
        this.montoNegativo = cantidadNegativa;
    }

    public void setIdEmpleadoMovimiento() {
        Scanner idEmpleado = new Scanner(System.in);
        double numId;
        System.out.println("ingrese el el id de la persona quien realiza el movimiento: ");
        numId = idEmpleado.nextDouble();
        this.idEmpleadoMovimiento = numId;
    }
}
