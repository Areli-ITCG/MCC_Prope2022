package ejemheredado;

/**
 *
 * @author areli
 */
public class EjemHeredado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //enum es una clase estÃ¡tica y estÃ¡ declarada en vehÃ­culo
        
        Vehiculo objvehiculo = new Vehiculo(Vehiculo.Color.AZUL, 47965);
        Coche objcoche = new Coche(Vehiculo.Color.ROJO, 123054, 4);
        Vehiculo objeto = new Barco(Vehiculo.Color.VERDE, 56479);
        
        Vehiculo nose; //Reserva el espacio en memoria para el objeto
        nose = new Avion(Vehiculo.Color.AZUL, 156987, 35.2);
                
        System.out.println(objvehiculo.toString());
        System.out.println(objcoche.toString());
        System.out.println(objeto.toString());
        System.out.println(nose.toString()); 
    }
    
}
