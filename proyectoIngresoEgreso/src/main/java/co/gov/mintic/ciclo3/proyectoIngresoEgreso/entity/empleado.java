package co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity;

public class empleado {
    private String nombreEmpleado;
    private String correo;
    private String empresaPerteneciente;
    private Rol rol;
    private double idEmpleado;

    public empleado(String nombreEmpleado, String correo, String empresaPerteneciente, Rol rol, double idEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.empresaPerteneciente = empresaPerteneciente;
        this.rol = rol;
        this.idEmpleado = idEmpleado;
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

    public double getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(double idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correo='" + correo + '\'' +
                ", empresaPerteneciente='" + empresaPerteneciente + '\'' +
                ", rol=" + rol +
                ", idEmpleado=" + idEmpleado +
                '}';
    }
}
