package br.com.carlo.ecommerce.projeto.servico;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.carlo.ecommerce.projeto.modelo.Produto;
import br.com.carlo.ecommerce.projeto.repositorio.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
@RequiredArgsConstructor
public class ProdutoService {
	
	private final ProdutoRepository produtoRepository;
	
	public Produto salvar(Produto produto) {
		var prod = new Produto();
		prod.setNome(produto.getNome());
		prod.setCodigo(produto.getCodigo());
		prod.setPreco(produto.getPreco());
		return produtoRepository.save(prod);
	}
	
	public List<Produto> all() {
		return produtoRepository.findAll();
	}
	
	public Produto deleteByCodigo(String codigo) {
		return produtoRepository.deleteByCodigo(codigo);
	}
	
	public Produto updateByProdutoAndCodigo(Produto produto, String codigo) {
		Produto prod = produtoRepository.findByCodigo(codigo);
		prod.setCodigo(produto.getCodigo());
		prod.setNome(produto.getNome());
		prod.setPreco(produto.getPreco());
		return produtoRepository.save(prod);
	}
	
}