/*
1. Calcular e mostrar a metade de um número.
 */

package exercicio1_1;
import java.util.Scanner;

public class Exercicio1_1 {

    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
	
	System.out.print("Digite um numero: ");

	int num = scn.nextInt();

	float metade = num / 2;

	System.out.println( "A metade de " + num + " é " + metade );

    }
    
}
