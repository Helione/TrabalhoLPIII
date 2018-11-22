/*Questão 6.	Explique o conceito de encapsulamento e como o mesmo é implementado em java.
 *  Crie uma classe com pelo menos três atributos usando este conceito. Faça uma outra classe,
 *  contendo o método do main, e que faça uso desta classe. Explique como o método main faz acesso aos atributos da classe.
 *  Explique também o que acontece quando se tenta acessar os atributos diretamente.*/

public class Cinema {
	public static void main(String[] args) {			
		Filme filme = new Filme();
		
		System.out.print("\rO filme é... ");
		filme.setNome("Divertida mente");
		filme.setGenero("Animação");
		filme.setEmpresa("Pixar");
		
		filme.contarEnredo();
		filme.contagiarPublicoAlvo();
		
		System.out.println(filme.getNome());
		System.out.println(filme.getGenero());
		System.out.println(filme.getEmpresa());
	}

}
