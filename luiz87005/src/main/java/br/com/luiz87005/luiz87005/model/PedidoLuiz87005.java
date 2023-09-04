package br.com.luiz87005.luiz87005.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_pedido_luiz87005")
public class PedidoLuiz87005 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "A dataHora é obrigatória")
    private LocalDateTime dataHora;

    @NotBlank(message = "O status do pedido é obrigatório")
    @Enumerated(EnumType.STRING)
    private StatusLuiz87005 status;


    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "pedido")
    private List<ItemDoPedidoLuiz87005> itens = new ArrayList<>();


    public PedidoLuiz87005() {

    }

    public PedidoLuiz87005(LocalDateTime dataHora, StatusLuiz87005 status) {
        this.dataHora = dataHora;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public StatusLuiz87005 getStatus() {
        return status;
    }

    public void setStatus(StatusLuiz87005 status) {
        this.status = status;
    }

    public List<ItemDoPedidoLuiz87005> getItens() {
        return itens;
    }

    public void setItens(List<ItemDoPedidoLuiz87005> itens) {
        this.itens = itens;
    }
}
