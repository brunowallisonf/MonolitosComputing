<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
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
			    <form method="POST" action="login">
				    <div class="input-group">
						  <span class="input-group-addon" id="basic-addon1">Usuario</span>
						  <input type="text" class="form-control" placeholder="Usuario" aria-describedby="basic-addon1" name="username">
					</div>
					<br>
					<div class="input-group">
						  <span class="input-group-addon" id="basic-addon1">Senha</span>
						  <input type="password" class="form-control" placeholder="Senha" aria-describedby="basic-addon1" name="password">
					</div>
					<br>
					<button type="submit" class="btn btn-primary pull-right">Entrar </button>
			    </form>
			    
		 	 </div>
		</div>
	</div>
</body>
</html>