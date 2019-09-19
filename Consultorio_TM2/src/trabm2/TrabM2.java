package trabm2;

import java.util.Scanner;

public class TrabM2 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);   //int
        Scanner entradaDados = new Scanner(System.in);  //String
        
        Consultorio c = new Consultorio();
        
        int opcao;
    
        //referencia para a classe paciente
        Paciente p;
        
        String nomePaciente, diagnostico;
        int numeroAtendimento;
        
            do{
                
            exibirMenu();
            opcao = scn.nextInt();
            
            switch(opcao){
                
                // Cadastrar
                case 1:

                        System.out.print("Nome do Paciente: ");
                        nomePaciente = entradaDados.nextLine();
                        
                        System.out.print("Numero de Atendimento: ");
                        numeroAtendimento = scn.nextInt();

                        System.out.print("Diagnóstico: ");
                        diagnostico = entradaDados.nextLine();

                        //objeto da classe 
                        p = new Paciente(nomePaciente, numeroAtendimento, diagnostico);

                        //guardar no ArrayList
                        c.cadastrar(p);

//                    }
                    break;
                    
                // Listar    
                case 2:                  
                    System.out.println( c.mostrar() );
                    break;
                    
                // Pesquisar por Nome
                case 3:
                    System.out.println("Digite o nome: ");
                    nomePaciente = entradaDados.nextLine();
                                        
                    System.out.println(c.pesquisarNome(nomePaciente));
                    break;
                    
                // Pesquisar por Numero
                case 4:
                    System.out.println("Digite o numero: ");
                    nomePaciente = entradaDados.nextLine();
                                        
                    System.out.println(c.pesquisarNome(nomePaciente));
                    break;
                    
                // Excluir
                case 5:
                    
                    System.out.println("Digite o nome: ");
                    nomePaciente = entradaDados.nextLine();
                    
//                    if( (nomePaciente.contains(p.getNomePaciente())) && (! (Consultorio.getListaPacientes().isEmpty()) )){ //se a lista não estiver vazia

                    if( ! Consultorio.getListaPacientes().isEmpty() ){   //validar se não está vazio
                    
                        try{
                            c.excluir(nomePaciente);
                        }
                    
                        catch(Exception e){
                            System.err.println("Nome não encontrado!");
                        }
                    
                        finally{
                            System.out.println("Paciente" + nomePaciente + " removido com sucesso!!");
                        }
                        
                    }else{  //senão Lista estará vazia
                        System.err.println("Não existem pacientes cadastrados!");
                    }
                    
                    break;
                
                //sair
                case 6:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.err.println("Opção inválida!");
                    break;
                    
            }
            
        }while( opcao != 6 );
       
        
    }
    
    static public void exibirMenu(){
        
        System.out.println("=== CONSULTORIO ==="
                + "\n==================\n" +      
                " \n=== PACIENTE ===\n "
                + "1 - CADASTRAR PACIENTE \n" 
                + "2 - MOSTRAR PACIENTES \n" 
                + "3 - PESQUISAR POR NOME DE PACIENTE \n"
                + "4 - PESQUISAR POR NUMERO \n" 
                + "5 - EXCLUIR \n" 
                + "6 - SAIR \n");
        
        System.out.println("==================\n"
                + "\n === MÉDICO === \n"
                + "1 - CADASTRAR MEDICO \n" 
                + "2 - MOSTRAR MEDICO \n"
                + "3 - PESQUISAR POR NOME DE MEDICO \n"
                + "4 - PESQUISAR POR CRM \n"
                + "5 - EXCLUIR \n"
                + "6 - SAIR \n");
        
        System.out.println("==================\n"
                + "\n === SECRETARIA === \n"
                + "1 - CADASTRAR SECRETARIA \n" 
                + "2 - MOSTRAR FUNCIONARIOS ATENDENTES \n"
                + "3 - PESQUISAR POR NOME DE ATENDENTE \n"
                + "4 - PESQUISAR POR ID DE ATENDENTE \n"
                + "5 - EXCLUIR \n"
                + "6 - SAIR \n");

        System.out.println("Escolha uma opção: ");
        
    }
        
}
    

