/**
 * 
 */

$.get("/admin/show_users",function(content){
	$("#home").html(content);
});


$.get("/admin/show_questions",function(content){
	$("#perguntas").html(content);
});


$("#tabuser").on("click",function(){
	$.get("/admin/show_users",function(content){
		$("#home").html(content);
	});
});

$("#tabperguntas").on("click",function(){
	$.get("/admin/show_questions",function(content){
		$("#perguntas").html(content);
	});

});

$(document).on('click', '.remover', function(){
	var id = $(this).siblings('.id').text();
	$.get("/admin/delete_question",{id:id},function(content){
		$("#perguntas").html(content);
	});
});


$(document).on('click', '.removeuser', function(){
	var id = $(this).siblings('.username').text();
	$.get("/admin/delete_user",{username:id},function(content){
		$("#home").html(content);
	});
});
