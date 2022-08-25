package co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity;

import javax.swing.*;
import java.util.Scanner;

public class empresa {
    private String nombreEmpresa;
    private String direccion;
    private int telefono;
    private String NIT;
    private double idAdministrador;

    public empresa(String nombreEmpresa, String direccion, int telefono, String NIT, double idAdministrador) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
        this.idAdministrador = idAdministrador;
    }

    public empresa() {

    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {

        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public double getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(double idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String toString() {
        return "empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", NIT='" + NIT + '\'' +
                ", idAdministrador=" + idAdministrador +
                '}';
    }

    public void setNombreEmpresa() {
        Scanner name = new Scanner(System.in);
        String name1;
        System.out.println("ingrese nombre empresa: ");
        name1 = name.nextLine();
        this.nombreEmpresa = name1;

    }
    public void setDireccion() {
        Scanner direccion = new Scanner(System.in);
        String direccionEmpresa;
        System.out.println("ingrese direccion de la empresa: ");
        direccionEmpresa = direccion.nextLine();
        this.direccion = direccionEmpresa;
    }
    public void setTelefono() {
        Scanner telefono = new Scanner(System.in);
        int numTel;
        System.out.println("ingrese telefono de la empresa: ");
        numTel = telefono.nextInt();
        this.telefono = numTel;
    }

    public void setNIT() {
        Scanner nit = new Scanner(System.in);
        String numNit;
        System.out.println("ingrese el Nit de la empresa: ");
        numNit = nit.nextLine();
        this.NIT = numNit;
    }

    public void setIdAdministrador() {
        Scanner idAdmin = new Scanner(System.in);
        double numId;
        System.out.println("ingrese el ID del Administrador: ");
        numId = idAdmin.nextDouble();
        this.idAdministrador = numId;
    }
}
