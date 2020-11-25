package br.com.finalproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Usuario;

/*
 * DAO => Data Access Object (Design Pattern)
 * Classes que contém os métodos que irão manipular os dados
 * Manipular dos dados = CRUD 
 * C => Create ( inserir  o dado na tabela)
 * R => Read   ( consultar  o dado na tabela)
 * U => Update ( alterar um dado na tabela)
 * D => Delete ( apagar um dado na tabela
 * Classe CrudRepository<1ºnome da ClasseBeans,2ºTipodeDadoPK>
 */

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
	
	public Usuario findByEmailAndSenha(String email, String senha);
	
	
/*
 * save()      => gravar/alterar
 * findAll()   => consultar
 * deleteAll() => apagar
 */
	

}
