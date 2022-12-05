package br.fepi.stock_control_spring.controller;

import br.fepi.stock_control_spring.repositorio.UsuariosRepositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.stock_control_spring.model.Usuarios;

@RestController
@RequestMapping("/usuarios")
public class UsuariosControler {

    @Autowired
    private UsuariosRepositorio repositorio;

    @GetMapping
    public List<Usuarios> listar(){
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuarios> listarPeloId(@RequestParam(name="id") final Long id){
        return repositorio.findById(id);
    }

    @PostMapping
    public Usuarios adicionar(@RequestBody Usuarios usuarios){
        return repositorio.save(usuarios);
    }

    @PutMapping
    public Usuarios alterar(@RequestBody Usuarios usuarios){
        if(usuarios.getId()>0)
            return repositorio.save(usuarios);
        return null;
    }

    @DeleteMapping
    public String deletar(@RequestBody Usuarios usuarios){
        if(usuarios.getId()>0){
            repositorio.delete(usuarios);
            return "Removido com sucesso";
        }
        return "Usuario não encontrado";
    }
}
