package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class encriptarPassword {
    public static void main(String[] args) {
        var password = "diego1234";
        System.out.println("password encriptado "+ encriptacion(password));
    }

    private static String encriptacion(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
