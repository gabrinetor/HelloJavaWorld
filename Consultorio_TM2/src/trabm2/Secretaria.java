
package trabm2;

public class Secretaria extends Funcionario {
    
    private int idSecretaria;
    private String nomeSecretaria;

    /*public Secretaria(String nomeClinica, String telefone, float salario, float cargahoraria, float horasTrabalhadas) {
        super(nomeClinica, telefone, salario, cargahoraria, horasTrabalhadas);
    }*/

    public int getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    public String getNomeSecretaria() {
        return nomeSecretaria;
    }

    public void setNomeSecretaria(String nomeSecretaria) {
        this.nomeSecretaria = nomeSecretaria;
    }

    public String imprimirSecretaria() {
	return "ID:" + idSecretaria + "Nome: " + nomeSecretaria;
    }

}
