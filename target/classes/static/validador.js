function validar() {
	
	let nome = frmPrjeto.nome.value
	let atividade = frmProjeto.atividade.value
	let dataI = frmProjeto.dataI.value
	let dataF = frmProjeto.dataF.value
	let depende = frmProjeto.depende.value
	if (nome === "") {
		alert('Preencha o campo Título')
		frmPrjeto.nome.focus()
		return false
	} else if (atividade === "") {
		alert('Preencha o campo Autor')
		frmProjeto.atividade.focus()
		return false
	} else if (dataI === "") {
		alert('Preencha o campo Editora')
		frmProjeto.dataI.focus()
		return false
	} else if (dataF === "") {
		alert('Preencha o campo ISBN')
		frmProjeto.dataF.focus()
		return false
	} else if (depende === "") {
		alert('Preencha o campo ISBN')
		frmProjeto.depende.focus()
		return false
	} else {
		document.forms["frmProjeto"].submit()
	}
}