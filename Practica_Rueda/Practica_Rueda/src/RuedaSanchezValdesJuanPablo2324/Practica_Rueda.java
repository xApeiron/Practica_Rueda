
package RuedaSanchezValdesJuanPablo2324;

/**
 * La clase Practica_Rueda contiene métodos estáticos para simular viajes y rellenar un depósito de combustible.
 * Cada método representa una acción específica relacionada con un objeto de la clase Rueda.
 */
public class Practica_Rueda {

    /**
     * Método principal que crea una instancia de la clase Rueda.
     * 
     * 
     */
    public static void main(String[] args) {
    
        
        Rueda rueda = new Rueda(40,2,50);
        
        viaje1_SanchezValdesJuanPablo(rueda);
        
        viaje2_SanchezValdesJuanPablo(rueda);
        
        viaje3_SanchezValdesJuanPablo(rueda);
        
        
        rellenar1_SanchezValdesJuanPablo(rueda);
        
        rellenar2_SanchezValdesJuanPablo(rueda);
         
    }
/**
     * Método estático para simular el proceso de rellenar el depósito de combustible con una cantidad específica de litros y dinero.
     * 
     * @param rueda La instancia de la clase Rueda cuyo depósito de combustible se va a rellenar.
     */
    private static void rellenar2_SanchezValdesJuanPablo(Rueda rueda) {
        //Vamos a rellenar el depósito con muchos litros y un dinero
        try{
            System.out.println("Vamos a intentar rellenar el depósito con muchos litros y un dinero.");
            rueda.rellenar(100,40);
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
        }catch(Exception e){
            System.out.println("No se ha podido rellenar el deposito" + e);
        }
    }
/**
     * Método estático para simular el proceso de rellenar el depósito de combustible con una cantidad específica de litros y dinero.
     * 
     * @param rueda La instancia de la clase Rueda cuyo depósito de combustible se va a rellenar.
     */
    private static void rellenar1_SanchezValdesJuanPablo(Rueda rueda) {
        //Vamos a rellenar el depósito con unos cuantos litros y un dinero
        try{
            System.out.println("Vamos a intentar rellenar el depósito con unos litros y un dinero.");
            rueda.rellenar(10,40);
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
        }catch(Exception e){
            System.out.println("No se ha podido rellenar el deposito" + e);
        }
    }
/**
     * Método estático para simular un tercer viaje con la instancia de la clase Rueda especificada.
     * 
     * @param rueda La instancia de la clase Rueda con la que se realizará el viaje numero 3.
     */
    private static void viaje3_SanchezValdesJuanPablo(Rueda rueda) {
        //Vamos a intentar realizar un viaje y recorrer muchos kilómetros
        try{
            System.out.println("Vamos a intentar hacer un viaje y recorrer unos kilometros.");
            rueda.viaje(800);
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
        }catch(Exception e){
            System.out.println("Error al hacer el viaje" + e);
        }
    }
/**
     * Método estático para simular un segundo viaje con la instancia de la clase Rueda especificada.
     * 
     * @param rueda La instancia de la clase Rueda con la que se realizará el viaje numero dos.
     */
    private static void viaje2_SanchezValdesJuanPablo(Rueda rueda) {
        //Vamos a intentar realizar un viaje, con un kilometros en negativo
        
        try{
            System.out.println("Vamos a intentar hacer un viaje y recorrer unos kilometros.");
            rueda.viaje(-80);
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
        }catch(Exception e){
            System.out.println("Error al hacer el viaje" + e);
        }
    }
/**
     * Método estático para simular un primer viaje con la instancia de la clase Rueda especificada.
     * 
     * @param rueda La instancia de la clase Rueda con la que se realizará el viaje numero uno.
     */
    private static void viaje1_SanchezValdesJuanPablo(Rueda rueda) {
        //Vamos a intentar realizar un viaje y recorreremos unos kilomentros
        
        try{
            System.out.println("Vamos a intentar hacer un viaje y recorrer unos kilometros.");
            rueda.viaje(80);
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
        }catch(Exception e){
            System.out.println("Error al hacer el viaje" + e);
        }
    }
    
}
