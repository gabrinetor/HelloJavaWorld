
package Empresinha;

public class TrabM1 {

    public static void main(String[] args) {
        
        // instanciar objeto
        Empresa empresa = new Empresa();
        
        //nome do funcionario
        empresa.setNome("NOME");
        empresa.getNome();
        
        //cadastrar 2 funcionarios
        empresa.cadastraFuncionario("fulano", 9, 4);
        empresa.cadastraFuncionario("sicrano", 5, 8);
        
        //exibirFuncionario
        empresa.exibeFuncionarios();
        
        //calcula o salario do 2º funcionario cadastrado
        empresa.cadastraFuncionario("sicrano", 5, 8);
        System.out.println(empresa.calculaSalario(1));
        
    }
    
}
