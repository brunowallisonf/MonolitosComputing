<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Monolitos Computing - home</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my"%>
</head>
<body>
	<my:header />
	<div class="row" id="conteudo">

		<div class="panel panel-primary col-lg-10 col-lg-offset-1">
			<div class="panel-heading">${question.title}</div>
			<div class="panel-body">${question.text}</div>
		</div>


	</div>

	<div class="row" id="conteudo">


		<c:forEach var="answer" items="${answers}">
			<div class="panel panel-success col-lg-10 col-lg-offset-1">
				<div class="panel-heading">Resposta por :
					${answer.author.username}</div>
				<div class="panel-body">
					<p>${answer.text}</p>

				</div>
			</div>

		</c:forEach>

	</div>

	<div class="row">
		<form:form action="/private/add_answer?qid=${question.qid}"
			modelAttribute="answer" cssClass="col-lg-10 col-lg-offset-1"
			method="POST">

			<div class="form-group">
				<form:label path="text">Resposta</form:label>
				<form:textarea cssClass="form-control" path="text" />
			</div>

			<input type="submit" class="btn btn-primary pull-right"
				value="Responder">
		</form:form>

	</div>

	<script src="/js/jquery-3.2.1.js"></script>
	<script src="/js/bootstrap.min.js"></script>
</body>


</html>
