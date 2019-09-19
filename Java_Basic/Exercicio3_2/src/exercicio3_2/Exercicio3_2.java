/*
3. Escreva um programa para ler o nome de dois times de futebol e o número de gols marcados por
cada time na partida. O programa deve imprimir o nome do time vencedor. Caso não haja vencedor
deverá ser impresso EMPATE.
 */
package exercicio3_2;
import java.util.Scanner;

public class Exercicio3_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Time 1 -> ");
        String time1 = scn.nextLine();
        System.out.print("Time 2 -> ");
        String time2 = scn.nextLine();
        
        System.out.print( "Gols do " + time1 + ": " );
        int gols1 = scn.nextInt();
        System.out.print( "Gols do " + time2 + ": " );
        int gols2 = scn.nextInt();
        
        if( gols1 != gols2 ){
            if( gols1 > gols2 ){
                System.out.println( " O time vencedor é: " + time1 + " com " + gols1 + " gols ! ");
            }else if ( gols1 < gols2 ){
                System.out.println(" O time vencedor é: " + time2 + " com " + gols2 + " gols ! ");
            }
        }else{
            System.out.println( " EMPATE ! " );
        }
    }
    
}
