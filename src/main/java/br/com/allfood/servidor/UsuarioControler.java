package br.com.allfood.servidor;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.allfood.servidor.model.Usuario;

import br.com.allfood.servidor.repository.UsuarioRepository;
//@Controller

@RestController
@RequestMapping("/")
public class UsuarioControler {
	
	@Autowired
	private UsuarioRepository repository;

	@RequestMapping(value ="usuario" ,method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> usuario() {
		List<Usuario> usuarios = (List<Usuario>) repository.findAll();
		
		return  new ResponseEntity<List<Usuario>>(usuarios,HttpStatus.OK);
	}
	

}
