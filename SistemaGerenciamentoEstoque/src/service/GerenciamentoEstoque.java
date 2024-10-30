package service;

import model.Produto;
import model.Movimentacao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciamentoEstoque {
    private List<Produto> produtos = new ArrayList<>();
    private List<Movimentacao> movimentacoes = new ArrayList<>();

    // Método para cadastrar um novo produto
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado: " + produto);
    }

    // Método para atualizar o estoque (entrada ou saída)
    public void atualizarEstoque(String nomeProduto, int quantidade, String tipo) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                if (tipo.equalsIgnoreCase("entrada")) {
                    produto.setQuantidade(produto.getQuantidade() + quantidade);
                } else if (tipo.equalsIgnoreCase("saída")) {
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                }
                movimentacoes.add(new Movimentacao(tipo, quantidade, new Date()));
                System.out.println("Estoque atualizado para o produto: " + produto);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    // Método para listar todos os produtos
    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
