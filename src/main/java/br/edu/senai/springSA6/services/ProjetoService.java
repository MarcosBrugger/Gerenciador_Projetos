package br.edu.senai.springSA6.services;

import java.util.List;

import br.edu.senai.springSA6.orm.Projeto;


public interface ProjetoService {
public List<Projeto> listarProjetos();
	
	public Projeto salvarProjetos(Projeto projeto);

	public void apagarProjetos(Integer id);
	
	public Projeto consultarProjetosId(Integer id);
	
	public Projeto atualizarProjetos(Projeto projeto);
}
