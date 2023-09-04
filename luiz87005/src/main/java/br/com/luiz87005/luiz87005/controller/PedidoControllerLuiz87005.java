package br.com.luiz87005.luiz87005.controller;

import br.com.luiz87005.luiz87005.dto.PedidoDtoLuiz87005;
import br.com.luiz87005.luiz87005.service.PedidoServiceLuiz87005;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PedidoControllerLuiz87005 {

    @Autowired
    private PedidoServiceLuiz87005 pedidoService;

    @GetMapping("/pedidos")
    public List<PedidoDtoLuiz87005> findAll() {
        return pedidoService.findAll();
    }
}
