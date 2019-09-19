/*
5. Uma loja está fazendo liquidação, vendendo tudo por 40% do preço original. Faça um programa em
Java que calcule o valor do desconto, dado o preço original do produto.
 */
package exercicio5_1;
import java.util.Scanner;

public class Exercicio5_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Preço do produto: R$ ");
        float preco = scanner.nextFloat();
        // 40% = 40/100 = 0,4
        float desconto = (float) (preco * 0.4);
        System.out.println("O desconto do produto é de: R$ " + desconto);
  
    }
    
}
