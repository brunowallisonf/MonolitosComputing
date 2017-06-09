/**
 * Monolitos computing main scripts
 */

$("#fazer_pergunta").on("click",function(){
	$.get("/fazer-pergunta",function(response){
		$("#conteudo").html(response);
	});
	
});
$("#homeButton").on("click",function(){
	$.get("/show_all",function(response){
		$("#conteudo").html(response);
	});
	
});