/*Quest�o 6.	Explique o conceito de encapsulamento e como o mesmo � implementado em java.
 *  Crie uma classe com pelo menos tr�s atributos usando este conceito. Fa�a uma outra classe,
 *  contendo o m�todo do main, e que fa�a uso desta classe. Explique como o m�todo main faz acesso aos atributos da classe.
 *  Explique tamb�m o que acontece quando se tenta acessar os atributos diretamente.*/

public class Cinema {
	public static void main(String[] args) {			
		Filme filme = new Filme();
		
		System.out.print("\rO filme �... ");
		filme.setNome("Divertida mente");
		filme.setGenero("Anima��o");
		filme.setEmpresa("Pixar");
		
		filme.contarEnredo();
		filme.contagiarPublicoAlvo();
		
		System.out.println(filme.getNome());
		System.out.println(filme.getGenero());
		System.out.println(filme.getEmpresa());
	}

}
