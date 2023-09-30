package br.com.apiproduto.controller;


import br.com.apiproduto.entity.Produto;
import br.com.apiproduto.service.ProdutodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    private final ProdutodoService produtodoService;

    public ProdutoController(ProdutodoService produtodoService) {
        this.produtodoService = produtodoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> buscarTodos(){
        return ResponseEntity.ok(produtodoService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
            var novoProduto = produtodoService.salvar(produto);
            return new ResponseEntity(produto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        produtodoService.delete(id);
        return  ResponseEntity.ok().build();
    }


}
