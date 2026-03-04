package com.example412;

public class Estudiante extends Persona {

    public String estudiarMateria;

    Estudiante() {
        super(); //Llamada al constructor de la clase padre Persona
        System.out.println("Constructor de la clase Estudiante");
    }

    public void entregarTarea(String materia) {
        System.out.println("El estudiante entrega la tarea de la materia: " + materia);
    }

    public int revisarNota(String materia) {
        System.out.println("El estudiante revisa su nota en la materia:" + materia);

        //La debería traer de la base de datos, pero por ahora se devuelve el valor
        return 5;

    }
    
}