package br.com.carlo.ecommerce.projeto.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.querydsl.core.annotations.QueryEntity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@QueryEntity
@Document("produto")
public class Produto {
	@Id
	private String id;
	
	private String codigo;
	
	private String nome;
	
	private Float preco;
}
