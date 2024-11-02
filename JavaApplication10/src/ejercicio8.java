import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        double costo_netflix, costo_youtubepremium, costo_dropox, costo_spotify, valor_total;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingresa el costo mensual del servicio netflix ");
        costo_netflix = Teclado.nextDouble();
        System.out.println("Ingresa el costo mensual del servicio  youtube premiun ");
        costo_youtubepremium = Teclado.nextDouble();
        System.out.println("Ingresa el costo mensual del servicio  dropox");
        costo_dropox = Teclado.nextDouble();
        System.out.println("Ingrese el costo mesual del servicio spotify ");
        costo_spotify = Teclado.nextDouble();
        valor_total = (costo_netflix + costo_youtubepremium + costo_dropox + costo_spotify);
        System.out.println("El valor total a pagar mensualmente por los servicios es :"+ valor_total);
        
    }
}
/***
 * Ingresa el costo mensual del servicio netflix 
 *10
 *Ingresa el costo mensual del servicio  youtube premiun 
 *3
 *Ingresa el costo mensual del servicio  dropox
 *5
 *Ingrese el costo mesual del servicio spotify 
 *4
 *El valor total a pagar mensualmente por los servicios es :22.0
 */