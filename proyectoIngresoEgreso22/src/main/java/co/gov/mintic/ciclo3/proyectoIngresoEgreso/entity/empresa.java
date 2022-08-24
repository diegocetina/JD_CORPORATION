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
    }
}
