/*
6. Um cliente de supermercado fez uma compra de 20 itens. Leia o preço de 
cada item e calcule o total que a pessoa vai pagar.
 */
package exercicio6_3;
import java.util.Scanner;
        
public class Exercicio6_3 {

    public static void main(String[] args) {
        
	Scanner scn = new Scanner(System.in);	
        float soma = 0, preco;
        
	for ( int i=0; i<=20; i++ ) {
		
		System.out.print( " Preco do produto: " );
		preco = scn.nextFloat();
		soma += preco;
	}
	
		System.out.println ( " Total a pagar: R$ " + soma );
	
    }
	
}
