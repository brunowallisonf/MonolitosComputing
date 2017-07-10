<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Redefinição de senha</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
<%@ taglib tagdir="/WEB-INF/tags" prefix="my"%>
</head>
<body>
	<my:header />
	<div class="row">
		<form action="/redefine_pass?token=${param.token}" method="post"
			class="col-lg-6 col-lg-offset-3">

			<div class="form-group">
				<label for="senha">Nova senha:</label> <input type="password"
					name="password" class="form-control" id="senha" />
			</div>

			<input type="submit" class="btn btn-success pull-right"
				value="Redefinir senha">
		</form>

	</div>
	<script src="/js/jquery-3.2.1.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/formedit.js"></script>
</body>
</html>