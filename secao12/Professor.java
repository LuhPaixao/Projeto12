package br.com.geekuniversity.secao12;

public class Professor extends Pessoa{
	private String matricula;
	
	public Professor(String nome, int ano_nascimento, String email, String matricula) {
		super(nome, ano_nascimento, email);
		 this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	//Overriding / Sobrescrita de m�todo
	public String toString() {
		return super.toString() + "\nMatr�cula: " + this.matricula;
	}
	
	//Overriding / Sobrescrita de m�todo
	public String getNome() {
		return "Professor: \n" + super.getNome();
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
		
	}

}
