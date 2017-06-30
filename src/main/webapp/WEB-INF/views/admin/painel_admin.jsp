<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Painel de controle</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
</head>
<body>
	<my:header />
	<ul class="nav nav-tabs">
		<li class="active" id="tabuser"><a data-toggle="tab" href="#home">Usuarios</a></li>
		<li id="tabperguntas"><a data-toggle="tab" href="#perguntas">Perguntas</a></li>

	</ul>

	<div class="tab-content">
		<div id="home" class="tab-pane fade in active">
		<c:import url="show_users.jsp"></c:import>
		</div>

		<div id="perguntas" class="tab-pane fade">
		<c:import url="show_questions.jsp"></c:import>
		</div>

	</div>

	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Confirmação</h4>
				</div>
				<div class="modal-body">
					<input type="hidden" id="idmodal">
					<input type="hidden" id="logica">
					<p>Deseja realmente remover?</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary pull-right"
						id="modalclick">Sim</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">Nao</button>
				</div>
			</div>

		</div>
	</div>

	<script src="/js/jquery-3.2.1.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/admpanel.js"></script>

</body>
</html>