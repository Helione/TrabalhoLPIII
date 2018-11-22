/*Questão 7*/
public class Filme {
	private String nome;
	private String genero;
	private String empresa;
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
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return "O Filme é... nome = " + nome + ", genero = " + genero + ", empresa = " + empresa;
	}
		public void contarEnredo() {
	    	System.out.println("\nEnrendo do filme...");
	    	
	    }
	    
	   public void contagiarPublicoAlvo() {
	    	System.out.println(" e o seu Público Alvo");
	    }
		
}
