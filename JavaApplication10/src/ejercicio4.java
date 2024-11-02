import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
     float costo_por_minuto, costo_planilla;
     int minutos_consumidos_mes;
     Scanner Teclado = new Scanner(System.in);
        System.out.println(" Ingrese el costo por minuto ");
        costo_por_minuto = Teclado.nextFloat();
        System.out.println("Ingrese  minutos consumidos en el mes  ");
        minutos_consumidos_mes = Teclado.nextInt();
        costo_planilla = (costo_por_minuto * minutos_consumidos_mes);
        System.out.println ("El costo de la planilla del telefono es :" + costo_planilla  );
        
    }
    
}
/***
 * Ingrese el costo por minuto 
 *1,10
 *Ingrese  minutos consumidos en el mes  
 *30
 *COSTO PLANILLA  :33.0
 */
