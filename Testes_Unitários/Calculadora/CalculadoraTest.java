import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	/*
	 * 
	 * _________| n1 | n2 | soma | subt | mult | divs |
	 * | Linha1 | 0  | 0  |  0	 |  0   |  0   |  0   |
	 * | Linha2	| 10 | 0  |  10	 |	10	|  0   |  0	  |
	 * | Linha3 | 0	 | 10 |  10	 | -10	|  0   |  0	  |   
	 * | Linha4 | 10 | 10 |  20	 |	0	|  100 |  1	  |
	 * | Linha5 | 10 | 5  |  15	 |	5	|  50  |  2	  |
	 * | Linha6 | 5	 | 10 |  15	 | -5	|  50  |  0.5 |
	 * 
	 * */
	
/*************************************************************/	
	
/*	Linha 1	*/
	
	@Test
	public void testSomarL1() {

		int n1 = 0;
		int n2 = 0;
		
		Calculadora c = new Calculadora();

		double atual = c.somar(n1, n2);
		double resultado = 0;
		
		assertEquals(resultado, atual, 0);
		
	}
	
	@Test
	public void testSubtrairL1() {

		int n1 = 0;
		int n2 = 0;
		
		Calculadora c = new Calculadora();

		double atual = c.subtrair(n1, n2);
		double resultado = 0;
		
		assertEquals(resultado, atual, 0);
		
	}

	@Test
	public void testMultiplicarL1() {

		int n1 = 0;
		int n2 = 0;
		
		Calculadora c = new Calculadora();

		double atual = c.multiplicar(n1, n2);
		double resultado = 0;
		
		assertEquals(resultado, atual, 0);
		
	}
	
	@Test
	public void testDividirL1() {

		int n1 = 0;
		int n2 = 0;
		
		Calculadora c = new Calculadora();

		double atual = c.dividir(n1, n2);
		double resultado = 0;
		
		assertEquals(resultado, atual, 0);
		
	}	

	
/*************************************************************/	

/*	Linha 2	*/  
	
	@Test
	public void testSomarL2() {

		int n1 = 10;
		int n2 = 0;
		
		Calculadora c = new Calculadora();

		double atual = c.somar(n1, n2);
		double resultado = 10;
		
		assertEquals(resultado, atual, 0);
		
	}
	
	@Test
	public void testSubtrairL2() {

		int n1 = 10;
		int n2 = 0;
		
		Calculadora c = new Calculadora();

		double atual = c.subtrair(n1, n2);
		double resultado = 10;
		
		assertEquals(resultado, atual, 0);
		
	}	
	
	
	@Test
	public void testMultiplicarL2() {

		int n1 = 10;
		int n2 = 0;
		
		Calculadora c = new Calculadora();

		double atual = c.multiplicar(n1, n2);
		double resultado = 0;
		
		assertEquals(resultado, atual, 0);
		
	}
	
	@Test
	public void testDividirL2() {

		int n1 = 10;
		int n2 = 0;
		
		Calculadora c = new Calculadora();

		double atual = c.dividir(n1, n2);
		double resultado = 0;
		
		assertEquals(resultado, atual, 0);
		
	}

	
/*************************************************************/	

/*	Linha 3	*/  
		
	@Test
	public void testSomarL3() {

		int n1 = 0;
		int n2 = 10;
			
		Calculadora c = new Calculadora();

		double atual = c.somar(n1, n2);
		double resultado = 10;
			
		assertEquals(resultado, atual, 0);
			
	}
		
	@Test
	public void testSubtrairL3() {

		int n1 = 0;
		int n2 = 10;
			
		Calculadora c = new Calculadora();

		double atual = c.subtrair(n1, n2);
		double resultado = -10;
			
		assertEquals(resultado, atual, 0);
			
	}	
		
		
	@Test
	public void testMultiplicarL3() {

		int n1 = 0;
		int n2 = 10;
			
		Calculadora c = new Calculadora();

		double atual = c.multiplicar(n1, n2);
		double resultado = 0;
			
		assertEquals(resultado, atual, 0);
			
	}
		
	@Test
	public void testDividirL3() {

		int n1 = 0;
		int n2 = 10;
			
		Calculadora c = new Calculadora();

		double atual = c.dividir(n1, n2);
		double resultado = 0;
			
		assertEquals(resultado, atual, 0);
		
	}	

	
/*************************************************************/	

/*	Linha 4	*/  
		
	@Test
	public void testSomarL4() {

		int n1 = 10;
		int n2 = 10;
			
		Calculadora c = new Calculadora();

		double atual = c.somar(n1, n2);
		double resultado = 20;
			
		assertEquals(resultado, atual, 0);
			
	}
		
	@Test
	public void testSubtrairL4() {

		int n1 = 10;
		int n2 = 10;
			
		Calculadora c = new Calculadora();

		double atual = c.subtrair(n1, n2);
		double resultado = 0;
			
		assertEquals(resultado, atual, 0);
			
	}	
		
		
	@Test
	public void testMultiplicarL4() {

		int n1 = 10;
		int n2 = 10;
			
		Calculadora c = new Calculadora();

		double atual = c.multiplicar(n1, n2);
		double resultado = 100;
			
		assertEquals(resultado, atual, 0);
			
	}
		
	@Test
	public void testDividirL4() {

		int n1 = 10;
		int n2 = 10;
			
		Calculadora c = new Calculadora();

		double atual = c.dividir(n1, n2);
		double resultado = 1;
			
		assertEquals(resultado, atual, 0);
			
	}	


/*************************************************************/	

/*	Linha 5	*/  
		
	@Test
	public void testSomarL5() {

		int n1 = 10;
		int n2 = 5;
			
		Calculadora c = new Calculadora();

		double atual = c.somar(n1, n2);
		double resultado = 15;
			
		assertEquals(resultado, atual, 0);
			
	}
		
	@Test
	public void testSubtrairL5() {

		int n1 = 10;
		int n2 = 5;
		
		Calculadora c = new Calculadora();

		double atual = c.subtrair(n1, n2);
		double resultado = 5;
			
		assertEquals(resultado, atual, 0);
			
	}	
		
		
	@Test
	public void testMultiplicarL5() {

		int n1 = 10;
		int n2 = 5;
			
		Calculadora c = new Calculadora();

		double atual = c.multiplicar(n1, n2);
		double resultado = 50;
			
		assertEquals(resultado, atual, 0);
			
	}
		
	@Test
	public void testDividirL5() {

		int n1 = 10;
		int n2 = 5;
			
		Calculadora c = new Calculadora();

		double atual = c.dividir(n1, n2);
		double resultado = 2;
			
		assertEquals(resultado, atual, 0);
			
	}	


/*************************************************************/	

/*	Linha 6	*/  
			
	@Test
	public void testSomarL6() {

		int n1 = 5;
		int n2 = 10;
				
		Calculadora c = new Calculadora();

		double atual = c.somar(n1, n2);
		double resultado = 15;
				
		assertEquals(resultado, atual, 0);
				
	}
			
	@Test
	public void testSubtrairL6() {

		int n1 = 5;
		int n2 = 10;
				
		Calculadora c = new Calculadora();

		double atual = c.subtrair(n1, n2);
		double resultado = -5;
				
		assertEquals(resultado, atual, 0);
				
	}	
			
			
	@Test
	public void testMultiplicarL6() {

		int n1 = 5;
		int n2 = 10;
				
		Calculadora c = new Calculadora();

		double atual = c.multiplicar(n1, n2);
		double resultado = 50;
				
		assertEquals(resultado, atual, 0);
				
	}
			
	@Test
	public void testDividirL6() {

		int n1 = 5;
		int n2 = 10;
				
		/*double d1 = (double) n1;
		double d2 = (double) n2;*/
		
		Calculadora c = new Calculadora();

		double atual = c.dividir(n1, n2);
		double resultado = (double) 0.5;
				
		assertEquals(resultado, atual, 0);
				
	}

					
/*****************************************************************************************

	Executados: 24 cenários.
	
	Erros: 2.
		- testDividirL1: divisão de 0 por 0, gera resultado indefinido.
		- testDividirL2: não é possível dividir 10 por 0.
	
	Falhas: 1.
		- testDividirL6: não foi possível converter int para double.
		

*****************************************************************************************/
	
}

