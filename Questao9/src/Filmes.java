/*Questão 9*/
public abstract class Filmes {
	private String nome;
	private String genero;


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Filmes é nome=" + nome + ", genero=" + genero;
	}


	public abstract void contagiarPublico();
	
}
