/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemalumnos;

/**
 *
 * @author areli
 */
public class EjemAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un objeto de la clase Alumno
        Alumno objAlumno = new Alumno(); //mÃ©todo constructor
        objAlumno.pedirDatos();
        objAlumno.calcProm();
       // objAlumno.Nombre = "Jorge"; NO PERMITIDO
    }
    
}
