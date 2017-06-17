<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<header>
		<div class="page-header">
			<div class="row">
				<h1 class="col-lg-offset-4">Monolitos computing</h1>
			</div>
		</div>
	</header>
	<div class=row>
		<div class="panel panel-default col-lg-6 col-xs-12 col-lg-offset-3">
			<div class="panel-heading">
				<h3 class="panel-title">Login</h3>
			</div>
			<div class="panel-body">
				<c:if test="${erro ne null}">
					<div class="alert alert-danger alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<strong>ERRO!</strong> ${erro}

					</div>
				</c:if>
				<c:if test="${sucesso ne null}">
					<div class="alert alert-success alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						${sucesso}

					</div>
				</c:if>
				<form:form method="POST" action="/login" modelAttribute="form">

					<div class="input-group">

						<span class="input-group-addon" id="basic-addon1">Usuario</span>
						<form:input path="username" cssClass="form-control" />
					</div>
					<br>
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Senha</span>
						<form:password path="password" cssClass="form-control" />
					</div>
					<br>
					<button type="submit" class="btn btn-primary pull-right">Entrar
					</button>
					<button type="button" class="btn btn-default">
						<a href="/cadastro">Cadastrar - se</a>
					</button>

				</form:form>
			</div>
		</div>

	</div>




	<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>