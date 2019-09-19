package exercicio_tabuleiro;

import java.util.Scanner;

public class Exercicio_Tabuleiro {

    public static void main(String[] args) {

        Tabuleiro t = new Tabuleiro();
        t.inicializar();
        t.mostrar();
        String s = "";
        Scanner scn = new Scanner(System.in);
        System.out.println("Use as teclas A,S,W,Z para andar no tabuleiro ou Q para sair" 
                + "\n      W" 
                + "\n  < A   S >" 
                + "\n      Z");
            
        // enquanto estiver mostrando o tabuleiro, e não digitar a letra "q" = quit..
        while (!(s.equals("q"))) {
            s = scn.next(); //insira a letra para movimentar o bit 1
            s = s.toLowerCase(); //transforma letra maiuscula em minuscula
            
                switch (s) {
                    
                    case "w":
                        t.cima();
                        break;
                        
                    case "a":
                        t.esquerda();
                        break;
                    
                    case "z":
                        t.baixo();
                        break;
                        
                    case "s":
                        t.direita();
                        break;
                        
                    case "q":
                        System.out.println("Saindo...");
                        break;
                        
                    default:
                        System.out.println("Tecla inválida");
                        
            }
                
        }
        
    }
    
}
