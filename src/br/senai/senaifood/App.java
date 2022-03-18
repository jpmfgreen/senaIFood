package br.senai.senaifood;

public class App {

	public static void main(String[] args) {
		Cliente francisco = new Cliente();
		francisco.setNome("Francisco");
		francisco.setTelefone("21982856985");
		francisco.setEmail("francisco.santana@edu.sc.senai.br");
		System.out.println(francisco);
		
		Pessoa luana = new Entregador();
		luana.setNome("Luana");
		luana.setTelefone("1111111111");
		System.out.println(luana);
	}
	
}
