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
			class="col-lg-10 col-lg-offset-1">

			<div class="form-group">
			<label for="senha">Nova senha:</label>
				<input type="password" name="password" class="form-control"
					id="senha" />
			</div>


			<div class="form-group">
				<p id="mensagem"></p>
				<label for="senha2">Confirmação</label>
				<input type="password" class="form-control"
					id="senha2" />
			</div>
			
			<input type="submit" class="btn btn-success pull-right" value="Redefinir senha">
		</form>

	</div>

</body>
</html>