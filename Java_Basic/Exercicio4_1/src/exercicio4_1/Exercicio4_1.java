/*
4. Calcular e mostrar o valor do perímetro de um retângulo dado o valor dos dois lados. 
O perímetro do retângulo é calculado pela fórmula: 
    perimetroRetangulo = 2*lado1 + 2*lado2
 */
package exercicio4_1;
import java.util.Scanner;

public class Exercicio4_1 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lado 1: ");
        float lado1 = scn.nextFloat();
        System.out.print("Lado 2: ");
        float lado2 = scn.nextFloat();
        float perimetroRetangulo = 2*lado1 + 2*lado2;
        System.out.println("O Perímetro do Retângulo é: " + perimetroRetangulo);
    }
    
}
