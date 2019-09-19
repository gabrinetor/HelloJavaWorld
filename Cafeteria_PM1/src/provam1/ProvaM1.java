
package provam1;
import java.util.Scanner;

public class ProvaM1 {

    public static void main(String[] args) {
                
        Scanner scn = new Scanner(System.in);
        Cafeteria c = new Cafeteria();
        c.setNome("FADERGS");
        c.mostrarNome();
        
        
        for (int i =0; i<5; i++){
            System.out.println("Digite " + (i+1) + "º sabor");
            c.setSabores(i, scn.next());
            System.out.println("Digite " + (i+1) + "º valor");
            c.setValores(i, scn.nextFloat());
        }
        
        c.listarSaboresEValores();
        
        
        Cafe c1 = new Cafe();
        
        System.out.println("Qual café vc quer???");
        int cafe = scn.nextInt();
        System.out.println("Qual a quantide???");
        int qtd = scn.nextInt();
       
       //acessando o sabor na cafeteria
       String sabor = c.getSabores(cafe-1);
       //coloco o sabor no cafe
       c1.setSabor(sabor);
       
        //acessando o valor do sabor solicitado na cafeteria
       float valor = c.getValores(cafe-1);
       //coloco o valor no cafe
       c1.setValor(valor);
       
       //coloco a qtd no cafe
       c1.setQtd(qtd);
       
       
       c1.fecharCafe();
    }
    
}
