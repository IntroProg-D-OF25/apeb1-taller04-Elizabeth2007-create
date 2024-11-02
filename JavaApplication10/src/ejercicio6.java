import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        double monto_del_prestamo, interes_mensual, cuota_mensual;
        int numero_de_cuotas =12 ;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingresa el monto del prestamo");
        monto_del_prestamo = Teclado.nextDouble();
        System.out.println("Ingresa el interes mensual cobrar");
        interes_mensual = Teclado.nextDouble()/100;
        cuota_mensual= (monto_del_prestamo * interes_mensual)/(1 - Math.pow(1+ interes_mensual, - numero_de_cuotas));
        System.out.println("El pago mesual que debes realizar por el prestamo es : "+ cuota_mensual);
    }
    
}
/***
 * Ingresa el monto del prestamo
 *500
 *Ingresa el interes mensual cobrar
 *5
 *El pago mesual que debes realizar por el prestamo es : 56.41270501040767
 */
