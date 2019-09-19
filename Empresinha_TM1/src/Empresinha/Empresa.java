
package Empresinha;
import java.util.Scanner;

public class Empresa {
    
    Scanner scn = new Scanner(System.in);

    private String nome;
    private Empregado funcionarios[] = new Empregado[10];
    private int contFunc = 0;
    
    //objeto empregado

   
    //nome da empresa 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //cadastrar funcionario
    public void cadastraFuncionario(String nomeF, int cargaH, float valorH){
        Empregado empregado = new Empregado();
        
        empregado.setCargaHoraria(cargaH);
        empregado.setValorHora(valorH);
        empregado.setNome(nomeF);

        //empregado recebe valor atual do conteador de funcionarios
        empregado.setId(contFunc);
        
        //adicionar objeto empregado no vetor de empregados 
        funcionarios[contFunc] = empregado;
        
        //incrementa contador de funcionarios
        contFunc++;
    }
    
    public float calculaSalario(int id){
        return funcionarios[id].getCargaHoraria() * funcionarios[id].getValorHora();
        
    }
    
    //exibe informações dos funcionarios 
    public void exibeFuncionarios(){
        for (int i=0 ; i<contFunc ; i++){
            System.out.println( funcionarios[i].getNome() );
            System.out.println( funcionarios[i].getId() );
            System.out.println( funcionarios[i].getCargaHoraria() );
            System.out.println( funcionarios[i].getValorHora() );            
        }
    }
    
}
