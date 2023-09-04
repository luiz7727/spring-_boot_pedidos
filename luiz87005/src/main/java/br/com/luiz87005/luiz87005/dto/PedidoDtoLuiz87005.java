package br.com.luiz87005.luiz87005.dto;

import br.com.luiz87005.luiz87005.model.ItemDoPedidoLuiz87005;
import br.com.luiz87005.luiz87005.model.StatusLuiz87005;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoDtoLuiz87005 {

    private long id;

    @NotBlank(message = "A dataHora é obrigatória")
    private LocalDateTime dataHora;
    @NotBlank(message = "O status do pedido é obrigatório")

    private StatusLuiz87005 status;

    private List<ItemDoPedidoDtoLuiz87005> itens = new ArrayList<>();
    public PedidoDtoLuiz87005() {
    }

    public PedidoDtoLuiz87005(long id, LocalDateTime dataHora, StatusLuiz87005 status, List<ItemDoPedidoLuiz87005> itens) {
        this.id = id;
        this.dataHora = dataHora;
        this.status = status;
        this.itens = convertItemPedidoToDto(itens);
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

    public List<ItemDoPedidoDtoLuiz87005> getItens() {
        return itens;
    }

    public List<ItemDoPedidoDtoLuiz87005> convertItemPedidoToDto(List<ItemDoPedidoLuiz87005> itens) {
        List<ItemDoPedidoDtoLuiz87005> result = new ArrayList<>();

        for(ItemDoPedidoLuiz87005 item: itens) {
            result.add(new ItemDoPedidoDtoLuiz87005(item.getId(),item.getQuantidade(),item.getDescricao()));
        }

        return result;
    }
}
