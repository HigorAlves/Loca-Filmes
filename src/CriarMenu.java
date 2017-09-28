/**
 * Classe responsavel por fazer toda a iteração com as funções basicas do programa
 * @author Higor Alves
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CriarMenu {
   private int i = 1, j=1;
   
   /**
    * Metodo para criar menu principal chamando o menu de todos os outros metodos
    */
   public void MenuPrincipal(){
       Scanner scan = new Scanner(System.in);
       int op;
       do{
           System.out.println("\n---------- Loca Filmes ----------");
           System.out.println("Escolha uma das opções a baixo:");
           System.out.println("1. Cliente");
           System.out.println("2. Filmes");
           System.out.println("3. Funcionarios");
           System.out.println("0. Sair do Programa");
           System.out.print("Opção: ");
           op = scan.nextInt();
           switch (op){
               case 1:
                   MenuCliente();
                   break;
               case 2:
                   MenuFilme();
                   break;
               case 3:
                   MenuFuncionarios();
                   break;
               default:
                   System.out.println("\nOpção inserida é invalida!");
                   break;
           }
       }while (op != 0);
   }
   /**
    * Metodo que cria e controla todas as funções do cliente
    */
   private void MenuCliente(){
       int op;
       Scanner scan = new Scanner(System.in);
       List<Cliente> clientes;
       clientes = new LinkedList<>();
       do{
           System.out.println("\n---------- Loca Filmes | Clientes ----------");
           System.out.println("1. Cadastrar");
           System.out.println("2. Excluir Cadastro");
           System.out.println("3. Alterar Cadastro");
           System.out.println("4. Alugar Filmes");
           System.out.println("5. Exibir Cadastros");
           System.out.println("0. Voltar ao menu principal");
           System.out.print("Opção: ");
           op = scan.nextInt();
           System.out.println("---------------------------------");
           switch (op){
               case 1:
                   Cliente cliente = new Cliente();
                   cliente.Cadastrar(i);
                   clientes.add(cliente);
                   i++;
                   break;
                   
               case 2: //Pecorre a linkedList ate achar o cliente com o ID selecionado, apos achar o mesmo muda a variavel achou para true e deleta o cliente
                   System.out.print("Insira o ID do cliente que deseja excluir: ");
                   j = scan.nextInt();
                   Excluir(clientes, j);
                   break;
               case 3: //Alterar cadastro
            	   System.out.println("Insira o ID do cliente que quer alterar: ");
            	   j = scan.nextInt();
            	   AlterarCadastro(clientes, j, scan);
            	   break;
               case 4://Alugar Filme
            	   
            	   break;
               case 5: 
                   Listar(clientes);
                   break;
                   
               default:
                   System.out.println("\n Opção Invalida.");
                   break;
           }
       }while (op != 0);
   }
   
   private void MenuFilme(){
       int op;
       Scanner scan = new Scanner(System.in);
       do{
           System.out.println("\n---------- Loca Filmes ----------");
           System.out.println("----------Filmes----------");
           System.out.println("1. Cadastrar");
           System.out.println("2. Excluir");
           System.out.println("3. Alterar Cadastro");
           System.out.println("4. Exibir Filmes");
           System.out.println("0. Menu Principal");
           System.out.print("Opção: ");
           op = scan.nextInt();
           System.out.println("------------------------------");
           switch (op){
               case 1:
                   break;
               default:
                   System.out.println("Opção Invalida");
                   break;
           }
       }while (op != 0);
   }
   
   private void MenuFuncionarios(){
       int op;
       Scanner scan = new Scanner(System.in);
       do{
           System.out.println("\n---------- Loca Filmes ----------");
           System.out.println("---------- Administração ----------");
           System.out.println("1. Cadastrar");
           System.out.println("2. Excluir");
           System.out.println("3. Alterar Cadastro");
           System.out.println("4. Exibir Funcionarios");
           System.out.println("0. Menu Principal");
           System.out.print("Opção: ");
           op = scan.nextInt();
           System.out.println("------------------------------");
           switch (op){
               case 1:
                   break;
               default:
                   System.out.println("Opção Invalida");
                   break;
           }
       }while (op != 0);
   }
   
   private void Excluir(List<Cliente> clientes, int j) {
	   for (Cliente cli: clientes) {
		   if (cli.getId() == j) {
			   System.out.println("\n Cliente a ser deletado: ID: " + cli.getId() + " Nome: " + cli.getNome() + " Telefone: " + cli.getTelefone());
			   clientes.remove(cli);
			   System.out.println("Cliente deletado com sucesso.");
		   }
	   }
   }
   
   /**
    * Listar todos os clientes de uma lista
    * @param clientes Tipo List Cliente
    */
   private void Listar(List<Cliente> clientes) {
	   for (Cliente cli: clientes) {
		   System.out.println("| ID: " + cli.getId() + " | Nome: " + cli.getNome());
	   }
   }
   
   /**
    * Metodo para alterar os dados de um cliente
    * @param clientes Lista em cadeado do tipo Cliente.
    * @param j ID do cliente que devera ser alterado.
    * @param scan Tipo Scanner para pegar as novas entradas.
    */
   private void AlterarCadastro(List<Cliente> clientes, int j, Scanner scan) {
	   for (Cliente cli: clientes) {
		   if (cli.getId() == j) {
			   System.out.print("Insira o novo nome: ");
			   cli.setNome(scan.next());
			   System.out.print("\nInsira o novo Endreço: ");
			   cli.setEndereco(scan.next());
			   System.out.print("\nInsira a nova Idade: ");
			   cli.setIdade(scan.nextInt());
			   System.out.print("\nInsira o novo Telefone: ");
			   cli.setTelefone(scan.next());
			   System.out.println("\nDados do Cliente atualizados com sucesso!");
		   }
	   }
   }
   
   private void AlugarFilme(List<Cliente> clientes) {
	   for (Cliente cli: clientes) {
		   
	   }
   }
}
