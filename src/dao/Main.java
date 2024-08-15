package dao;

import domain.Conteudo;
import domain.Usuario;

import java.util.Scanner;

public class Main {
    private static Programa programa = new Programa();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------");
            System.out.println("Escolha a opção: ");
            System.out.println("{0} Criar Usuario");
            System.out.println("{1} Login");
            System.out.println("{2} Listar Conteudos");
            System.out.println("{3} Sair");
            System.out.println("---------------------");

            int opc = scan.nextInt();
            scan.nextLine();

            if (opc == 0) {

                System.out.println("Digite o nome do usuario:");
                String nome = scan.nextLine();
                System.out.println("Digite o ID do usuario:");
                Long id = scan.nextLong();
                System.out.println("Digite o passwaord do usuario:");
                Integer passwaord = scan.nextInt();

                Usuario user = new Usuario(nome, id, passwaord);
                programa.criarUsuario(user);

            }  else if (opc == 1) {

                System.out.println("Digite o id do usuario:");
                Long id = scan.nextLong();
                System.out.println("Digite o password do usuario:");
                Integer password = scan.nextInt();

                if (programa.verificaUser(id, password)){
                    menu2();
                }else {
                    System.out.println("Usuario não encontrado.");
                }

            } else if (opc == 2) {
                System.out.println("Lista de conteudos:");
                System.out.println(programa.listarConteudo());

            } else if (opc == 3) {
                System.out.println("Saindo do sistema..");
                scan.close();
                break;
            }
        }

    }

    private static void menu2() {

        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("---------------------");
            System.out.println("Escolha a opção: ");
            System.out.println("{1} Criar conteudo");
            System.out.println("{2} Listar Conteudos");
            System.out.println("{3} Atualizar Conteudo");
            System.out.println("{4} Excluir Conteudo");
            System.out.println("{5} Logout");
            System.out.println("---------------------");

            int opc2 = scan.nextInt();
            scan.nextLine();

            if (opc2 == 1) {
                System.out.println("Digite o tipo do conteudo:");
                String tipo = scan.next();

                System.out.println("Digite o ID do conteudo:");
                Long id = scan.nextLong();

                Conteudo conteudo = new Conteudo(tipo, id);
                programa.criarConteudo(conteudo);

            } else if (opc2 == 2) {
                System.out.println("Lista de conteudos:");
                System.out.println(programa.listarConteudo());

            } else if (opc2 == 3) {
                System.out.println("Digite o ID que deseja alterar:");
                Long antigoID = scan.nextLong();
                System.out.println("Digite as informações do novo conteudo ->");

                System.out.println("Digite o tipo do conteudo:");
                String tipo = scan.next();

                System.out.println("Digite o ID do novo conteudo:");
                Long id = scan.nextLong();
                Conteudo conteudo = new Conteudo(tipo, id);
                programa.alterarConteudo(conteudo, antigoID);
            }

            else if (opc2 == 4) {
                System.out.println("Digite o ID que deseja excluir: ");
                Long id = scan.nextLong();
                programa.excluirConteudo(id);

            }

            else if (opc2 == 5) {
                System.out.println("Fazendo Logout..");
                break;
            }
        }
    }
}
