
$("#formUsuario").on("submit",function(event){
	if($("#senha2").val()!=$("#senha").val()){
		event.preventDefault();
		$("#mensagem").text("as senhas nao correspondem");
	}else{
		return true;
	}
	
});