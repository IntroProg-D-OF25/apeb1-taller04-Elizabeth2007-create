import java.util.Scanner;
public class ejrcicio9 {
    public static void main(String[] args) {
    double ancho_rectangulo, largo_rectangulo, area_poligono;
    Scanner Teclado = new Scanner(System.in);  
        System.out.println("Ingresa el ancho del rectangulo");
        ancho_rectangulo = Teclado.nextDouble();
        System.out.println("Ingresa el largo  del rectangulo");
        largo_rectangulo = Teclado.nextDouble();
        area_poligono = (((ancho_rectangulo * largo_rectangulo)/2)*3) + (ancho_rectangulo * ancho_rectangulo) + (ancho_rectangulo * largo_rectangulo);
        System.out.println("El área del poligono es : " + area_poligono);
        
        
    }
  
   

   
}
/***
 * Ingresa el ancho del rectangulo
 *8
 *Ingresa el largo  del rectangulo
 *5
 *El �rea del poligono es : 164.0
 */
