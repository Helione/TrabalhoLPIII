/* 5.	Faça um projeto em java que represente a classe da questão 4.
 *  Este deverá ter duas classes, onde a outra fará uso da classe criada, a partir do método main. 
 *  Explique como seu programa do método maior está usando a classe.
 *  Obs: não usar encapsulamento neste exemplo, ou seja, os atributos deverão ser acessados diretamente.*/

public class Cinema {

	public static void main(String[] args) {
		Filme animado = new Filme();
		
		animado.nome = "Os Incríveis";
		animado.genero = "Animação";
		animado.empresa = "Pixar";
		
		Filme acao = new Filme();
		acao.nome = "Vingadores";
		acao.genero = "Ação";
		acao.empresa = "Marvel";
			
		animado.contarEnredo();
		acao.contagiarPublicoAlvo();
		
	    System.out.println("Nome dos filmes: " + animado.nome + 
	    		" e " + acao.nome + "\n" +
	    	    "Gênero: " + animado.genero +  
	    		" e "+ acao.genero);

	}
}
