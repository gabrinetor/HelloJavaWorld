/*
1. Ler um número e determinar se ele é maior ou igual ou menor do que zero
 */
package exercicio1_2;
import java.util.Scanner;

public class Exercicio1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num = scanner.nextFloat();
        
        if(num > 0)
            System.out.println( num + " é maior que zero! " );
        else if(num == 0)
            System.out.println( num + " é igual a zero! " );
        else if(num < 0)
            System.out.println( num + " é menor que zero! " );

    }
    
}
