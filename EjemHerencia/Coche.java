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
public class Coche extends Vehiculo
{
    //Atributo
    private int noCilindros;
    
    //Métodos
    public Coche(Color color, int NumSerie, int noCil)//métodos
    {
        super(color, NumSerie);
        this.noCilindros = noCil;
    }
    
    public int noCilindros()
    {
         return noCilindros;
    }
    
    public void cambiaCilindros(int c)
    {
         this.noCilindros = c;
    }
    
    @Override
    public String toString()
    {
      return super.toString() + " Número de Cilindros = " + noCilindros;
    }
}
