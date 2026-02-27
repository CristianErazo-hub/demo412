package com.example412;

public class Main {
    public static void main(String[] args) {

        //Crear un objeto de la clase Persona utilizando el constructor vacío
        Persona persona1 = new Persona(123, "Cristian Erazo", "cristian@gmail.com", 323612864);

        //Llamar al método hablar del objeto Persona
        String saludo = persona1.hablar("Hola, ¿cómo estás?");

        persona1.dormir(8);

         System.out.println(saludo);
    }
}