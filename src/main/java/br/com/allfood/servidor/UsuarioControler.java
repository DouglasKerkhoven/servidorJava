package br.com.allfood.servidor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.allfood.servidor.model.Usuario;

import br.com.allfood.servidor.repository.UsuarioRepository;
@Controller

public class UsuarioControler {
	
	@Autowired
	private UsuarioRepository repository;
	
	@RequestMapping("usuario")
	public String Usuario(Model model) {
		
		Iterable<Usuario> usuarios = repository.findAll();
		
		model.addAttribute("usuario", usuarios);
		
		return "usuario";
	}
	

}
