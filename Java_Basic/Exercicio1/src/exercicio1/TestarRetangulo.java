
package exercicio1;

/**
 *
 * @author Gabriela
 */
public class TestarRetangulo {

    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo();
        
        novoRetangulo.lado1 = 10;
        novoRetangulo.lado2 = 5;
        
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
        
        novoRetangulo.lado1 = 7;
        
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
    }
    
}
