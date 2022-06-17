/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemheredado;
//Clase que representa un vehículo cualquiera
/**
 *
 * @author areli
 */
public class Vehiculo 
{
    //colores con los que se puede pintar un vehículo
    public static enum Color {ROJO, VERDE, AZUL}
    //Declaración de Atributos
    private Color color;
    private int numSerie;
    
    /**
     * Construye un vehículo
     * Solicitar el color y el número de serie
     * 
     */
    public Vehiculo(Color color, int numSerie)
    {
        this.color = color;
        this.numSerie = numSerie;
    }
    
    /*Retorna el color del Vehículo*/
    public Color color()
    {
        return color;
    }
    
    /*Retorna el Número de serie*/
    public int numSerie()
    {
         return numSerie;
    }
    
    public void pinta(Color c)
    {
        color = c;
    }
    
    @Override
    public String toString(){
     return "Vehiculo -> Número de Serie = " + numSerie + "tiene el color = " + color;
    }
}
