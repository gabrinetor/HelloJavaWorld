
package exercicio_tabuleiro;

public class Tabuleiro {
    
    public static final int N = 8;
    private String tabuleiro [][] = new String[N][N];
    private int x, y;       

    public void inicializar(){
        
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                tabuleiro[i][j] = "0";            
            }
        }
           
        tabuleiro[0][0] = "1";
        x = 0;
        y = 0;
    }
        
    
    public void mostrar(){
       
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
        
    public void direita() {
      
        if (y < N-1){
            tabuleiro[x][y] = "0";
            y = y + 1;
            tabuleiro[x][y] = "1";
            
            mostrar();
        }
        else{
            System.out.println("Movimento inválido!");
        }
        
    }
    
    public void esquerda(){
        
        if (y > 0){
            tabuleiro[x][y] = "0";
            y = y - 1;
            tabuleiro[x][y] = "1";
            
            mostrar();
        }
        else{
            System.out.println("Movimento inválido!");
        }
        
    }
    
    public void baixo(){
        
        if (x < N-1) {
            tabuleiro[x][y] = "0";
            x = x + 1;
            tabuleiro[x][y] = "1";
            
            mostrar();
        }
        else{
            System.out.println("Movimento inválido!");
        }
        
    }
    
    public void cima(){
        
        if (x > 0) {
            tabuleiro[x][y] = "0";
            x = x - 1;
            tabuleiro[x][y] = "1";
            
            mostrar();
        }
        else{
            System.out.println("Movimento inválido!");
        }
        
    }
    
}
