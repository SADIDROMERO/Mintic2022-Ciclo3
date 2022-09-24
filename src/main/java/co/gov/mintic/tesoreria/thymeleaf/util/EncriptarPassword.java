package co.gov.mintic.tesoreria.thymeleaf.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {

    public static void main (String[] args){
        var password = "Carlos123*";
        System.out.println("password"+ password);
        System.out.println("password Encriptado"+ encriptarPassword(password));
    }

    protected static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
