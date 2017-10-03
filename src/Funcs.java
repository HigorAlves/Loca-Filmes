/**
 * Funcs é a classe que comporta todos os metodos que nosso programa executa, nele podemos observar todo o programa e seu funcionamento.
 */

import java.util.List;
import java.util.Scanner;

public class Funcs {
	
	// METODOS MENU CLIENTES
	
	public void Listar(List<Cliente> clientes) {
		if (clientes.isEmpty() == false) {
			for (Cliente cli: clientes) {
				System.out.print("| ID: " + cli.getId() + " | Nome: " + cli.getNome() + " | Idade: " + cli.getIdade() + " | Endereço: " + cli.getEndereco() + " | Telefone: " + cli.getTelefone());
				if (cli.isComFilme() == true) {
					System.out.println(" Filme: " + cli.getFilme());
				}
			}
		}else {
			System.out.println("Não ha nenhum cliente cadastrado.");
		}
	}

	public void Excluir(List<Cliente> clientes, Scanner scan) {
		if(clientes.isEmpty() == false) {
			System.out.println("Insira o ID do cliente que deseja excluir: ");
			int j = scan.nextInt();
			for (Cliente cli: clientes) {
				if (cli.getId() == j) {
					System.out.println("\n Cliente a ser deletado: ID: " + cli.getId() + " Nome: " + cli.getNome() + " Telefone: " + cli.getTelefone());
					clientes.remove(cli);
					System.out.println("Cliente deletado com sucesso.");
				}else {
					System.out.println("Não existe cliente com o ID " + j);
				}
			}	
		}else {
			System.out.println("Não ha nenhum cliente cadastrado.");
		}

	}

	public void AlterarCadastro(List<Cliente> clientes, Scanner scan) {
		if (clientes.isEmpty() == false) {
			System.out.println("Insira o ID do cliente que quer alterar: ");
			int aux = scan.nextInt();
			for (Cliente cli: clientes) {
				if (cli.getId() == aux) {
					System.out.print("Insira o novo nome: ");
					cli.setNome(scan.next());
					System.out.print("\nInsira o novo Endreço: ");
					cli.setEndereco(scan.next());
					System.out.print("\nInsira a nova Idade: ");
					cli.setIdade(scan.nextInt());
					System.out.print("\nInsira o novo Telefone: ");
					cli.setTelefone(scan.next());
					System.out.println("\nDados do Cliente atualizados com sucesso!");
				} else {
					System.out.println("Não existe cliente com o ID " + aux);
				}
			}	
		} else {
			System.out.println("Não existem clientes cadastrados.");
		}
	}

	public void AlugarFilme(List<Cliente> clientes, List<Filmes> filmes, Scanner scan) {
		if (clientes.isEmpty() == false) {
			if (filmes.isEmpty() == false) {
				System.out.print("Qual ID do cliente que vai alugar?");
				int i = scan.nextInt();
				for (Cliente cli: clientes) {
					if (cli.getId() == i) {
						if (cli.isComFilme() == true || cli.isDevendo() == true) {
							System.out.println("O cliente não pode alugar um filme. Ja esta com um filme? " + cli.isComFilme() + " Esta devendo? " + cli.isDevendo());
						} else {
							System.out.print("Qual o codigo do filme que sera alugado: ");
							int j = scan.nextInt();
							for (Filmes filme: filmes) {
								if (filme.isAlugado() == true) {
									System.out.println("O filme ja esta alugado...");
								} else {
									if (filme.getCodigo() == j) {
										System.out.println("O Cliente " + cli.getNome() + " vai estar alugando o filme: " + filme.getNome());
										cli.setComFilme(true);
										cli.setFilme(filme.getNome());
										filme.setAlugado(true);
									} else {
										System.out.println("O Filme com codigo " + j + " não existe");
									}	
								}
							}	
						}
					} else {
						System.out.println("Não existe cliente com o ID " + i);
					}
				}	
			} else {
				System.out.println("Não existem filmes cadastrados.");
			}
		} else {
			System.out.println("Não existem clientes cadastrados.");
		}
	}
	
	public Cliente Cadastrar(int id, Cliente cliente, Scanner scan){
		cliente.setId(id);
        System.out.println("O ID do cliente sera: " + id);
		
        System.out.print("\nQual nome do Cliente? ");
        cliente.setNome(scan.next());
        
        System.out.print("Qual endereço? ");
        cliente.setEndereco(scan.next());
        
        System.out.print("Qual idade? ");
        cliente.setIdade(scan.nextInt());
        
        System.out.print("Qual o telefone? ");
        cliente.setTelefone(scan.next());
        
        System.out.print("Cliente cadastrado com Sucesso!");
        
        return cliente;
    }
	
	public void DevolverFilme(List<Cliente> clientes, List<Filmes> filmes, Scanner scan) {
		if (clientes.isEmpty() == false) {
			if (filmes.isEmpty() == false) {
				System.out.print("Qual o ID do cliente que ira devolver o filme? ");
				int j = scan.nextInt();
				for (Cliente cliente: clientes) {
					if (cliente.getId() == j) {
						if (cliente.isComFilme() == true) {
							for (Filmes filme: filmes) {
								if (cliente.getFilme().equals(filme.getNome())) {
									System.out.println("Filme devolvido com sucesso.");
									cliente.setFilme(null);
									cliente.setComFilme(false);
									filme.setAlugado(false);
								}
							}
						} else {
							System.out.println("Este cliente não esta com nenhum filme.");
						}
					} else {
						System.out.println("Não existe nenhum cliente com este ID.");
					}
				}
			} else {
				System.out.println("Não ha nenhum filme cadastrado.");
			}
		} else {
			System.out.println("Não ha nenhum cliente cadastrado.");
		}
	}
	
	//METODOS MENU FILME
	
	public Filmes CadastrarFilme(Filmes filme, Scanner scan) {
		System.out.print("Insira o Codigo do filme: ");
		filme.setCodigo(scan.nextInt());
		
		System.out.print("Insira o nome do filme: ");
		filme.setNome(scan.next());
		
		System.out.print("Insira a faixa etaria: ");
		filme.setFaixaEtaria(scan.nextInt());
		
		System.out.print("Insira as horas de duração: ");
		filme.setHoras(scan.nextInt());
		
		System.out.print("Insira os minutos de duração: ");
		filme.setMinutos(scan.nextInt());
		return filme;
	}
	
	public void ListarFilmes(List<Filmes> filmes) {
		if (filmes.isEmpty() == false) {
			for (Filmes filme: filmes) {
				System.out.println("Nome: " + filme.getNome());
			}	
		} else {
			System.out.println("Não ha nenhum filme cadastrado.");
		}
	}
	
	public void ExcluirFilme(List<Filmes> filmes, Scanner scan) {
		if (filmes.isEmpty() == false) {
			System.out.print("Insira o Codigo do filme que deseja deletar: ");
			int j = scan.nextInt();
			for (Filmes filme: filmes) {
				if (filme.getCodigo() == j) {
					filmes.remove(filme);
					System.out.println("O filme com ID " + j + " foi deletado com sucesso.");
				} else {
					System.out.println("Não existe o filme com o codigo " + j);
				}
			}	
		} else {
			System.out.println("Não ha filmes cadastrados.");
		}
	}
	
	public void AlterarFilme(List<Filmes> filmes, Scanner scan) {
		if (filmes.isEmpty() == false) {
			System.out.print("Insira o codigo do filme que deseja alterar: ");
			int j = scan.nextInt();
			for (Filmes filme: filmes) {
				if (filme.getCodigo() == j) {
					System.out.print("Insira o novo codigo do filme: ");
					filme.setCodigo(scan.nextInt());
					System.out.print("Insira o novo nome do filme: ");
					filme.setNome(scan.next());
					System.out.print("Insira a nova faixa etaria: ");
					filme.setFaixaEtaria(scan.nextInt());
					System.out.print("Insira a nova duração em horas: ");
					filme.setHoras(scan.nextInt());
					System.out.print("Insira a nova duração em minutos: ");
					filme.setMinutos(scan.nextInt());
				} else {
					System.out.println("Não existe nenhum filme com o codigo " + j);
				}
			}	
		} else {
			System.out.println("Não existe nenhum filme cadastrado.");
		}
	}
	
	//METODOS MENU FUNCIONARIOS
	
	public Funcionarios CadastroFuncionario(int id, Funcionarios funcionario, Scanner scan) {
		funcionario.setId(id);
		System.out.println("O ID do funcionario sera: " + funcionario.getId());
		
		System.out.print("Qual nome do funcionario? ");
		funcionario.setNome(scan.next());
		
		System.out.print("Qual endereço: ");
		funcionario.setEndereco(scan.next());
		
		System.out.print("Qual a idade: ");
		funcionario.setIdade(scan.nextInt());
		
		System.out.print("Qual Telefone: ");
		funcionario.setTelefone(scan.next());
		
		System.out.print("Qual o cargo: ");
		funcionario.setCargo(scan.next());
		
		System.out.print("Qual salario: ");
		funcionario.setSalario(scan.nextFloat());
		
		System.out.print("Funcionario cadastrado com sucesso!");
		
		return funcionario;
	}
	
	public void ListarFuncionarios(List<Funcionarios> funcionarios) {
		if (funcionarios.isEmpty() == false) {
			for (Funcionarios funcionario: funcionarios) {
				System.out.println("ID do Funcionario: " + funcionario.getId() + " Nome: " + funcionario.getNome());
			}
		} else {
			System.out.println("Não existe nenhum funcionario.");
		}
	}
	
	public void ExcluirFuncionario(List<Funcionarios> funcionarios, Scanner scan) {
		if (funcionarios.isEmpty() == false) {
			System.out.print("Insira o ID do funcionario que deseja deletar: ");
			int j = scan.nextInt();
			
			for (Funcionarios funcionario: funcionarios) {
				if (funcionario.getId() == j) {
					funcionarios.remove(funcionario);
					System.out.println("O funcionario com ID " + j + " foi deletador com sucesso!");
				} else {
					System.out.println("Não existe nenhum funcionario com o ID " + j);
				}
			}	
		} else {
			System.out.println("Não existe nenhum funcionario cadastrado.");
		}
	}

	public void AlterarFuncionario(List<Funcionarios> funcionarios, Scanner scan) {
		if (funcionarios.isEmpty() == false ) {
			System.out.print("Insira o ID do funcionario: ");
			int j = scan.nextInt();
			
			for (Funcionarios funcionario: funcionarios) {
				if (funcionario.getId() == j) {
					System.out.print("O ID do funcionario: " + funcionario.getId());
					
					System.out.print("Novo nome do funcionario? ");
					funcionario.setNome(scan.next());
					
					System.out.print("Novo endereço: ");
					funcionario.setEndereco(scan.next());
					
					System.out.print("Nova a idade: ");
					funcionario.setIdade(scan.nextInt());
					
					System.out.print("Novo Telefone: ");
					funcionario.setTelefone(scan.next());
					
					System.out.print("Novo o cargo: ");
					funcionario.setCargo(scan.next());
					
					System.out.print("Novo salario: ");
					funcionario.setSalario(scan.nextFloat());
					
					System.out.print("Funcionario alterado com sucesso!");
				} else {
					System.out.println("Não existe funcionario com o ID " + j);
				}
			}
		}
		
	}
}
