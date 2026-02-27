package com.example412;

public class Persona {
    
    //Atributos de la clase Persona
    //Características que identifican a una clase Persona
    private int cedula;
    public String nombre;
    public String correo;
    private int telefono;

    //Constructor de la clase Persona
    //Constructor vacío
    Persona() {
        System.out.println("Soy un constructor vacío");
    }

    //Constructor con parámetro cedula
    Persona(int cedula) {
        System.out.println("Soy un constructor con parámetro cedula");
        this.cedula = cedula;
    }

    //Constructor con parámetros cedula, nombre, correo, telefono
    Persona(int cedula, String nombre, String correo, int telefono) {
        System.out.println("Soy un constructor con parámetros cedula, nombre, correo, telefono");
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    

    //Métodos de la clase Persona

    public String hablar(String saludo) {
        //System.out.println(saludo);
        return saludo + " bien gracias"; 
    }

    public void dormir(int horas) {
        System.out.println("La persona duerme " + horas + " horas");
    }

    public int caminar(int pasos) {
        //System.out.println("La persona camina " + pasos + " pasos");
        return pasos;
    }
}    
