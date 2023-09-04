package br.com.luiz87005.luiz87005.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "tb_item_do_pedido_luiz87005")
public class ItemDoPedidoLuiz87005 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Positive(message = "O numero da quantidade não pode ser negativo")
    private int quantidade;

    @NotBlank(message = "A descrição é obrigatória")
    private String descricao;


    @ManyToOne(optional = false)
    @JoinColumn(name = "pedido_id")
    private PedidoLuiz87005 pedido;


    public ItemDoPedidoLuiz87005() {

    }

    public ItemDoPedidoLuiz87005(int quantidade, String descricao) {
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

    public PedidoLuiz87005 getPedido() {
        return pedido;
    }

    public void setPedido(PedidoLuiz87005 pedido) {
        this.pedido = pedido;
    }
}
