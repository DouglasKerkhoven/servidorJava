package br.com.allfood.servidor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import br.com.allfood.servidor.repository.ItensRepository;
import br.com.allfood.servidor.model.Itens;


@Controller
public class ItensController {
	@Autowired
	private ItensRepository repository;
	
	@RequestMapping("/")
	public String index() {		
		return"index";
	}
	
	@RequestMapping("itens")
	public String Itens(Model model) {
		
		Iterable<Itens> lista = repository.findAll();
		
		model.addAttribute("itens", lista);
		
		return "itens";
	}
	
	@RequestMapping(value= "salvar", method= RequestMethod.POST)
	public String salvar(@RequestParam("nome") String nome,@RequestParam("valor") String valor,@RequestParam("id") 
	Long id,Model model) {
		
		
		Itens itens = new Itens(nome, valor, id);
		repository.save(itens);
		
		Iterable<Itens> iten = repository.findAll();
		model.addAttribute("itens", iten);
		
		return "itens";
		
	}

}
