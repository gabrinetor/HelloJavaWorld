package trabm2;

public class Medico extends Funcionario{
	
	private String nomeMedico;
        private String especialidade;
	private int registro;

    /*public Medico(String nomeClinica, String telefone, float salario, float cargahoraria, float horasTrabalhadas) {
        super(nomeClinica, telefone, salario, cargahoraria, horasTrabalhadas);
    }*/

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
	
    public String imprimirMedico() {
	return "Especialidade:" + especialidade + "Registro: " + registro;
    }
    
}
