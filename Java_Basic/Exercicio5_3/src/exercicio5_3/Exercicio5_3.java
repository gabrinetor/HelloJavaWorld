/*
5. Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
 */

package exercicio5_3;
import java.util.Scanner;

public class Exercicio5_3 {

    public static void main(String[] args) {
        
	Scanner scn = new Scanner(System.in);
	int idade, qd_maiores = 0;

	for ( int i=0 ; i<20 ; i++ ){
	   
	   System.out.print( " Qual sua idade? " );
	   idade = scn.nextInt();
	   
	   if ( idade >= 18 )
		qd_maiores++;
		
	}
		

	   System.out.println( " Quantidade de pessoas maiores de idade: " + qd_maiores );

    }
    
}
