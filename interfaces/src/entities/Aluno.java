package entities;
import interfaces.NomeValido;

public class Aluno implements NomeValido{
	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isNomeValido() {
        return this.nome != null && !this.nome.isEmpty() && this.nome.length() <= TAMANHO_MAXIMO_NOME
                && this.nome.matches(EXPRESSAO_REGULAR_NOME);
    }
	
	public String getMensagemErroNome() {
		return "Erro. Nome inválido!";
	}
}
