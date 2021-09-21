package com.ufv;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Declaramos una persona vacía
        Persona Juan = new Persona();

        // Declaramos una persona con datos
        Persona Juan_Filled = new Persona("Juan", "Morales", 11111111, 21);

        // Imprimimos los datos de manera individual
        System.out.println(Juan_Filled.getNombre());
        System.out.println(Juan_Filled.getApellidos());
        System.out.println(Juan_Filled.getDniSinLetra());
        System.out.println(Juan_Filled.getEdad());

        // Imprimimos gracias al toString
        System.out.println(Juan_Filled);
    }
}
