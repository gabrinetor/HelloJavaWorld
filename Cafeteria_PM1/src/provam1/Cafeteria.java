
package provam1;

public class Cafeteria {
    
      
    private String nome;
    private String sabores [] = new String[5];
    private float valores [] = new float[5];

    public void mostrarNome() {
        System.out.println("Bem vindo a cafeteria: " +  nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSabores(int i) {
        return sabores[i];
    }

    public void setSabores(int i, String sabor) {
       sabores[i] = sabor;
    }

    public float getValores(int i) {
        return valores[i];
    }

    public void setValores(int i, float valor) {
        this.valores[i] = valor;
    }
    
    public void listarSaboresEValores () {
        for (int i=0; i<5; i++){
            System.out.println((i + 1) + "° " + sabores[i] + " - " +valores[i]);
        }
    }
    
}
