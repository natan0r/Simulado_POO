package simulado;

public class Questao {
	private String enunciado;
	private String alternativa01;
	private String alternativa02;
	private String alternativa03;
	private String alternativa04;
	private int gabarito;
	
	// RECEBER TODOS OS ATRIBUTOS
	public Questao(String enunciado, String alternativa01, String alternativa02, String alternativa03, String alternativa04, int gabarito) {
	this.enunciado = enunciado;
	this.alternativa01 = alternativa01;
	this.alternativa02 = alternativa02;
	this.alternativa03 = alternativa03;
	this.alternativa04 = alternativa04;
	this.gabarito = gabarito;
	}
	
	// EXIBIR ENUNCIADO E ALTERNATIVAS
	public void mostrar() {
		System.out.println(this.enunciado);
		System.out.println("Q1: " + this.alternativa01);
		System.out.println("Q2: " + this.alternativa02);
		System.out.println("Q3: " + this.alternativa03);
		System.out.println("Q4: " + this.alternativa04);
	}
	
	// COMPARAR RESPOSTA  //  GABARITO >> RESPOSTA
	public boolean estaCorreto(int resposta){
		return this.gabarito == resposta;
	}
}
