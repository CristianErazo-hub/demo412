package com.example412;

public class Persona {

    //Modificadores de acceso: public, private, protected
    //public (+): se puede acceder desde cualquier clase
    //private(-): solo se puede accedes desde la clase donde se declaró el atributo método
    //protected (#): se puede acceder desde la clase donde se declaró el atributo o método y desde las clases que hereden de esa clase
    
    //Atributos de la clase Persona
    //Características que identifican a una clase Persona
    private int cedula;
    public String nombre;
    public String correo;
    private int telefono;
    protected int cuentaBancaria;

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

    private void dormir(int horas) {
        System.out.println("La persona duerme " + horas + " horas");
    }

    public int caminar(int pasos) {
        //System.out.println("La persona camina " + pasos + " pasos");
        return pasos;
    }
}