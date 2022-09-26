package simulado;

public class Aluno {
	private String nome;
	private String matricula;
	private int idade;
	
	// RECEBER TODOS OS ATRIBUTOS
	public Aluno(String nome, String matricula, int idade) {
		
	}

	// NOME
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// MATRICULA
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// IDADE
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// INFORMAÇÕES DO ALUNO
	public void mostrar() {
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("Matrícula do aluno: " + this.matricula);
		System.out.println("Idade do aluno: " + this.idade);
	}
}
