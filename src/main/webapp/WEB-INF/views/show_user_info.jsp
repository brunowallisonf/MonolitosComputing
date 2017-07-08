<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<my:header />
	<div class="row">
		<div class="panel panel-default col-lg-10 col-lg-offset-1">
			<div class="panel-heading">Perfil</div>
			<div class="panel-body">
				<table class="table">
					<thead>
						<tr>
							<th>Nome</th>
							<th>Email</th>
							<th>Usuario</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${user.fullname}</td>
							<td>${user.email}</td>
							<td class="username">${user.username}</td>
						</tr>
					</tbody>
				</table>
				<div class="form-group">
					<label for="bio">Bio:</label>
					<textarea class="form-control" rows="5" id="bio"
						readonly="readonly">${user.bio}</textarea>
				</div>

			</div>
		</div>
	</div>
	<script src="/js/jquery-3.2.1.js"></script>
	<script src="/js/bootstrap.min.js"></script>
</body>


</html>


