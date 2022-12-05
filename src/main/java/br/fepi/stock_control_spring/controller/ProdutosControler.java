package br.fepi.stock_control_spring.controller;

import br.fepi.stock_control_spring.repositorio.ProdutosRepositorio;

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

import br.fepi.stock_control_spring.model.Produtos;

@RestController
@RequestMapping("/produtos")
public class ProdutosControler {

    @Autowired
    private ProdutosRepositorio repositorio;

    @GetMapping
    public List<Produtos> listar(){
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produtos> listarPeloId(@RequestParam(name="id") final Long id){
        return repositorio.findById(id);
    }

    @PostMapping
    public Produtos adicionar(@RequestBody Produtos produtos){
        return repositorio.save(produtos);
    }

    @PutMapping
    public Produtos alterar(@RequestBody Produtos produtos){
        if(produtos.getId()>0)
            return repositorio.save(produtos);
        return null;
    }

    @DeleteMapping
    public String deletar(@RequestBody Produtos produtos){
        if(produtos.getId()>0){
            repositorio.delete(produtos);
            return "Removido com sucesso";
        }
        return "Produtos não encontrado";
    }
}
