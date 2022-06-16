/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemalumnos;
import java.util.Scanner;

/**
 *
 * @author areli
 */
public class Alumno {
    //declaración de atributos
    private String Nombre;
    private int calif1, calif2, calif3, calif4;
    Scanner entrada;
    
    //definición de los métodos
    public void pedirDatos()
    {
      entrada = new Scanner(System.in);
      Nombre ="";
      System.out.print("Dame el Nombre: ");
      Nombre = entrada.nextLine();
      
      System.out.print("Dame la calificación 1: ");
      calif1 = entrada.nextInt();
      System.out.print("Dame la calificación 2: ");
      calif2 = entrada.nextInt();
      System.out.print("Dame la calificación 3: ");
      calif3 = entrada.nextInt();
      System.out.print("Dame la calificación 4: ");
      calif4 = entrada.nextInt();
    }
        public void calcProm()
    {
        double promedio = (calif1 + calif2 + calif3 + calif4 )/4;
        System.out.println("El promedio de " + Nombre + "es: " + promedio);
    }
 //Métodos get y set   
}
