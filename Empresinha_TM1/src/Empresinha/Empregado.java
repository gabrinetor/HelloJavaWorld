
package Empresinha;

public class Empregado {
    
    // Atributos
    private String nome;
    private int id;
    private int CargaHoraria;
    private float ValorHora;
    
    //nome do empregado
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //ID do empregado
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //carga horária do empregado
    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    //valor da hora trabalhada do empregado
    public float getValorHora() {
        return ValorHora;
    }

    public void setValorHora(float ValorHora) {
        this.ValorHora = ValorHora;
    }

    
    
}
