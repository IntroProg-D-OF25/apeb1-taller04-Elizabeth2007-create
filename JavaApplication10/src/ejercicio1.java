import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        //BLOQUE DECLARACION DE VARIABLES  -> DATOS DE ENTRADA Y SALIDA 
        double baseTriag, alturaTriag, areaTriag;
        Scanner teclado = new Scanner(System.in); //Para leer valores desde consola
  
        //BLOQUE DE LECTURA DE DATOS DE ENTRADA 
        System.out.println("DAME LA BASE DEL T.:");
        baseTriag = teclado.nextDouble();
        System.out.println("DAME LA ALTURA DEL T.:");
        alturaTriag = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA LEIDOS
        areaTriag = (baseTriag * alturaTriag)/2;
        //BLOQUE DE SALIDA RESULTADO 
        System.out.println("Area del t. -"+areaTriag);
    }
            
    
}
/***
 * run:
DAME LA BASE DEL T.:
8
DAME LA ALTURA DEL T.:
5
Area del t. -20.0
 */
