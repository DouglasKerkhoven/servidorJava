package br.com.allfood.servidor;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



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
	/*
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
		
	}*/
	
	@RequestMapping(value ="itens" ,method = RequestMethod.GET)
	public ResponseEntity<List<Itens>> item() {
		List<Itens> itens = (List<Itens>) repository.findAll();
		
		return  new ResponseEntity<List<Itens>>(itens,HttpStatus.OK);
	}

}
