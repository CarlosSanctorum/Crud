package Main;

import java.util.Scanner;
import Controller.ProdutoCRUD;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, Mundo!");

        ProdutoCRUD produtoCRUD = new ProdutoCRUD();
    //fazer um menu de escolhas aqui
        //lembrar loop de repetição
        int opcao = 0;
        int objtc0 = 0;
        String escolhacontinuacao;
        while (opcao != 5) {
            System.out.println("Menu");
            System.out.println("1 - Created");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Listar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //solução para o if e else não ser ignorado

            if (opcao>5) {
                System.out.println("Escolha uma opção valida!");
                System.out.println("Quer continuar? y ou n");
                escolhacontinuacao = scanner.nextLine();

                if (escolhacontinuacao.equals( "S"))
                    {
                        System.out.println("Segue normalmente");
                    }
                        else
                            opcao = 5;
            }

            switch (opcao) {
                case 1:
                System.out.println("Adicionar produto!");
                    produtoCRUD.adicionarProduto();
                break;

                case 2:
                    System.out.println("Alterar produto!");
                    break;

                case 3:
                    System.out.println("Listar Produtos");
                    break;

                case 4:
                    System.out.println("Excluir produto");
                    System.out.println("Qual o ID do produto para ser excluido? :");
                    objtc0 = scanner.nextInt();

                    System.out.println("Excluir produto");


                    break;

                case 5:
                    System.out.println("Encerrando o programma...");
                    break;

                default:
                    System.out.println();
            }

        }
    }
}
