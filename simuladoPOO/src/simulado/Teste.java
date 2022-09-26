package simulado;

public class Teste {
	public static void main(String[] args) {
		// CRIAR QUEST�ES
		Questao q1 = new Questao("Quantos anos o Natan tem?", "16", "17", "18", "19", 4);
		Questao q2 = new Questao("Qual a linguagem de programa��o tem a sigla JS?", "JavaScript", "Java", "Python", "PHP", 1);
		Questao q3 = new Questao("O que � Java?", "Um tipo de caf�", "Um aplicativo", "Uma linguagem de programa��o", "Um site de apostas esportivas", 3);
		Questao q4 = new Questao("Qual o nome do mascote do Fortaleza?", "Cesar", "Juba", "Vov�", "Stella", 2);
		Questao q5 = new Questao("Qual o ano do t�tulo nacional do Fortaleza?", "1999", "2020", "1997", "2018", 4);
		
		// CRIAR ALUNO
		Aluno natan = new Aluno("Natan", "2213024", 19);
		
		// CRIAR PROVA
		Prova simulado = new Prova(natan, q1, q2, q3, q4, q5, 0, 0, 0, 0, 0, 0);
		
		// APLICAR PROVA
		simulado.aplicarProva();
		
		// CORRIGIR PROVA
		simulado.corrigirProva();
		
		// NOTA DA PROVA 
		System.out.println(simulado.getNota());
	}
}
