package com.ferran.HolaSpring.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CifrarPassword {

    public static void main(String[] args) {

        var password = "123";
        System.out.println(cifrarPassword(password));
    
}

public static String cifrarPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

}