package com.example412;

public class Docente extends Persona {

    public String imparteMateria;

    Docente() {
        super(); //Llamada al constructor de la clase padre Persona
        System.out.println("Constructor de la clase Docente");
    }

    public int calificar(String materia) {
        System.out.println("El docente califica la materia " + materia);

        //Debería ir la lógica para guardar en base de datos
        return 5;

    }
}