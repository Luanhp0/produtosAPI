package io.github.curso.produtosApi.controller;


import io.github.curso.produtosApi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //marca a classe para ser uma classe rest
@RequestMapping("/produtos")  //marca a url do controller
public class ProdutoController {

    @PostMapping //enviar dados / salvar / criar um recurso do servidor
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido" + produto);
        return produto;
    }

}
