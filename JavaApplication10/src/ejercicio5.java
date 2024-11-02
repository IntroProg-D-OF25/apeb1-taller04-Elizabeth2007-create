import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        float costo_CPU, costo_pantalla, costo_teclado, costo_raton, costo_total;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingresa el costo del CPU");
        costo_CPU = Teclado.nextFloat();
        System.out.println("Ingresa el costo de la pantalla ");
        costo_pantalla = Teclado.nextFloat();
        System.out.println("Ingresa el costo del teclado ");
        costo_teclado = Teclado.nextFloat();
        System.out.println("Ingresa el costo del ratón "); 
        costo_raton = Teclado.nextFloat();
        costo_total = costo_CPU + costo_pantalla + costo_raton ;
        System.out.println("El costo total es :" + costo_total );
       
    }
}
            
/***
 *   Ingresa el costo del CPU
 * 50
 *Ingresa el costo de la pantalla 
 *40
 *Ingresa el costo del teclado 
 *20
 *Ingresa el costo del rat�n 
 *12
 *El costo total es :102.0
 */