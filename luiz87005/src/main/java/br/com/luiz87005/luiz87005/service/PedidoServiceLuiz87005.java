package br.com.luiz87005.luiz87005.service;

import br.com.luiz87005.luiz87005.dto.PedidoDtoLuiz87005;
import br.com.luiz87005.luiz87005.repository.PedidoLuiz87005Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoServiceLuiz87005 {

    @Autowired
    private PedidoLuiz87005Repository pedidoRepository;

    @Transactional
    public List<PedidoDtoLuiz87005> findAll() {
        return pedidoRepository.findAll().stream().map((data) -> new PedidoDtoLuiz87005(data.getId(),data.getDataHora(),data.getStatus(), data.getItens())).collect(Collectors.toList());
    }


}
