package montadora;

public abstract class Peca {

    //Atributos
    private String nome;
    private float valor;
    
    //Construtor para usar parametros quando chamar
    public Peca( String nome , float valor ){
        this.nome = nome;
        this.valor = valor;
    }
    
    //Ler nome (pegar / get) {retornar}
    public String getNome() {
        return nome;
    }
    
    //Setar nome (modificar / set) {sem retorno}
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Ler valor (pegar / get)
    public float getValor() {
        return valor;
    }
    
    //Setar valor (inserir / set)
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    /*Método que tem que existir em todas as SubClasses(sobrescrita).
    Declarou a classe "Pecas" como abstrata, então ninguém pode instanciar uma 
    peça porque ela é abstrata. 
    Mas Carro e Moto, obrigatoriamente, tem que ter esse método "dados()" .
    É uma referencia, para as subclasses (que tão herdando), possam seguir.
    */ 
    public abstract void dados();
    
    /* - MAS PQ SE FAZ ISSO? - Tu imagina: se estancia uma peça de Carro e se 
    estancia uma peça de Moto. As duas têm o método "dados", então tu poderia 
    chamar direto do objeto. Mas digamos que tu criou uma ArrayList de peças, 
    que pode ter peça de Moto e peça de Carro misturada, só que daí tu pode te 
    dar ao luxo de chamar o método dados dessa ArrayList de peças, uma por uma.
    Isso porque todas elas implementam, já que na assinatura da classe abstrata
    traz esse método na assinatura. */
    
    /* Vai chamar o método dados de uma peça de Carro, mas tu botou essa peça 
        de dados numa Array de peças, e aí tu vai chamar uma Array de Peças de
        uma Moto , que tu também botou numa ArrayList de Peças. 
        Daí como tu tá chamando o método "dados()", ele vai chamar o método 
        "dados" de cada classe específica, mesmo tu chamando dados de peça 
        porque "Peca" não existe, já que Peça é abstrato, daí ele vai chamar 
        o específico da Moto e o específico do Carro, de acordo com o objeto
        que tu estanciou. */
    
}
