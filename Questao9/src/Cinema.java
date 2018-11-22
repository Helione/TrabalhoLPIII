/*9.Descreva o que é uma classe abstrata, apresentando um exemplo tal como foi feito na questão 8, incluindo o polimorfismo. 
 * Explique o que acontece caso um método abstrato não seja implementado.*/
public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filmeAnimacao zootopia = new filmeAnimacao();
		
		zootopia.setNome("Zootopia");
		zootopia.setGenero("Animação");
		
	
		filmeAcao vingadores = new filmeAcao();
		vingadores.setNome("Vingadores");
		vingadores.setGenero("Ação");
		
		
		zootopia.contagiarPublico();
		System.out.print(zootopia);
		
		vingadores.contagiarPublico();
		System.out.print(vingadores);
		
	}

}
