package com.ufv;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Declaramos una persona vacía
        Persona Juan = new Persona();

        // Declaramos una persona con datos
        Persona Juan_Filled = new Persona("Juan", "Morales", 11111111, 21);


        // Imprimimos los datos de manera individual
        System.out.println(" ");
        System.out.println(Juan_Filled.getNombre());
        System.out.println(Juan_Filled.getApellidos());
        System.out.println(Juan_Filled.getDniSinLetra());
        System.out.println(Juan_Filled.getEdad());
        System.out.println(" ");

        // Imprimimos junto gracias al toString
        System.out.println(Juan_Filled);
        System.out.println(" ");

        // Imprimimos el data.txt

        Persona persona_read;
        InOut inOut = new InOut();
        try
        {
            persona_read = inOut.LecturaFichero("data.txt");
            System.out.println(persona_read);
        } catch (FileNotFoundException fne)
        {
            System.out.println("No se ha podido encontrar el archivo.");
        } catch (IOException ioe)
        {
            System.out.println("Otro fallo no identificado.");
        }
    }
}
