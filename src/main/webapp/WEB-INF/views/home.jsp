<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Monolitos Computing - home</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">

<%@ taglib tagdir="/WEB-INF/tags" prefix="my"%>
</head>
<body>
	<my:header/>
	<div class="row" id="conteudo">

		<jsp:include page="show_perguntas.jsp"></jsp:include>

	</div>

	

	<script src="/js/jquery-3.2.1.js"></script>
	<script src="/js/bootstrap.min.js"></script>
</body>


</html>