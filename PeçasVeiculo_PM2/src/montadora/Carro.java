
package montadora;

public class Carro extends Peca{
    
    //Atributo
    private String marca;
    
    /*Construtores de SubClasse . Mesmo esses atributos nao estejam nessa classe
        ainda eles irão nos parâmetros. */
    
    //Se for inserir somente nome e valor sem marca, não se aplica.
    public Carro( String nome , float valor ){
        super( nome , valor );
        this.marca = "N/A";
    }
    
    //Se inserir marca também daí teremos uma referencia à marca
    public Carro( String marca , String nome , float valor ){
        super( nome , valor );
        this.marca = marca;
    }
    
    //Ler Marca (pegar / get)
    public String getMarca() {
        return marca;
    }
    
    //Setar Marca (inserir / set)
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    //herdada da classe mãe (Peca), com condições referentes à classe Carro
    @Override
    public void dados(){
        System.out.println("=== PEÇA DE CARRO ===");
        System.out.println("Nome: " + getNome());       
        System.out.println("Valor: " + getValor());
        System.out.println("Marca: " + getMarca());
        System.out.println("=====================");
    }
    
}
