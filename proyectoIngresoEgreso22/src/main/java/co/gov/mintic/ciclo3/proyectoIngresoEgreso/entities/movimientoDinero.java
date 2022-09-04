package co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities;

import java.util.Scanner;

public class movimientoDinero {
    private float montoMovimiento;
    private float montoPositivo;
    private float montoNegativo;
    private long idEmpleadoMovimiento;

    public movimientoDinero(float montoMovimiento, float montoPositivo, float montoNegativo, long idEmpleadoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.montoPositivo = montoPositivo;
        this.montoNegativo = montoNegativo;
        this.idEmpleadoMovimiento = idEmpleadoMovimiento;
    }

    public movimientoDinero() {

    }

    public float getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(float montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public float getMontoPositivo() {
        return montoPositivo;
    }

    public void setMontoPositivo(float montoPositivo) {
        this.montoPositivo = montoPositivo;
    }

    public float getMontoNegativo() {
        return montoNegativo;
    }

    public void setMontoNegativo(float montoNegativo) {
        this.montoNegativo = montoNegativo;
    }

    public long getIdEmpleadoMovimiento() {
        return idEmpleadoMovimiento;
    }

    public void setIdEmpleadoMovimiento(long idEmpleadoMovimiento) {
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

//    public void setMontoMovimiento() {
//        Scanner montoDinero = new Scanner(System.in);
//        float cantidadCapital;
//        System.out.println("ingrese el monto del movimiento: ");
//        cantidadCapital = montoDinero.nextFloat();
//        this.montoMovimiento = cantidadCapital;
//    }
//
//    public void setMontoPositivo() {
//        Scanner montoPositivo = new Scanner(System.in);
//        float cantidadPositiva;
//        System.out.println("ingrese el monto positivo del movimiento: ");
//        cantidadPositiva = montoPositivo.nextFloat();
//        this.montoPositivo = cantidadPositiva;
//    }
//
//    public void setMontoNegativo() {
//        Scanner montoNegativo = new Scanner(System.in);
//        float cantidadNegativa;
//        System.out.println("ingrese el monto negativo del movimiento: ");
//        cantidadNegativa = montoNegativo.nextFloat();
//        this.montoNegativo = cantidadNegativa;
//    }
//
//    public void setIdEmpleadoMovimiento() {
//        Scanner idEmpleado = new Scanner(System.in);
//        long numId;
//        System.out.println("ingrese el el id de la persona quien realiza el movimiento: ");
//        numId = idEmpleado.nextLong();
//        this.idEmpleadoMovimiento = numId;
//    }
}
