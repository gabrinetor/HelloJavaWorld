
package montadora;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        
        //Lista de peças
        ArrayList<Peca> pecas = new ArrayList();
        
        //Armazenar dados de entrada
        Scanner scnInt = new Scanner(System.in);
        Scanner scnString = new Scanner(System.in);
        int opcao;
        
        //LOOP enquanto a opção for diferente de 5 (5=sair)
        do{
            //Tratamento de erro
            try{
                System.out.println( "Digite:\n" + "1) Cadastrar Peça\n" + 
                        "2) Buscar Peça\n" + "3) Excluir Peça\n" + 
                        "4) Listar Peças\n" + "5) Sair");
                opcao = scnInt.nextInt();   //inserir opção
                
                switch(opcao){
                    
                    //Cadastrar
                    case 1:
                        boolean erro = false;
                        do{
                            System.out.println("Digite: \n" + 
                                    "1) Cadastrar Peça de Carro \n" + 
                                    "2) Cadastrar Peça de Moto");
                            int opcaoCadastrar = scnInt.nextInt();
                            
                            //Cadastrar Carro
                            if( opcaoCadastrar == 1 ){
                                System.out.println("Digite o nome e o valor da peça");
                                String nome = scnString.nextLine();
                                float valor = scnInt.nextFloat();
                                System.out.println("Essa peça tem marca: \n1) Sim \n2) Não");
                                opcaoCadastrar = scnInt.nextInt();
                                
                                //Cadastrar peça com marca
                                if ( opcaoCadastrar == 1 ){
                                    System.out.print("Digite a marca: ");
                                    String marca = scnString.nextLine();
                                    Carro pc = new Carro( marca , nome , valor ); //peça carro
                                    pecas.add(pc);
                                    erro = false;
                                }
                                
                                //Cadastrar peça sem marca {N/A}
                                else if ( opcaoCadastrar == 2 ){
                                    Carro pc = new Carro(nome, valor);
                                    pecas.add(pc);
                                    erro = false;
                                }
                                
                                //Opção inválida
                                else{
                                    System.out.println("Opção inválida, tente novamente...");
                                    erro = true;
                                }
                            }
                            
                            //Cadastrar Moto
                            else if( opcaoCadastrar == 2 ){
                                System.out.println("Digite o nome, valor e ano da peça, respectivamente.");
                                String nome = scnString.nextLine();
                                float valor = scnInt.nextFloat();
                                int ano = scnInt.nextInt();
                                Moto pm = new Moto( nome , valor , ano ); //peça moto
                                pecas.add(pm);
                                erro = false;
                            }
                            
                            //Opção inválida
                            else{
                                System.err.println("Você digitou uma opção inválida, tente novamente... ");
                                erro = true;
                            }
                            
                        }while (erro == false);
                        
                        break;
                    
                    //Buscar    
                    case 2:
                        if(!pecas.isEmpty()){   //validar se a lista não está vazia
                            System.out.print("Digite o nome da peça que deseja procurar: ");
                            String peca = scnString.nextLine();
                            boolean encontrou = false;  //inicializar variavel que valida se encontrou a resposta
                            
                            for ( Peca p : pecas ) {
                                if(p.getNome().equals(peca)){
                                    System.out.println("O valor da peça " + peca + " é: R$ " + p.getValor());
                                    encontrou = true;
                                }
                            }
                            if (!encontrou){    //se não enccontrou (false) , passou pelo true e ficou negativo 
                                System.out.println("Peça não encontrada");
                            }
                            
                        }
                        
                        else {  //se a lista está vazia
                            System.out.println("Nenhuma peça cadastrada");
                        }
                        break;
                        
                    //Excluir
                    case 3:
                        if(!pecas.isEmpty()){
                            System.out.print("Digite o nome da peça a ser excluída: ");
                            String excluir = scnString.nextLine();
                            boolean existe = false;    //inicializando a bolean pra verificar se peça existe
                            
                            for( Peca p : pecas ){
                                if(p.getNome().equals(excluir)){
                                    pecas.remove(p);
                                    existe = true;
                                    break;
                                }
                            }
                            if (!existe) {     //se não existe
                                System.out.println("Peça não existe");
                            }
                        }
                        
                        else {
                            System.out.println("Nenhuma peça cadastrada");
                        }
                        break;
                        
                    //Listar 
                    case 4:
                        if(!pecas.isEmpty()) {  //validar se a lista não está vazia
                            for ( Peca c : pecas ) {  //foreach enquanto percorre a lista  
                                c.dados();  //chama os métodos sobrescritos herdados
                            }
                        }
                        else{
                            System.out.println("Nenhuma peça cadastrada");
                        }
                        break;
                        
                    //Sair
                    case 5:
                        System.out.println("Saindo...");
                        break;
                        
                    //Opção Inválida    
                    default:
                        System.out.println("Opção inválida, tente novamente...");
                        
                }
                
            }
            
            //Tratamento de erro: se o digitado foi diferente dos contidos no switch
            catch(InputMismatchException e){
                System.err.println("Você digitou um tipo de dado incompatível, tente novamente");
                scnInt.nextInt();
                opcao = 0;
            }
            
        }while(opcao != 5);     //opçao 5 = sair
        
    }
    
}
