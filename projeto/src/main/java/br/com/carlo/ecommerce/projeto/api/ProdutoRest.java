package br.com.carlo.ecommerce.projeto.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import br.com.carlo.ecommerce.projeto.modelo.Produto;
import br.com.carlo.ecommerce.projeto.servico.ProdutoService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


import lombok.RequiredArgsConstructor;

@Tag(description = "${api.produto.value}", name = "Produto")
@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoRest {
	
	private final ProdutoService produtoService;
	
	@Operation(summary = "${api.produto.list.summary}", description = "${api.produto.list.description}")
	@GetMapping
	public List<Produto> listar() {
		return produtoService.all();
	}
	
	@Operation(summary = "${api.produto.delete.summary}", 
			description = "${api.produto.delete.description}")
	@DeleteMapping(path = "/{codigo}")
	public Produto deletar(
			@PathVariable(value = "codigo", required = true) String codigo) {
		return produtoService.deleteByCodigo(codigo);
	}
	
	@Operation(summary = "${api.produto.update.summary}", 
			description = "${api.produto.update.description}")
	@PutMapping(path = "/{codigo}", consumes = APPLICATION_JSON_VALUE)
	public Produto atualizar(
			@PathVariable(value = "codigo", required = true) String codigo,
			@RequestBody Produto produto) {
		return produtoService.updateByProdutoAndCodigo(produto, codigo);
	}
	
	@Operation(summary = "${api.produto.save.summary}", description = "${api.produto.save.description}")
	@PostMapping(path = "/", consumes = APPLICATION_JSON_VALUE)
	public Produto cadastrar(@RequestBody Produto produto) {
		return produtoService.salvar(produto);
	}
	
	
	
	

}
