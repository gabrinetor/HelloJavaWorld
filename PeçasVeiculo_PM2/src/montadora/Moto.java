
package montadora;

public class Moto extends Peca{
    
    // Atributo
    private String marca;
    private int ano;
    
    //inserir marca honda (constante) e ano
    public Moto( String nome , float valor , int ano ){
        super( nome , valor );  //define ser uma subclasse
        this.marca = "Honda";
        this.ano = ano;
    }
    
    //Ler Marca (pegar / get)
    public String getMarca(){
        return marca;
    }
    
    //Setar Marca (inserir / set)
    public void setMarca( String marca ){
        this.marca = marca;
    }
    
    //Ler Marca (pegar / get)
    public int getAno(){
        return ano;
    }
    
    //Setar Marca (inserir / set)
    public void setAno( int ano ){
        this.ano = ano;
    }
    
    //herdada da classe mãe, com condições referentes à classe Moto
    //define ser uma subclasse
    @Override
    public void dados(){
        System.out.println("=== PEÇA DE MOTO ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Valor: " + getValor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano: " + getAno());
        System.out.println("====================");
    }
    
}
