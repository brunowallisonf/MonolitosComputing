/**
 * Monolitos computing -  Script principal
 */
$.getScript("js/showquestions.js");

$("#fazer_pergunta").on("click",function(){
	$.get("/fazer-pergunta",function(response){
		$("#conteudo").html(response);
	});

});	


$("#homeButton").on("click",function(){
	$.get("/show_all",function(response){
		$("#conteudo").html(response);
	});
	$.getScript("js/showquestions.js");
});

