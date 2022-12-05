package br.fepi.stock_control_spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.stock_control_spring.model.Produtos;

public interface ProdutosRepositorio extends JpaRepository<Produtos, Long> {
    
}
