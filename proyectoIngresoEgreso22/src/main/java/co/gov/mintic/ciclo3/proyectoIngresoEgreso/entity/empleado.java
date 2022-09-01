package co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity;

import java.util.Scanner;

public class empleado {
    private String nombreEmpleado;
    private String correo;
    private String empresaPerteneciente;
    private Rol rol;
    private long idEmpleado;

    public empleado(String nombreEmpleado, String correo, String empresaPerteneciente, Rol rol, long idEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.empresaPerteneciente = empresaPerteneciente;
        this.rol = rol;
        this.idEmpleado = idEmpleado;
    }

    public empleado() {
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaPerteneciente() {
        return empresaPerteneciente;
    }

    public void setEmpresaPerteneciente(String empresaPerteneciente) {
        this.empresaPerteneciente = empresaPerteneciente;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

//    public void setNombreEmpleado() {
//        Scanner empleado = new Scanner(System.in);
//        String nombreEmpleado;
//        System.out.println("ingrese nombre empleado: ");
//        nombreEmpleado = empleado.nextLine();
//        this.nombreEmpleado = nombreEmpleado;
//    }
//
//    public void setCorreo() {
//        Scanner correo = new Scanner(System.in);
//        String correoEmpleado;
//        System.out.println("ingrese correo empleado: ");
//        correoEmpleado = correo.nextLine();
//        this.correo = correoEmpleado;
//    }
//
//    public void setEmpresaPerteneciente() {
//        Scanner empresaPerma = new Scanner(System.in);
//        String nombreEmpresa;
//        System.out.println("ingrese nombre empresa a la que pertenece el empleado: ");
//        nombreEmpresa = empresaPerma.nextLine();
//        this.empresaPerteneciente = nombreEmpresa;
//    }
//
//    public void setIdEmpleado() {
//        Scanner idEmple = new Scanner(System.in);
//        long numIdEmpleado;
//        System.out.println("ingrese id correspondiente del empleado: ");
//        numIdEmpleado = idEmple.nextLong();
//        this.idEmpleado = numIdEmpleado;
//    }
}
