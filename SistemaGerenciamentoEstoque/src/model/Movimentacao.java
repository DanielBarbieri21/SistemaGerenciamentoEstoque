package model;

import java.util.Date;

public class Movimentacao {
    private String tipo; // entrada ou saída
    private int quantidade;
    private Date data;

    public Movimentacao(String tipo, int quantidade, Date data) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
    }

    // Getters e Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }

    @Override
    public String toString() {
        return "Movimentacao [tipo=" + tipo + ", quantidade=" + quantidade + ", data=" + data + "]";
    }
}
