package br.com.ford;

public class Tester {

	
	public static void main(String[] args) {
		
		
		Carro c = new Carro();
		
		c.setAno(2024);
		c.setMarca("Ford");
		c.setModelo("KA");
		
		
		System.out.println("ano :" + c.getAno());
	}
}
