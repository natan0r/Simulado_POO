package simulado;

import java.util.Scanner;

public class Prova {
	private Aluno candidato;
	private Questao q1, q2, q3, q4, q5;
	private int resposta01, resposta02, resposta03, resposta04, resposta05;
	private int nota;
	
	// RECEBER TODOS OS ATRIBUTOS
	public Prova(Aluno candidato, Questao q1, Questao q2, Questao q3, Questao q4, Questao q5, int resposta01,
			int resposta02, int resposta03, int resposta04, int resposta05, int nota) {
		super();
		this.candidato = candidato;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
		this.resposta01 = resposta01;
		this.resposta02 = resposta02;
		this.resposta03 = resposta03;
		this.resposta04 = resposta04;
		this.resposta05 = resposta05;
		this.nota = nota;
	}

	// NOTA
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	// APLICAR PROVA
	public void aplicarProva() {
		Scanner input = new Scanner(System.in);
		
		q1.mostrar();
		System.out.println("Escolha uma alternativa: ");
		resposta01 = input.nextInt();
		
		q2.mostrar();
		System.out.println("Escolha uma alternativa: ");
		resposta02 = input.nextInt();
		
		q3.mostrar();
		System.out.println("Escolha uma alternativa: ");
		resposta03 = input.nextInt();
		
		q4.mostrar();
		System.out.println("Escolha uma alternativa: ");
		resposta04 = input.nextInt();
		
		q5.mostrar();
		System.out.println("Escolha uma alternativa: ");
		resposta05 = input.nextInt();
		
	}
	
	// CORRIGIR PROVA
	public void corrigirProva() {
		int acertos = 0;
		if(q1.estaCorreto(resposta01)) {
			acertos++;
		}
		
		if(q2.estaCorreto(resposta02)) {
			acertos++;
		}
		
		if(q3.estaCorreto(resposta03)) {
			acertos++;
		}
		
		if(q4.estaCorreto(resposta04)) {
			acertos++;
		}
		
		if(q5.estaCorreto(resposta05)) {
			acertos++;
		}
		
		this.nota = acertos * 2;
	}
}
