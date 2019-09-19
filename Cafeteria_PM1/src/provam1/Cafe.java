
package provam1;

public class Cafe {
    
        private String sabor;
    private float valor;
    private int qtd;

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public void fecharCafe (){
        System.out.println("O sabor escolhido foi " + sabor + " e o valor do pedido foi " + (qtd * valor) );
                
    }
    
}
