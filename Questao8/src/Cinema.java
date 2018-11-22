/*8.Explique o conceito de heran�a. Apresente um exemplo contendo pelo menos 3 classes, definindo, dentro do conceito de heran�a,
 *  os tipos desta classes.  Esse exemplo deve ser descrito implementado em java. 
 *  Dever� ser feita uma outra classe, contendo o m�todo main, que use as classes anteriores. 
 *  Descreva como est� sendo feito.
 *  Tamb�m utilize o conceito de polimorfismo neste m�todo main.*/


public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		filmeAnimacao zootopia = new filmeAnimacao();
		zootopia.nome ="Zootopia";
		zootopia.genero ="Animacao";
		zootopia.ano =2015;
		zootopia.tipo ="3D";
		
		
		filmeComedia branquelas = new filmeComedia();
		branquelas.nome ="As Branquelas";
		branquelas.genero ="Comedia";
		branquelas.ano = 2000;
		branquelas.trilha ="Americana";
		
		filmeAcao vingadores = new filmeAcao();
		vingadores.nome ="Vingadores";
		vingadores.genero ="A��o";
		vingadores.ano = 2007;
		vingadores.duracao = 2000000;
		
		zootopia.contagiarPublico();
		branquelas.contarEnredo();
		vingadores.contagiarPublico();
		
		System.out.println("Nome: " + zootopia.nome + " e " + branquelas.nome + " e " + vingadores.nome +"\n" +
			    "Ano: " + zootopia.ano + " e " + branquelas.ano + " e " + vingadores.ano + "\n" +
			    "Especifica��es: " + zootopia.tipo + " e " + branquelas.trilha + " e " + vingadores.duracao +"\n");
		
	}

}
