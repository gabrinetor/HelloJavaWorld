package trabm2;

public class Pessoa {
    private String nomeCompleto;
    private int cpf;
    private Consultorio referenciaLista;

    public Consultorio getReferenciaLista() {
        return referenciaLista;
    }

    public void setReferenciaLista(Consultorio referenciaLista) {
        this.referenciaLista = referenciaLista;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }   
}
