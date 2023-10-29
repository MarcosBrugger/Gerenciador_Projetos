package br.edu.senai.springSA6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.senai.springSA6.orm.Projeto;
import br.edu.senai.springSA6.repository.ProjetoRepository;


@Service
public class ProjetoServiceCRUD {

	@Autowired
	private ProjetoRepository repositorio;
	
	public List<Projeto> listarLivros(){
		return (List<Projeto>)repositorio.findAll();
	}
	
	public Projeto salvarProjetos(Projeto projeto) {
		return repositorio.save(projeto);
	}
	public void apagarProjetos(Integer id) {
		repositorio.deleteById(id);
	}
	public Projeto consultarProjetosId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public Projeto atualizarProjetos(Projeto projeto) {
		return repositorio.save(projeto);
	}
}
