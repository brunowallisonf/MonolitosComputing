/**
 * 
 */

$(".titulo").on("click",function(){
	var id = $(this).siblings(".id").text();
	$.get("/show_question",{id:id},function(response){
		$("#conteudo").html(response);
	});
});

