package br.com.allfood.servidor.repository;

import org.springframework.data.repository.CrudRepository;


import br.com.allfood.servidor.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
