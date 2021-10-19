package Streaming;

import java.util.ArrayList;
/*/
 * 
 Criar uma opção no menu para cadastrar (use um ArrayList)
 Criar uma opção no menu para listar
 Criar uma opção no menu para remover pelo "id"
 Criar uma opção no menu para editar pelo "id"
 Não permitir cadastrar duas entidades com o mesmo "id" (use Exceções)
 Adicionar uma opção no menu para mostrar a quantidade total de entidades cadastradas
 */

/**
 * 
 * @author Breno Coutinho de Melo
 *
 *Não consegui implementar as execeções
 */




public class ServicoStreaming {

	public static void main(String[] args) {
		ArrayList<Filmes> filmes = new ArrayList<>();
		//int id = 0;
		
		while(true) {
			System.out.println("\nBEM-VINDO AO SEU STREAMING");
			System.out.println("###########################");
			System.out.println("1. Cadastrar Filme");
			System.out.println("2. Listar Filmes");
			System.out.println("3. Remover o Filme pelo id");
			System.out.println("4. Editar o Filme");
			System.out.println("5. Quantidade de Filmes: ");
			System.out.println("6. Assistir");
			System.out.println("###########################");
			System.out.print("\nDIGITE A OPÇÃO DESEJADA: ");
			int opcao = Teclado.leInt();
			
			
			if(opcao == 1) {
				System.out.println("DIGITE O NOME DO FILME");
				String nome = Teclado.leString();
				System.out.println("DIGITE O NOME DO DIRETOR DO FILME");
				String nomeDiretor = Teclado.leString();
				System.out.println("DIGITE O ANO DE LANÇAMENTO");
				int ano = Teclado.leInt();
				System.out.println("DIGITE O ID");
				int id = Teclado.leInt();
				Filmes f1 = new Filmes(nome, nomeDiretor, ano, id);
				filmes.add(f1);
				
				
			}
			else if(opcao == 2) {
				
				for(Filmes f : filmes) {
					
					System.out.println("NOME: "+f.getNomeFilme()+" | ANO: "+f.getAnoLancamento()+" | DIRETOR: "+
							f.getDiretor()+" | ID: "+f.getIdFilme());
					System.out.println("---------------------------------------------------");
				}
			
			
			}	
			else if(opcao == 3)  {
				for(Filmes f : filmes) {
					
					System.out.println("NOME: "+f.getNomeFilme()+" ANO: "+f.getAnoLancamento()+" DIRETOR: "+
							f.getDiretor()+" ID: "+f.getIdFilme());
					System.out.println("--------------------------");
					
				}
					System.out.print("DIGITE O ID DESEJADO: ");
					Filmes IdRemover = null;
					int remover = Teclado.leInt();
					for (Filmes f : filmes) {
						if(remover == f.getIdFilme()) {
							IdRemover = f;
								
						}	
					
					}filmes.remove(IdRemover);
					System.out.println("FILME REMOVIDO!\n");
			
			
			}	
				else if(opcao == 4) {
					for(Filmes f2: filmes) {
						System.out.println("NOME: "+f2.getNomeFilme()+" ANO: "+f2.getAnoLancamento()+" DIRETOR:  "+
							f2.getDiretor()+" ID: "+f2.getIdFilme());
						System.out.println("--------------------------");
					}
						System.out.print("DIGITE O ID DO FILME PARA EDITAR");
						int editar = Teclado.leInt();
						for (Filmes f2 : filmes) {
					
						
						if(f2.getIdFilme() == editar) {
							System.out.println("O que você quer editar");
							System.out.println("1. Nome do Filme ");
							System.out.println("2. Nome do Diretor ");
							System.out.println("3. Ano de Lançamento ");
							int editar2 = Teclado.leInt();
							if(editar2 == 1) {
								
								System.out.print("Digite: ");
								String novoNome = Teclado.leString();
								f2.setNomeFilme(novoNome);
									
							}else if(editar2 == 2) {
								
								System.out.println("Digite :");
								String novoDiretor = Teclado.leString();
								f2.setDiretor(novoDiretor);
							}else if(editar2 == 3) {
								
								System.out.println("Digite :");
								int novoAno = Teclado.leInt();
								f2.setAnoLancamento(novoAno);
							}else
								System.out.println("Opção Inválida ! ! ! ");
					}
					
				
						}
				
				}
			
				else if(opcao == 5) {
					System.out.println("--------------------------");
					System.out.println(filmes.size()+ " Item(s) Cadastrados");
					System.out.println("--------------------------");		
					
				}
				else if(opcao == 6) {
					for (Filmes f2 : filmes) {
						System.out.println("NOME: "+f2.getNomeFilme()+" ANO: "+f2.getAnoLancamento()+" DIRETOR: "+
								f2.getDiretor()+" ID: "+f2.getIdFilme());
							System.out.println("--------------------------");
						}
					System.out.println("Digite o ID do Filme para Assitir: ");
					int assistir = Teclado.leInt();
					for (Filmes filmes2 : filmes) {
						if(filmes2.getIdFilme() == assistir) {
							System.out.println("Você está Assistindo "+ filmes2.getNomeFilme());
							
							
							
						}
					
					}
				break;
				
			
				}else {
					System.out.println("OPÇÃO INVALIDA ! !!");
					
				
				
				
			}
			
		}	
	}	
}


