function confirmar() {
	let resposta = confirm("Confirma a exclusão do Projeto?")
	if (resposta === true) {
		window.location.href = "delete?id=" + id
	}
}