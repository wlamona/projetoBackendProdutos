package br.com.carlo.ecommerce.projeto.repositorio;

import br.com.carlo.ecommerce.projeto.modelo.Produto;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends  MongoRepository<Produto, Integer>  {
	
	Produto deleteByCodigo(String codigo);
	
	Produto findByCodigo(String codigo);
	
}
