/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemcalculadora;
import java.util.Scanner;

/**
 *
 * @author areli
 */
public class EjemCalculadora {

    public static boolean isNumeric(String cadena)
    {
        //Valida que sea un nÃºmero
        cadena = cadena.trim();
        try{
            Integer.parseInt(cadena);
            return true;
        }
        catch(NumberFormatException nf)
        {
            return false;
        }
    }
    
    public static int menu()
    {
      Scanner entrada = new Scanner(System.in);
      String ent=" ";
      int opc = 0;
        System.out.println(" M  E  N  U  ");
        System.out.println("1.- SUMA");
        System.out.println("2.- RESTA");
        System.out.println("3.- MULTIPLICACION");
        System.out.println("4.- DIVISION");
        System.out.println("5.- SALIR");
        System.out.println("Elige una opcion: ");
        do{
            ent = entrada.nextLine();
         }while(!isNumeric(ent));
        opc = Integer.parseInt(ent);
        return opc;
    }
    
    public static void sumar()
    {
     String ent = " ";
     Scanner entrada = new Scanner(System.in);
     System.out.println("Dame el primer numero: ");
     do{
            ent=entrada.nextLine(); 
        } while (!isNumeric(ent));
     int num1 = Integer.parseInt(ent);
     
     System.out.println("Dame el segundo numero: ");
     do{
            ent=entrada.nextLine(); 
        } while (!isNumeric(ent));
     int num2 = Integer.parseInt(ent);
     
     System.out.println("El resultado de la suma es:  " + (num1+num2));
    }
            
    public static void main(String[] args) 
    {
        int opc = 0;
        do{
            opc = menu();
            switch(opc)
            {
                case 1: sumar();
                       break;
               //case 2: resta();
                       //break;
                default: System.out.println("OpciÃ³n NO vÃ¡lida");
            }
        }while(opc!=5);
        
        
    }
    
}
