package trabm2;

public class Paciente extends Pessoa {

    public Paciente(String nomePaciente, int numeroAtendimento, String diagnostico) {
        this.nomePaciente = nomePaciente;
        this.numeroAtendimento = numeroAtendimento;
        this.diagnostico = diagnostico;
    }

    private String nomePaciente;
    private int numeroAtendimento;
    private String diagnostico;

    public int getNumeroAtendimento() {
        return numeroAtendimento;
    }

    public void setNumeroAtendimento(int numeroAtendimento) {
        this.numeroAtendimento = numeroAtendimento;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public String imprimirPaciente() {
	return "Nome: " + nomePaciente + "\nNumero de Atendimento: " + numeroAtendimento + "\nDiagnotico: " + diagnostico;
    }
    
}
