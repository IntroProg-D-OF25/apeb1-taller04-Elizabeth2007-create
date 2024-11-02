import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        double costo_kilovatios, numero_kilovatios_consumidos, valor_planilla;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese el cosro por kilovatio/hora");
        costo_kilovatios = Teclado.nextDouble();
        System.out.println("Ingresa  el número de  kilovatios consumidos al mes ");
        numero_kilovatios_consumidos = Teclado.nextDouble();
        valor_planilla = (costo_kilovatios * numero_kilovatios_consumidos);
        System.out.println("El valor a cancelar de la planila de luz es :"+ valor_planilla);
        System.out.println("Si usted es mayor a 65 años,se le descontara el 10%");
    }
  
}
/***
 * Ingrese el cosro por kilovatio/hora
 *20
 *Ingresa  el n�mero de  kilovatios consumidos al mes 
 *2000
 *El valor a cancelar de la planila de luz es :40000.0
 *Si usted es mayor a 65 a�os,se le descontara el 10%
 */
