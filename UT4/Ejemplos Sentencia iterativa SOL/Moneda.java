
/**
 *  
 * Clase que representa a una moneda con una cara
 */
public class Moneda
{
     
    private boolean cara;

    /**
     * Constructor  
     */
    public Moneda()
    {
         cara = true;
    }

    /**
     *  
     *  Simula el lanzamiento de la moneda
     *  Se genera un nº aleatorio, si es 0 suponemos cara, si es 1 suponemos cruz
     * 
     */
    public void tirar()
    {
         cara = ( (int) (Math.random() * 2) == 0);
    }
    
    /**
     * 
     */
    public  boolean esCara()
    {
        return cara;
    }

}
