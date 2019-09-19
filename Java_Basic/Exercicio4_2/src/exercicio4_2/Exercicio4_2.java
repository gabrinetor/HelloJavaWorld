/*
4. Escreva um programa que leia um número entre 1 e 12 e escreva o mês correspondente. 
Ex: Se o número lido for 2, deverá ser mostrado ao usuário “Fevereiro”.
*/
package exercicio4_2;
import java.util.Scanner;

public class Exercicio4_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print(" Digite o Número do Mês:  ");
        int mes = scn.nextInt();
        
        switch(mes){
            
            case 1:
                System.out.println(" Janeiro ");
                break;
            
            case 2:
                System.out.println(" Fevereiro ");
                break;                
                
            case 3:
                System.out.println(" Março ");
                break;
                
            case 4:
                System.out.println(" Abril ");
                break;
                
            case 5:
                System.out.println(" Maio ");
                break;
                
            case 6:
                System.out.println(" Junho ");
                break;
                
            case 7:
                System.out.println(" Julho ");
                break;
                
            case 8:
                System.out.println(" Agosto ");
                break;
                
            case 9:
                System.out.println(" Setembro ");
                break;
                
            case 10:
                System.out.println(" Outubro ");
                break;
                
            case 11:
                System.out.println(" Novembro ");
                break;
                
            case 12:
                System.out.println(" Dezembro ");
                break;                
                
            default:
                System.out.println( " Esse mês não existe ! " );
                break;
        }
    }
    
}
