package br.edu.senai.springSA6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.senai.springSA6.orm.Projeto;
import br.edu.senai.springSA6.services.ProjetoService;


@Controller
public class SAController {
	@Autowired
	private ProjetoService servico;
	
	@GetMapping({"/"})
	public String path() {
        return "index";
    }
	
	@GetMapping({"/projetos"})
	public String listarProjetos(Model modelo) {
        modelo.addAttribute("projeto", servico.listarProjetos());
		return "projetos";
    }
	
	@GetMapping("/projetos/adicionar")
	public String adicionarProjetos(Model modelo) {
		Projeto objprojeto = new Projeto();
		modelo.addAttribute("Projeto", objprojeto);
		return "projetosform";
	}
	
	@PostMapping("/projeto")
	public String salvarProjetos(@ModelAttribute("projeto") Projeto objprojeto) {
		servico.salvarProjetos(objprojeto);
		return "redirect:/projetos";
	}
	@GetMapping({"/projeto/{id}"})
	public String apagarProjeto(@PathVariable Integer id) {
		servico.apagarProjetos(id);
		return "redirect:/Projeto";
	}
	@GetMapping({"/projeto/editar/{id}"})
	public String editarProjeto(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("projeto", servico.consultarProjetosId(id));
		return "editarProjeto";
	}
	@PostMapping("/Projeto/{id}")
	public String atualizarProjeto(@PathVariable Integer id, @ModelAttribute("Projeto") Projeto projeto, Model modelo) {
		Projeto pro = servico.consultarProjetosId(id);
		pro.setId(id);
		pro.setNome(projeto.getNome());
		pro.setAtividade(projeto.getAtividade());
		pro.setDataI(projeto.getDataI());
		pro.setDataF(projeto.getDataF());
		pro.setDepende(projeto.getDepende());
		servico.atualizarProjetos(pro);
		return "redirect:/projetos";
	}
}