/*7.Crie uma classe que, usando o conceito de encapsulamento, implemente um vetor de objetos da classe da questão 6.
 *Esta classe deverá permitir cadastro, listagem, exclusão e alteração de objetos no vetor.
 * Observe no vetor. Observe que é necessário criar um método tostring () na classe. Para uso desta classe,
 *crie um menu de opções.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class CrudFilme {
	ArrayList<Filme> filmes = new ArrayList<Filme>();

	public void cadastrarFilme() {
		Scanner fnome = new Scanner(System.in);
		Scanner fgenero = new Scanner(System.in);
		Scanner fempresa = new Scanner(System.in);
		
		
		Filme filme = new Filme();
		System.out.print("\rInfome o nome do filme: ");
		filme.setNome(fnome.nextLine());

		System.out.print("\rInforme o gênero do filme : ");
		filme.setGenero(fgenero.nextLine());
		
		System.out.print("\rInforme a empresa a qual pertence : ");
		filme.setEmpresa(fempresa.nextLine());
		filmes.add(filme); 
				
		System.out.println("Filme Cadastrado");
		
	}
	
	public void listarFilme() {
		System.out.println("**Filmes Cadastrados**");
		for(int i=0;i<filmes.size();i++)
			System.out.println((i+1) + ". " + filmes.get(i).toString());
		
	}
	
	public void alterarFilme() {
		
	Scanner fnome = new Scanner(System.in);
	Scanner fgenero = new Scanner(System.in);
	Scanner fempresa = new Scanner(System.in);
	Scanner indice = new Scanner(System.in);
	
	listarFilme();
	
	System.out.println("\rInforme o Indice do Filme que desejar alterar:  ");

	int i = indice.nextInt()-1;
		
	Filme filme = (Filme) filmes.get(i);

	System.out.println("\rInforme o nome do filme: ");
	filme.setNome(fnome.nextLine());
	
	System.out.println("\rInforme o gênero do filme: ");
	filme.setGenero(fgenero.nextLine());
	
	System.out.println("\rInforme a empresa a qual pertence: ");
	filme.setEmpresa(fempresa.nextLine());
	
	System.out.println("\nFilme foi Alterado! ");
	}
	
	public void excluirFilme() {
		Scanner e = new Scanner(System.in);
		listarFilme();
		
		System.out.println("\rInforme o Indice que deseja remover: ");
		filmes.remove(e.nextInt()-1);
		System.out.println("\nFilme Removido: ");
		
	}
}
