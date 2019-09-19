/*
2. Calcular a idade de uma pessoa, sabendo-se o ano de nascimento.
 */
package exercicio2_1;
import java.util.Scanner;

public class Exercicio2_1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Em qual ano você nasceu? ");
        int ano = scn.nextInt();
        int idade = 2019 - ano; 
        System.out.println("Sua idade é " + idade);
    }
    
}
