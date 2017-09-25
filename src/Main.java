
//duvida: cadastrar filmes e clientes, quando colocar espaço

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int limiteclientes = 1000;
		int limitefuncionarios = 10;
		int limitefilmes = 5000;
		int i = 0, u = 0, y = 0;
		// i = clientes, u = filmes, y = funcionários
		Cliente[] cliente = new Cliente[limiteclientes];
		Funcionario[] funcionario = new Funcionario[limitefuncionarios];
		Filme[] filme = new Filme[limitefilmes];
		Scanner scan = new Scanner(System.in);
		int opcao, opcao1, opcao2, opcao3, j, k, n, x, referencia1;

		do {
			System.out.println("\n---------------------------"); // menu principal
			System.out.println("Digite o número da opção:");
			System.out.println("1. Cliente");
			System.out.println("2. Filme");
			System.out.println("3. Funcionario");
			System.out.println("0. Sair do programa");
			System.out.println("---------------------------\n");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				do {
					System.out.println("\n-----------------------------");
					System.out.println("1. Cadastrar cliente");
					System.out.println("2. Excluir cadastro");
					System.out.println("3. Alterar cadastro");
					System.out.println("4. Alugar filme");
					System.out.println("5. Exibir cadastros");
					System.out.println("0. Voltar ao menu principal");
					System.out.println("-----------------------------\n");
					opcao1 = scan.nextInt();
					if (opcao1 == 1) {
						i++;
						cliente[i] = new Cliente();
						cliente[i].setNumerofilmesaludagos(0);
						System.out.print("\nInsira o nome do cliente: ");
						cliente[i].setNome(scan.next());
						System.out.print("\nInsira o CPF do cliente: ");
						cliente[i].setCpf(scan.next());
						System.out.print("\nInsira o endereço do cliente: ");
						cliente[i].setEndereco(scan.next());
						System.out.print("\nInsira o telefone do cliente: ");
						cliente[i].setTelefone(scan.next());
						System.out.print("\nInsira a idade do cliente: ");
						scan.nextLine();
						cliente[i].setIdade(scan.nextInt());
						System.out.print("\nO código do cliente " + cliente[i].getNome() + " é: " + i + "\n\n");
					} else if (opcao1 == 2) {
						if (i <= 0) {
							System.err.println("\nNão existem clientes cadastrados.");
						} else {
							for (int m = 1; m <= i; m++) {
								System.out.println("\nCliente: " + cliente[m].getNome() + "\nCódigo: " + m);
							}
							System.out.print("Insira o código do cliente que deseja ter o cadastro excluído: ");
							j = scan.nextInt();
							while (j > i) {
								System.err.println("O cliente não existe.");
								System.out.print("Insira o código do cliente que deseja ter o cadastro alterado: ");
								j = scan.nextInt();
							}
							while (cliente[j].getNumerofilmesaludagos() != 0) {
								for (int k1 = 0; k1 <= cliente[j].getNumerofilmesaludagos(); k1++) {
									referencia1 = cliente[j].filmealugado[k1].getCodigofilme();
									if ((k1 == cliente[j].getNumerofilmesaludagos())) {
										cliente[j].setNumerofilmesaludagos(
												(cliente[j].getNumerofilmesaludagos() - 1));
									} else {
										for (; k1 < 2; k1++) {
											cliente[j].filmealugado[k1] = cliente[j].filmealugado[k1 + 1];
										}
									}
									cliente[j].setNumerofilmesaludagos((cliente[j].getNumerofilmesaludagos() - 1));
									for (int m = 1; m <= u; m++) {
										if (filme[m].getCodigofilme() == referencia1) {
											filme[m].setNfilmesdisponiveis(filme[m].getNfilmesdisponiveis() + 1);
										}
									}
								}
							}
							for (; j <= i; j++) {
								cliente[j] = cliente[j + 1];
							}
							i--;
						}
					} else if (opcao1 == 3) {
						if (i <= 0) {
							System.err.println("\nNão existem clientes cadastrados.");
						} else {
							for (int m = 1; m <= i; m++) {
								System.out.println("\nCliente: " + cliente[m].getNome() + "\nCódigo: " + m);
							}
							System.out.print("\nInsira o código do cliente que deseja ter o cadastro alterado: ");
							j = scan.nextInt();
							while (j > i) {
								System.err.println("O cliente não existe.");
								System.out.print("Insira o código do cliente que deseja ter o cadastro alterado: ");
								j = scan.nextInt();
							}
							do {
								System.out.println("\nCliente: " + cliente[j].getNome());
								System.out.println("\n1. Alterar nome");
								System.out.println("2. Alterar CPF");
								System.out.println("3. Alterar endereço");
								System.out.println("4. Alterar idade");
								System.out.println("5. Alterar telefone");
								System.out.println("0. Retornar\n");
								k = scan.nextInt();
								if (k == 1) {
									System.out.println("\nNome atual: " + cliente[j].getNome());
									System.out.print("Insira o novo nome: ");
									cliente[j].setNome(scan.next());
								} else if (k == 2) {
									System.out.println("\nCPF atual: " + cliente[j].getCpf());
									System.out.print("Insira o novo CPF: ");
									cliente[j].setCpf(scan.next());
								} else if (k == 3) {
									System.out.println("\nEndereço atual: " + cliente[j].getEndereco());
									System.out.print("Insira o novo endereço: ");
									cliente[j].setEndereco(scan.next());
								} else if (k == 4) {
									System.out.println("\nIdade atual: " + cliente[j].getIdade());
									System.out.print("Insira a nova idade: ");
									scan.nextLine();
									cliente[j].setIdade(scan.nextInt());
								} else if (k == 5) {
									System.out.println("\nTelefone atual: " + cliente[j].getTelefone());
									System.out.print("Insira o novo telefone: ");
									cliente[j].setTelefone(scan.next());
								} else if (k != 0) {
									System.out.println("\nDigite um número válido, " + k + " não é uma das opções.");
									System.out.print("Insira novamente a opção: ");
									j = scan.nextInt();
								}
							} while (k != 0);
						}
					} else if (opcao1 == 4) {
						if (i <= 0) {
							System.err.println("\nNão existem clientes cadastrados.");
						} else {
							if (u <= 0) {
								System.err.println("\nNão existem filmes cadastrados.");
							} else {
								for (int m = 1; m <= i; m++) {
									System.out.println("\nCliente: " + cliente[m].getNome() + "\nCódigo: " + m);
								}
								System.out.print("\nInsira o código do cliente que deseja alugar/devolver um filme: ");
								j = scan.nextInt();
								while (j > i) {
									System.err.println("\nO cliente não existe.");
									System.out.print("Insira o código do cliente que deseja ter o cadastro alterado: ");
									j = scan.nextInt();
								}
								System.out.println("\n1. Alugar filme");
								System.out.println("2. Devolver filme\n");
								n = scan.nextInt();
								if (n == 1) {
									if (cliente[j].getNumerofilmesaludagos() >= 3) {
										System.err.println(
												"O Cliente já atingiu o máximo de número de filmes que pode alugar.");
									} else {
										for (int m = 1; m <= u; m++) {
											System.out.println("\nFilme de cadastro número " + m);
											filme[m].exibeFilmes();
										}
										System.out.print("\nInsira o código do filme que deseja ser alugado: ");
										k = scan.nextInt();
										while (k > u || k <= 0) {
											System.err
													.print("Código inserido incorretamente, insira um número válido: ");
											k = scan.nextInt();
										}
										if (cliente[j].getIdade() < filme[k].getIdademin()) {
											System.out.println("A idade do cliente é menor do que a idade mínima para alugar o filme.");
										} else {
										cliente[j].filmealugado[cliente[j].getNumerofilmesaludagos()] = filme[k];
										cliente[j].setNumerofilmesaludagos((cliente[j].getNumerofilmesaludagos() + 1));
										filme[k].setNfilmesdisponiveis(filme[k].getNfilmesdisponiveis() - 1);
										System.out.println(cliente[j].getNumerofilmesaludagos());
										// retirar essa variável
									} }
								} else if (n == 2) {
									if (cliente[j].getNumerofilmesaludagos() == 0) {
										System.err.println("O cliente não alugou nenhum filme.");
									} else {
										System.out.println("\nFilmes alugados pelo cliente " + cliente[j].getNome());
										for (int m = 0; m < cliente[j].getNumerofilmesaludagos(); m++) {
											System.out.println("\nFilme: " + cliente[j].filmealugado[m].getNome()
													+ "\ncódigo de locação: " + (m + 1));
										}
										System.out
												.print("Insira o código de locação cujo filme deseja ser devolvido: ");
										k = scan.nextInt();
										k = k - 1;
										referencia1 = cliente[j].filmealugado[k].getCodigofilme();
										if ((k == cliente[j].getNumerofilmesaludagos())) {
											cliente[j].setNumerofilmesaludagos(
													(cliente[j].getNumerofilmesaludagos() - 1));
										} else {
											for (; k < 2; k++) {
												cliente[j].filmealugado[k] = cliente[j].filmealugado[k + 1];
											}
										}
										cliente[j].setNumerofilmesaludagos((cliente[j].getNumerofilmesaludagos() - 1));
										for (int m = 1; m <= u; m++) {
											if (filme[m].getCodigofilme() == referencia1) {
												filme[m].setNfilmesdisponiveis(filme[m].getNfilmesdisponiveis() + 1);
											}
										}
									}
								}
							}
						}
					} else if (opcao1 == 5) {
						if (i <= 0) {
							System.err.println("\nNão existem clientes cadastrados.");
						} else {
							for (int m = 1; m <= i; m++) {
								System.out.println("\nCliente de cadastro número " + m);
								cliente[m].mostraInfo();
							}
						}
					} else if (opcao1 != 0) {
						System.err.println("\nNúmero inválido inserido, encerrando processo.");
						opcao1 = 0;
					}
				} while (opcao1 != 0);
				break;
			case 2:
				do {
					System.out.println("\n-----------------------------");
					System.out.println("1. Cadastrar filme");
					System.out.println("2. Excluir filme");
					System.out.println("3. Alterar cadastro de filme");
					System.out.println("4. Exibir filmes");
					System.out.println("0. Voltar ao menu principal");
					System.out.println("-----------------------------\n");
					opcao2 = scan.nextInt();
					if (opcao2 == 1) {
						u++;
						filme[u] = new Filme();
						System.out.print("\nInsira o nome do filme: ");
						filme[u].setNome(scan.next());
						System.out.print("\nInsira o gênero do filme: ");
						filme[u].setGenero(scan.next());
						System.out.print("\nInsira a duração do filme: ");
						scan.nextLine();
						filme[u].setDuracao(scan.nextInt());
						System.out.print("\nInsira a idade mínima para alugar o filme: ");
						scan.nextLine();
						filme[u].setIdademin(scan.nextInt());
						System.out.print("\nInsira a quantidade disponível: ");
						scan.nextLine();
						filme[u].setNfilmesdisponiveis(scan.nextInt());
						System.out.print("\n\nO código do filme " + filme[u].getNome() + " é: " + u + "\n\n");
						filme[u].setCodigofilme(u);
					} else if (opcao2 == 2) {
						if (u <= 0) {
							System.err.println("\nNão existem filmes cadastrados.");
						} else {
							for (int m = 1; m <= u; m++) {
								System.out.println("\nFilme: " + filme[m].getNome() + "\nCódigo: " + m);
							}
							System.out.print("\nInsira o código do filme que deseja excluir: ");
							j = scan.nextInt();
							while (j > u) {
								System.err.println("\nO filme não existe.");
								System.out.print("Insira o código do filme que deseja excluir: ");
								j = scan.nextInt();
							}
							for (; j <= u; j++) {
								filme[j] = filme[j + 1];
							}
							u--;
						}
					} else if (opcao2 == 3) {
						if (u <= 0) {
							System.err.println("\nNão existem filmes cadastrados.");
						} else {
							for (int m = 1; m <= u; m++) {
								System.out.println("\nFilme: " + filme[m].getNome() + " Código: " + m);
							}
							System.out.print("\nInsira o código do filme que deseja ter o cadastro alterado: ");
							j = scan.nextInt();
							while (j > u) {
								System.err.println("O filme não existe.");
								System.out.print("Insira o código filme que deseja ter o cadastro alterado: ");
								j = scan.nextInt();
							}
							do {
								System.out.print("\nFilme :" + filme[j].getNome());
								System.out.println("\n1. Alterar nome");
								System.out.println("2. Alterar gênero");
								System.out.println("3. Alterar duração");
								System.out.println("4. Alterar idade mínima");
								System.out.println("5. Alterar Quantidade disponível");
								System.out.println("0. Cancelar");
								k = scan.nextInt();
								if (k == 1) {
									System.out.println("\nNome atual: " + filme[j].getNome());
									System.out.print("Insira o novo nome: ");
									filme[j].setNome(scan.next());
								} else if (k == 2) {
									System.out.println("\nGênero atual: " + filme[j].getGenero());
									System.out.print("Insira o novo gênero: ");
									filme[j].setGenero(scan.next());
								} else if (k == 3) {
									System.out.println("\nDuração atual: " + filme[j].getDuracao());
									System.out.print("Insira a nova duração (em minutos): ");
									scan.nextLine();
									filme[j].setDuracao(scan.nextInt());
								} else if (k == 4) {
									System.out.println("\nIdade mínima atual: " + filme[j].getIdademin());
									System.out.print("Insira a nova idade mínima para alugar o filme: ");
									scan.nextLine();
									filme[j].setIdademin(scan.nextInt());
								} else if (k == 5) {
									System.out.println(
											"\nQUantidade disponível atual: " + filme[j].getNfilmesdisponiveis());
									System.out.print("Insira a nova quantidade de filmes disponíveis: ");
									scan.nextLine();
									filme[j].setNfilmesdisponiveis(scan.nextInt());
								} else if (k != 0) {
									System.out.println("\nDigite um número válido, " + k + " não é uma das opções.");
									System.out.print("Insira novamente a opção: ");
									k = scan.nextInt();
								}
							} while (k != 0);
						}
					} else if (opcao2 == 4) {
						if (u <= 0) {
							System.err.println("\nNão existem filmes cadastrados.");
						} else {
							for (int m = 1; m <= u; m++) {
								System.out.println("\nFilme de cadastro número " + m);
								filme[m].exibeFilmes();
							}
						}
					} else if (opcao2 != 0) {
						System.err.println("\nNúmero inválido inserido, encerrando processo.");
						opcao2 = 0;
					}
				} while (opcao2 != 0);
				break;
			case 3:
				do {
					System.out.println("\n-----------------------------");
					System.out.println("1. Área do administrador");
					System.out.println("2. Área dos funcionários");
					System.out.println("3. Exibir funcionários");
					System.out.println("0. Voltar ao meno principal");
					System.out.println("-----------------------------\n");
					opcao3 = scan.nextInt();
					if (opcao3 == 1) {
						String senha = "admin";
						String senha1;
						System.out
								.println("\nInsira a senha do administrador para acessar essa área ou 0 para cancelar");
						senha1 = scan.next();
						while (!senha1.equals(senha) && !senha1.equals("0")) {
							System.err.print("\nSenha incorreta, tente novamente ou insira 0 para cancelar");
							senha1 = scan.next();
						}
						if (senha1.equals(senha)) {
							do {
								System.out.println("\n----------------------------------");
								System.out.println("1. Cadastrar funcionário");
								System.out.println("2. Excluir funcionário");
								System.out.println("3. Alterar cadastro de funcionário");
								System.out.println("0. Voltar ao menu de funcionários");
								System.out.println("----------------------------------\n");
								x = scan.nextInt();
								if (x == 1) {
									y++;
									funcionario[y] = new Funcionario();
									funcionario[y].setNumerofilmesaludagos(0);
									System.out.print("\nInsira o nome do funcionário: ");
									funcionario[y].setNome(scan.next());
									System.out.print("\nInsira o CPF do funcionário: ");
									funcionario[y].setCpf(scan.next());
									System.out.print("\nInsira o endereço do funcionário: ");
									funcionario[y].setEndereco(scan.next());
									System.out.print("\nInsira o telefone do funcionário: ");
									funcionario[y].setTelefone(scan.next());
									System.out.print("\nInsira a idade do funcionário: ");
									scan.nextLine();
									funcionario[y].setIdade(scan.nextInt());
									System.out.print("\nInsira o salário do funcionário (em reais): ");
									scan.nextLine();
									funcionario[y].setSalario(scan.nextFloat());
									System.out.print("\nInsira a senha pessoal do funcionário: ");
									funcionario[y].setSenha(scan.next());
									System.out.print("\nO código do funcionário " + funcionario[y].getNome() + " é: "
											+ y + "\n\n");
								} else if (x == 2) {
									if (y <= 0) {
										System.err.println("\nNão existem funcionários cadastrados.");
									} else {
										for (int m = 1; m <= y; m++) {
											System.out.println(
													"\nFuncionário: " + funcionario[m].getNome() + "\nCódigo: " + m);
										}
										System.out.println(
												"\nInsira o código do funcionario que deseja ter o cadastro excluído: ");
										j = scan.nextInt();
										while (j > y) {
											System.err.println("O funcionário não existe.");
											System.out.println(
													"Insira o código do funcionário que deseja ter o cadastro excluído: ");
											j = scan.nextInt();
										}
										while (funcionario[j].getNumerofilmesaludagos() != 0) {
											for (int k1 = 0; k1 <= funcionario[j].getNumerofilmesaludagos(); k1++) {
												referencia1 = funcionario[j].filmealugado[k1].getCodigofilme();
												if ((k1 == funcionario[j].getNumerofilmesaludagos())) {
													funcionario[j].setNumerofilmesaludagos(
															(funcionario[j].getNumerofilmesaludagos() - 1));
												} else {
													for (; k1 < 2; k1++) {
														funcionario[j].filmealugado[k1] = funcionario[j].filmealugado[k1 + 1];
													}
												}
												funcionario[j].setNumerofilmesaludagos((funcionario[j].getNumerofilmesaludagos() - 1));
												for (int m = 1; m <= u; m++) {
													if (filme[m].getCodigofilme() == referencia1) {
														filme[m].setNfilmesdisponiveis(filme[m].getNfilmesdisponiveis() + 1);
													}
												}
											}
										}
										for (; j <= y; j++) {
											funcionario[j] = funcionario[j + 1];
										}
										y--;
									}
								} else if (x == 3) {
									if (y <= 0) {
										System.err.println("\nNão existem funcionários cadastrados.");
									} else {
										for (int m = 1; m <= y; m++) {
											System.out.println(
													"\nFuncionário: " + funcionario[m].getNome() + "\nCódigo: " + m);
										}
										System.out.print(
												"\nInsira o código do funcionário que deseja ter o cadastro alterado: ");
										j = scan.nextInt();
										while (j > y) {
											System.err.println("O funcionário não existe.");
											System.out.println(
													"Insira o código do funcionário que deseja ter o cadastro alterado: ");
											j = scan.nextInt();
										}
										do {
											System.out.print("\nFuncionário: " + funcionario[j].getNome());
											System.out.println("\n1. Alterar nome");
											System.out.println("2. Alterar CPF");
											System.out.println("3. Alterar endereço");
											System.out.println("4. Alterar idade");
											System.out.println("5. Alterar telefone");
											System.out.println("6. Alterar salário");
											System.out.println("7. Alterar senha");
											System.out.println("0. Cancelar");
											k = scan.nextInt();
											if (k == 1) {
												System.out.println("\nNome atual: " + funcionario[j].getNome());
												System.out.print("Insira o novo nome");
												funcionario[j].setNome(scan.next());
											} else if (k == 2) {
												System.out.println("\nCPF atual: " + funcionario[j].getCpf());
												System.out.print("Insira o novo CPF");
												funcionario[j].setCpf(scan.next());
											} else if (k == 3) {
												System.out.println("\nEndereço atual: " + funcionario[j].getEndereco());
												System.out.print("Insira o novo endereço");
												funcionario[j].setEndereco(scan.next());
											} else if (k == 4) {
												System.out.println("\nIdade atual: " + funcionario[j].getIdade());
												System.out.print("Insira a nova idade");
												scan.nextLine();
												funcionario[j].setIdade(scan.nextInt());
											} else if (k == 5) {
												System.out.println("\nTelefone atual: " + funcionario[j].getTelefone());
												System.out.print("Insira o novo telefone");
												funcionario[j].setTelefone(scan.next());
											} else if (k == 6) {
												System.out.println("\nSalário atual: " + funcionario[j].getSalario());
												System.out.print("Insira o novo salário");
												scan.nextLine();
												funcionario[j].setSalario(scan.nextFloat());
											} else if (k == 7) {
												System.out.println("\nSenha atual: " + funcionario[j].getSenha());
												System.out.print("Insira a nova senha");
												funcionario[j].setSenha(scan.next());
											} else if (k != 0) {
												System.err.println(
														"\nDigite um número válido, " + k + " não é uma das opções.");
												System.out.print("Insira novamente a opção: ");
												k = scan.nextInt();
											}
										} while (k != 0);
									}
								} else if (x != 0) {
									System.err.println("\nDigite um número válido, " + x + " não é uma das opções.");
									System.out.print("Insira novamente a opção: ");
									x = scan.nextInt();
								}
							} while (x != 0);
						}
					} else if (opcao3 == 2) {
						if (y <= 0) {
							System.err.println("\nNão existem funcionários cadastrados.");
						} else {
							for (int m = 1; m <= y; m++) {
								System.out.println("\nFuncionário: " + funcionario[m].getNome() + "\nCódigo: " + m);
							}
							System.out.print("\nInsira o código do funcionário que está acessando: ");
							j = scan.nextInt();
							while (j > y) {
								System.err.println("\nO funcionário não existe.");
								System.out.print("Insira o código do cliente que deseja ter o cadastro alterado: ");
								j = scan.nextInt();
							}
							System.out.print("\nInsira a sua senha: ");
							String senha1;
							senha1 = scan.next();
							while (!senha1.equals(funcionario[j].getSenha()) && !senha1.equals(0)) {
								System.err.print("\nSenha incorreta, tente novamente ou insira 0 para cancelar: ");
								senha1 = scan.next();
							}
							if (senha1.equals(funcionario[j].getSenha())) {
								System.out.println("1. Alugar/Devolver filme");
								System.out.println("2. Alterar senha");
								System.out.println("0. Cancelar");
								x = scan.nextInt();
								if (x == 1) {
									System.out.println("\n1. Alugar filme");
									System.out.println("2. Devolver filme");
									n = scan.nextInt();
									if (n == 1) {
										if (funcionario[j].getNumerofilmesaludagos() >= 3) {
											System.err.println(
													"O Funcionário já atingiu o máximo de número de filmes que pode alugar.");
										} else {
											for (int m = 1; m <= u; m++) {
												System.out.println("\nFilme de cadastro número " + m);
												filme[m].exibeFilmes();
											}
											System.out.print("\nInsira o código do filme que deseja ser alugado: ");
											k = scan.nextInt();
											while (k > u || k <= 0) {
												System.err.print(
														"\nCódigo inserido incorretamente, insira um número válido: ");
												k = scan.nextInt();
											}
											funcionario[j].filmealugado[funcionario[j]
													.getNumerofilmesaludagos()] = filme[k];
											funcionario[j].setNumerofilmesaludagos(
													(funcionario[j].getNumerofilmesaludagos() + 1));
											filme[k].setNfilmesdisponiveis(filme[k].getNfilmesdisponiveis() - 1);
											System.out.println(funcionario[j].getNumerofilmesaludagos());
											// retirar essa variável
										}
									} else if (n == 2) {
										if (funcionario[j].getNumerofilmesaludagos() == 0) {
											System.err.println("O funcionario não alugou nenhum filme.");
										} else {
											System.out.println(
													"\nFilmes alugados pelo funcionario " + funcionario[j].getNome());
											for (int m = 0; m < funcionario[j].getNumerofilmesaludagos(); m++) {
												System.out
														.println("\nFilme: " + funcionario[j].filmealugado[m].getNome()
																+ "\ncódigo de locação: " + (m + 1));
											}
											System.out.print(
													"\nInsira o código de locação cujo filme deseja ser devolvido: ");
											k = scan.nextInt();
											k = k - 1;
											referencia1 = funcionario[j].filmealugado[k].getCodigofilme();
											if ((k == funcionario[j].getNumerofilmesaludagos())) {
												funcionario[j].setNumerofilmesaludagos(
														(funcionario[j].getNumerofilmesaludagos() - 1));
											} else {
												for (; k < 2; k++) {
													funcionario[j].filmealugado[k] = funcionario[j].filmealugado[k + 1];
												}
											}
											funcionario[j].setNumerofilmesaludagos(
													(funcionario[j].getNumerofilmesaludagos() - 1));
											for (int m = 1; m <= u; m++) {
												if (filme[m].getCodigofilme() == referencia1) {
													filme[m].setNfilmesdisponiveis(
															filme[m].getNfilmesdisponiveis() + 1);
												}
											}
										}
									} else if (x == 2) {
										System.out.println("Insira a sua nova senha: ");
										funcionario[j].setSenha(scan.next());
										senha1 = funcionario[j].getSenha();
									} else if (x != 0) {
										while (x != 0) {
											System.err.println(
													"\nDigite um número válido, " + x + " não é uma das opções.");
											System.out.print("Insira novamente a opção: ");
											x = scan.nextInt();
										}
									}
								}
							}
						}
					} else if (opcao3 == 3) {
						if (y <= 0) {
							System.err.println("\nNão existem funcionários cadastrados.");
						} else {
							for (int m = 1; m <= y; m++) {
								System.out.println("\nFuncionário de código: " + m);
								funcionario[m].monstraFuncionario();
							}
						}
					} else if (opcao3 != 0) {
						System.err.println("\nNúmero inválido inserido, encerrando processo.");
						opcao3 = 0;
					}
				} while (opcao3 != 0);
				break;
			}
		} while (opcao != 0);
	}
}