package br.com.allfood.servidor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.allfood.servidor.model.Itens;

public interface ItensRepository extends CrudRepository<Itens, Long> {

}
