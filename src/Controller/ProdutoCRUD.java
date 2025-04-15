package Controller;
import Model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoCRUD {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarProduto() {
        //aqui não poderia ficar um loop adicionando o id conforme eu vou add novos produtos?
        System.out.println("Digite o ID do produto");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome produto");
        String nome = scanner.nextLine();

        System.out.print("Preço = ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade = ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(id, nome, preco, quantidade);
        produtos.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }
}
