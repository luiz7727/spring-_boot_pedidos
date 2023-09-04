package br.com.luiz87005.luiz87005.repository;

import br.com.luiz87005.luiz87005.model.PedidoLuiz87005;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidoLuiz87005Repository extends JpaRepository<PedidoLuiz87005,Long> {
}
