/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemheredado;

/**
 *
 * @author areli
 */
public class Avion extends Vehiculo
{
    //Atributos
    private double pesoton;
    
    //métodos
    public Avion(Color color, int NumSerie, double pesoton)
    {
        super(color, NumSerie);
        this.pesoton = pesoton;
    }
    
    public double pesoton()
    {
        return pesoton;
    }
    
    public void cambiapesoton(double peso)
    {
        this.pesoton = peso;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " peso en toneladas = " + pesoton;
    }
    
}
