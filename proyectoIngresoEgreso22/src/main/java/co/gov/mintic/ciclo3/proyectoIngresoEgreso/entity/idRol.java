package co.gov.mintic.ciclo3.proyectoIngresoEgreso.entity;

public class idRol {
    private long idRol;

    private String descripcion;

    private boolean estado;

    public idRol(long idRol, String descripcion, boolean estado) {
        this.setIdRol(idRol);
        this.setDescripcion(descripcion);
        this.setEstado(estado);
    }

    public idRol() {
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "idRol{" +
                "idRol=" + idRol +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
