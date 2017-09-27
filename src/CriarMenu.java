import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CriarMenu {
   private int i = 1, j=1;
   
   public void MenuPrincipal(){
       Scanner scan = new Scanner(System.in);
       int op;
       do{
           System.out.println("\n---------- Loca Filmes ----------");
           System.out.println("Escolha uma das opções a baixo:");
           System.out.println("1. Cliente");
           System.out.println("2. Filmes");
           System.out.println("3. Funcionarios");
           System.out.print("Opção: ");
           op = scan.nextInt();
           System.out.println("---------------------------------");
           
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
   
   private void MenuCliente(){
       int op;
       Scanner scan = new Scanner(System.in);
       List<Cliente> clientes;
       clientes = new LinkedList<>();
       do{ 
           System.out.println("\n---------- Loca Filmes ----------");
           System.out.println("---------- Clientes ----------");
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
               case 2:
                   System.out.print("Insira o ID do cliente que deseja excluir: ");
                   j = scan.nextInt();
                   for (Cliente e: clientes){
                       if (e.getId() == j){
                           System.out.println("\nAchei os dados do cliente que você quer deletar ");
                           System.out.println("ID: " + e.getId() + " Nome: " + e.getNome() + " Telefone: " + e.getTelefone());
                           clientes.remove(e);
                       }
                   }
                   break;
                   
               case 5:
                   for (Cliente e: clientes){
                       System.out.println("| ID: " + e.getId() + " | Nome: " + e.getNome());
                   }
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
}
