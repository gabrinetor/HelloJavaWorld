package trabm2;
public class Funcionario extends Pessoa {

    private float cargahoraria;
    private float horasTrabalhadas;

    public float getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(float cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
//    public double calcularBancoDeHoras(double cargahoraria, double horasTrabalhadas){
    public double calcularSalario(){
        double salario;
        salario = cargahoraria * horasTrabalhadas;
        return salario;
    }
    
}
