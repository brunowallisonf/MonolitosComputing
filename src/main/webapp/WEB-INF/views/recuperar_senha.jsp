<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recuperaçao de senha</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my"%>
</head>
<body>
	<my:header />
	<div class="row">

		<form action="/recover_senha" method="post"
			class="col-lg-4 col-lg-offset-4">
			<c:if test="${erro ne null}">
				<div class="alert alert-danger">
					<strong>Erro!</strong> ${erro}
				</div>
			</c:if>
			<div class="input-group">
				<label for="email">Digite seu email de recuperação</label> <input
					type="email" class="form-control" name="email" id="email" />
			</div>
			<input type="submit" class="btn btn-success pull-right">
		</form>
	</div>

</body>
</html>