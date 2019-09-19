
package exercicio3;

/**
 *
 * @author Gabriela
 */
public class TestarCirculo {

    public static void main(String[] args) {
        
        //instanciando
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();
        
        //atribuir
        circulo1.raio = 10;
        circulo2.raio = 6;
        
        //chamando metodos
        circulo1.calcularArea();
        circulo2.calcularArea();
        circulo1.calcularPerimetro();
        circulo2.calcularPerimetro();
        
    }
    
}
