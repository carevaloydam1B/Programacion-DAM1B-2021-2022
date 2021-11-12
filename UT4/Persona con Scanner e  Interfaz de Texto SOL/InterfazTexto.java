
/**
 * Clase que modela un interfaz de texto
 * para interactuar con el usuario
 * 
 */
import java.util.Scanner;
public class InterfazTexto
{
    private final int COMPLETO = 1;
    private final int NOMBRE = 2;
    private final int EDAD = 3;
    private final int SUELDO = 4;
    private final int ESTADO = 5;
    private Persona persona;
    private Scanner teclado;

    /**
     * Constructor de la clase InterfazTexto
     */
    public InterfazTexto()    {
        teclado = new Scanner(System.in);
        persona = new Persona();
    }

    /**
     *  
     * 
     * @param   
     * @return       
     */
    public void ejecutar()    {
        bienvenida();
        String nombre = leerNombre();
        persona.setNombre(nombre);
        int edad = leerEdad();
        persona.setEdad(edad);
        double sueldo = leerSueldo();
        persona.setSueldo(sueldo);
        char estado = leerEstado();
        persona.setEstado(estado);

        int opcion = mostrarMenu();
        switch (opcion)     {
            case COMPLETO: mostrarDatosCompletos();
            break;
            case NOMBRE: mostrarNombre();
            break;
            case EDAD: mostrarEdad();
            break;
            case SUELDO: mostrarSueldo();
            break;
            case ESTADO: mostrarEstadoCivil();
            break;
        }
        despedida();
    }

    /**
     *   
     * @return   el nombre de una persona leído
     * desde el teclado
     */
    private String leerNombre()    {
        System.out.println("Dame nombre");
        String nombre = teclado.nextLine();
        return nombre;  
    }

    /**
     *   
     * @return   la edad de una persona leída
     * desde el teclado
     */
    private int leerEdad()    {
        System.out.println("Dame edad");
        int edad = teclado.nextInt();
        //teclado.nextLine();
        return edad;  
    }

    /**
     *   
     * @return  el sueldo de una persona leído
     * desde el teclado
     */
    private double leerSueldo()    {
        System.out.println("Dame sueldo");
        double sueldo = teclado.nextDouble();
        teclado.nextLine();
        return sueldo;  
    }

    /**
     *   
     * @return  el estado civil de una persona leído
     * desde el teclado
     */
    private char leerEstado()    {
        System.out.println("Dame estado civil");
        char estado = teclado.nextLine().charAt(0);
        return estado;  
    }

    /**
     * 
     *
     * @param   
     * @return     
     */
    private void bienvenida()    {
        System.out.println("Bienvenido/a a nuestra aplicación");
    }

    /**
     * 
     * @param   
     * @return     
     */
    private void despedida()    {
        System.out.println("Adiós");
    }

    /**
     * 
     * @param   
     * @return     
     */
    private void mostrarDatosCompletos()    {
        System.out.println(persona.toString());
    }

    /**
     * 
     * @param   
     * @return     
     */
    private void mostrarEdad()    {
        System.out.println("Edad:" + persona.getEdad());
    }

    /**
     * 
     * @param   
     * @return     
     */
    private void mostrarNombre()    {
        System.out.println("Nombre:" + persona.getNombre());
    }

    /**
     * 
     * @param   
     * @return     
     */
    private void mostrarSueldo()    {
        System.out.println("Sueldo:" + persona.getSueldo());
    }

    /**
     * 
     * @param   
     * @return     
     */
    private void mostrarEstadoCivil()    {
        System.out.println("Esatdo civil:" + persona.getEstado());
    }

    /**
     * 
     * @param   
     * @return     
     */
    private int mostrarMenu()    {
        borrarPantalla();
        System.out.println("1. Mostrar datos completos");
        System.out.println("2. Mostrar nombre");
        System.out.println("3. Mostrar edad");
        System.out.println("4. Mostrar sueldo");
        System.out.println("5. Mostrar estado civil");
        System.out.print("Introduce opción: ");
        int opcion = teclado.nextInt();
        //teclado.nextLine();
        return opcion;
    }

    /**
     *  Limpiar la pantalla
     *  
     */
    private void borrarPantalla()    {
        System.out.println('\u000C');
    }

}
