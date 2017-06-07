/**
 * 
 */

$("#fazer_pergunta").on("click",function(){
	$.get("/fazer-pergunta",function(response){
		$("#conteudo").html(response);
	});
	
})