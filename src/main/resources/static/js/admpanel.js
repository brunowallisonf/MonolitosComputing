/**
 * 
 */

//$.get("/admin/show_users",function(content){
//	$("#home").html(content);
//});
//
//
//$.get("/admin/show_questions",function(content){
//	$("#perguntas").html(content);
//});


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

//$(document).on('click', '.remover', function(){
//	var id = $(this).siblings('.id').text();
//	$.get("/admin/delete_question",{id:id},function(content){
//		$("#perguntas").html(content);
//	});
//});


//$(document).on('click', '.removeuser', function(){
//	var id = $(this).siblings('.username').text();
//	$.get("/admin/delete_user",{username:id},function(content){
//		$("#home").html(content);
//	});
//});


$(document).on('click', '.remover', function(event){
	event.preventDefault();
	$("#myModal").modal();
	$("#logica").val("delete_question");
	$("#myModal #idmodal").val($(this).siblings('.id').text());
});



$(document).on('click', '.removeruser', function(event){
	event.preventDefault();
	$("#logica").val("delete_user");
	
	$("#myModal").modal();
	$("#myModal #idmodal").val($(this).siblings('.id').text());
});



$(document).on('click', '#modalclick', function(event){
	$("#myModal").modal('toggle');
	var id = $("#myModal #idmodal").val();
	var url = "/admin/"+$("#logica").val();
	
	$.get(url,{id:id},function(content){
		if($("#logica").val()=="delete_user"){
			$("#home").html(content);
		}else{
			$("#perguntas").html(content);
		}
	});
});


$(document).on('click', '.makeAdmin', function(event){
	var id = $(this).closest('td').siblings('.username').text();
	

	$.get("/admin/make_admin",{id:id},function(content){
		$("#home").html(content);
	})
});

$(document).on('click', '.retireAdmin', function(event){
	var id = $(this).closest('td').siblings('.username').text();
	
	$.get("/admin/retire_admin",{id:id},function(content){
		$("#home").html(content);
	})
});





