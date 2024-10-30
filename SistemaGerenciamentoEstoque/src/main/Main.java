package main;

import model.Produto;
import service.GerenciamentoEstoque;

public class Main {
    public static void main(String[] args) {
        GerenciamentoEstoque estoque = new GerenciamentoEstoque();

        // Cadastro de produtos
        Produto produto1 = new Produto("Caneta", "Escritório", 100, 1.5, "A1");
        Produto produto2 = new Produto("Caderno", "Escritório", 50, 5.0, "B2");

        estoque.cadastrarProduto(produto1);
        estoque.cadastrarProduto(produto2);

        // Atualização de estoque
        estoque.atualizarEstoque("Caneta", 20, "entrada");
        estoque.atualizarEstoque("Caderno", 10, "saída");

        // Listar produtos
        estoque.listarProdutos();
    }
}

