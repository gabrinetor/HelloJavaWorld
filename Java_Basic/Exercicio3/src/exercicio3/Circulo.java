
package exercicio3;

/**
 *
 * @author Gabriela
 */
public class Circulo {
    
    public double raio;
    public double area;
    public double perimetro;
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    
    public void calcularArea(){
        area = raio * raio * 3.14;
        System.out.println("Area: " + area + "m²");
    }
    
    public void calcularPerimetro(){
        perimetro = 2 * 3.14 * raio;
        System.out.println("Perimetro: " + perimetro);
    }
    
}
