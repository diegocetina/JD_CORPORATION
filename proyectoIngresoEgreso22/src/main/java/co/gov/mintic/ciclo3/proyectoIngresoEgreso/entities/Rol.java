package co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities;
import javax.persistence.*;

//@Entity
public class Rol {
    private String administrador;
    private String operativo;

    public Rol(String administrador, String operativo) {
        this.administrador = administrador;
        this.operativo = operativo;
    }



    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public String getOperativo() {
        return operativo;
    }

    public void setOperativo(String operativo) {
        this.operativo = operativo;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "administrador='" + administrador + '\'' +
                ", operativo='" + operativo + '\'' +
                '}';
    }
}
