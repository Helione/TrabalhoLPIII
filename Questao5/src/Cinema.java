/* 5.	Fa�a um projeto em java que represente a classe da quest�o 4.
 *  Este dever� ter duas classes, onde a outra far� uso da classe criada, a partir do m�todo main. 
 *  Explique como seu programa do m�todo maior est� usando a classe.
 *  Obs: n�o usar encapsulamento neste exemplo, ou seja, os atributos dever�o ser acessados diretamente.*/

public class Cinema {

	public static void main(String[] args) {
		Filme animado = new Filme();
		
		animado.nome = "Os Incr�veis";
		animado.genero = "Anima��o";
		animado.empresa = "Pixar";
		
		Filme acao = new Filme();
		acao.nome = "Vingadores";
		acao.genero = "A��o";
		acao.empresa = "Marvel";
			
		animado.contarEnredo();
		acao.contagiarPublicoAlvo();
		
	    System.out.println("Nome dos filmes: " + animado.nome + 
	    		" e " + acao.nome + "\n" +
	    	    "G�nero: " + animado.genero +  
	    		" e "+ acao.genero);

	}
}
