/*
3. Calcular e mostrar o valor da área de um retângulo dado o valor dos dois lados. 
A área do retângulo é calculada pela fórmula:
    areaRetangulo = lado1 * lado2
*/
package exercicio3_1;
import java.util.Scanner;

public class Exercicio3_1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lado 1: ");
        float lado1 = scanner.nextFloat();
        System.out.print("Lado 2: ");
        float lado2 = scanner.nextFloat();
        
        float areaRetangulo = lado1 * lado2;
        System.out.println("A área do Retangulo é: " + areaRetangulo + "m²");
   
    }
    
}
