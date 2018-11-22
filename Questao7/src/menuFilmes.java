
import java.util.Scanner;

public class menuFilmes {

	public static void main(String[] args) {
			int opcao;	
			Scanner e = new Scanner(System.in);
			CrudFilme cinema = new CrudFilme();
			do{
				
				System.out.println("**Cadastrar Filmes**\n");
				System.out.println("1-Cadastrar  \n2-Listar \n3-Atualizar \n4-Excluir \n5-Sair");
				System.out.print("\rDigite sua opção: ");
				opcao = e.nextInt();
				switch( opcao )
				{
				    case 1:
				    	cinema.cadastrarFilme();
				            break;
				    
				    case 2:
				    	cinema.listarFilme();
				            break;
				    
				    case 3:
				    	cinema.alterarFilme();
				    		break;
				    case 4:
				    	cinema.excluirFilme();
			            	break;
			            	
				    default:
				           
				}
			
			}while(opcao <5);
	
	}
	

}


