<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Monolitos Computing - home</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my"%>
</head>
<body>
	<my:header/>

	<div id="conteudo" class="col-lg-8 col-lg-offset-3">

		<form:form action="addquestion" modelAttribute="question">

			<div class="form-group">
				<form:label path="title">Titulo</form:label>
				<form:input cssClass="form-control" path="title" />
			</div>

			<div class="form-group">
				<form:label path="text">Texto</form:label>
				<form:textarea cssClass="form-control" path="text" />
			</div>
			<div class="form-group">
				<form:label path="category">Selecione uma categoria</form:label>
				<form:select path="category" cssClass="form-control">
					<c:forEach var="category" items="${categories}">
						<c:set var="myText" value="${category}" />
						<form:option value="${category}">${fn:replace(myText, '_', ' ')}
				</form:option>
					</c:forEach>

				</form:select>

			</div>

			<input type="submit" class="btn btn-primary pull-right"
				value="Fazer pergunta">
		</form:form>
	</div>


	<script src="js/jquery-3.2.1.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>


</html>



