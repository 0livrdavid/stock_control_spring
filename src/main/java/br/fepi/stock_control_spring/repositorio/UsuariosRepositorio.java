package br.fepi.stock_control_spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.stock_control_spring.model.Usuarios;

public interface UsuariosRepositorio extends JpaRepository<Usuarios, Long> {
    
}
