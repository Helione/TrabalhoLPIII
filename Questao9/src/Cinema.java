/*9.Descreva o que � uma classe abstrata, apresentando um exemplo tal como foi feito na quest�o 8, incluindo o polimorfismo. 
 * Explique o que acontece caso um m�todo abstrato n�o seja implementado.*/
public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filmeAnimacao zootopia = new filmeAnimacao();
		
		zootopia.setNome("Zootopia");
		zootopia.setGenero("Anima��o");
		
	
		filmeAcao vingadores = new filmeAcao();
		vingadores.setNome("Vingadores");
		vingadores.setGenero("A��o");
		
		
		zootopia.contagiarPublico();
		System.out.print(zootopia);
		
		vingadores.contagiarPublico();
		System.out.print(vingadores);
		
	}

}
