package br.com.luiz87005.luiz87005.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ItemDoPedidoDtoLuiz87005 {

    private long id;

    @Positive(message = "O numero da quantidade não pode ser negativo")

    private int quantidade;
    @NotBlank(message = "A descrição é obrigatória")

    private String descricao;

    public ItemDoPedidoDtoLuiz87005() {
    }

    public ItemDoPedidoDtoLuiz87005(long id, int quantidade, String descricao) {
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
