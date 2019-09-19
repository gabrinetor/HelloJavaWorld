/*
2. Faça um programa que leia o índice de massa corporal (IMC) de uma pessoa. Se o valor do IMC for
maior do que 25,0 deverá ser exibida a mensagem “Você está acima do peso!”. Caso contrário exiba
a mensagem “Você está saudável!”.
 */
package exercicio2_2;
import java.util.Scanner;

public class Exercicio2_2 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite seu índice de massa corporal (IMC): ");
        float imc = scn.nextFloat();
        
        if( imc > 25.0 )
            System.out.println( " Você está acima do peso! " );
        else
            System.out.println( " Você está saudável " );
    }
    
}
