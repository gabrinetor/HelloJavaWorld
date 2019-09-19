/*
5. Escreva um programa que leia 4 números e exiba qual o menor deles.
*/
package exercicio5_2;
import java.util.Scanner;

public class Exercicio5_2 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        
        System.out.print(" Numero 1 : ");
        int num1 = scn.nextInt();
        
        System.out.print(" Numero 2 : ");
        int num2 = scn.nextInt();
                
        System.out.print(" Numero 3 : ");
        int num3 = scn.nextInt();
                
        System.out.print(" Numero 4 : ");
        int num4 = scn.nextInt();
        
        if ( num1 < num2 && num1 < num3 && num1 < num4 ){
            System.out.println(" O número " + num1 + " é o menor número. ");
        }
        
        else if ( num2 < num1 && num2 < num3 && num2 < num4 ){
            System.out.println(" O número " + num2 + " é o menor número. ");
        }
        
        else if ( num3 < num1 && num3 < num2 && num3 < num4 ){
            System.out.println(" O número " + num3 + " é o menor número. ");
        }
        
        else if ( num4 < num1 && num4 < num2 && num4 < num3 ){
            System.out.println(" O número " + num4 + " é o menor número. ");
        }
        
        else{
            if( (num1==num2) || (num1==num3) || (num1==num4) || (num2==num3) || (num2==num4) || (num3==num4) ){
                    System.out.println("Devem ser inseridos 4 numeros diferentes");
            }
            //
      
        }
    }
    
}
