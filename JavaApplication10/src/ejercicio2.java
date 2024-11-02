
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        //BLOQUE DE DECLARACION DE VARIABLES
        double gastohijo1, gastohijo2, gastohijo3, totalGastos;
        Scanner teclado = new Scanner(System.in);
        //BLOQUE DE LECTURA DE DATO DE ENTRADA 
        System.out.println("DAME GASTOS DEL HIJO 1");
        gastohijo1 = teclado.nextDouble();
        System.out.println("DAME GASTOS DEL HIJO 2 ");
        gastohijo2 = teclado.nextDouble();
        System.out.println("DAME GASTOS DEL HIJO 3");
        gastohijo3 = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO 
        totalGastos = gastohijo1+ gastohijo2+ gastohijo3;
        //BLOQUE DE SALIDA DE RESULTADOS
        System.out.println("Gasto totales" + totalGastos);                      
        
        c
    }
}
/***
 * run:
DAME GASTOS DEL HIJO 1
80
DAME GASTOS DEL HIJO 2 
56
DAME GASTOS DEL HIJO 3
20
Gasto totales156.0
 */