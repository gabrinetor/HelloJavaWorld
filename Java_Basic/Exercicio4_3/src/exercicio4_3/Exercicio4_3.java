/*
4. Calcular a média de 10 números informados pelo usuário.
 */
package exercicio4_3;
import java.util.Scanner;

public class Exercicio4_3 {

    public static void main(String[] args) {
        int i = 0, total = 0;
	Scanner scanner = new Scanner(System.in);
	
	for(i = 0 ; i<10 ; i++) 
	{

	System.out.print( " Digite um numero: " );
	int num = scanner.nextInt();
	total = total + num;
	}
	
	float media = total/10;
	System.out.println( " " );
	System.out.println ( " A média é: " + media );
    }
    
}
