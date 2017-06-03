<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
			    <form method="POST" action="/login">
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
					<button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">Cadastrar - se</button>
					
			    </form>
		 	 </div>
		</div>
		
	</div>
	
	<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Cadastro</h4>
      </div>
      <div class="modal-body">
    <div class="row">
        <form action="cadastrar" method="post" class="col-xs-10">
        
        	<div class="form-group">
		  			<label for="username" class="col-2 col-form-label"> Usuario:</label>
		  			<div class="col-10">
		  			<input class="form-control" type="text" placeholder="Usuario" id="username" name="username">
		  			
  				</div>
			</div>
			
			<div class="form-group">
		  			<label for="fullname" class="col-2 col-form-label">Nome completo:</label>
		  			<div class="col-10">
		  			<input class="form-control" type="text" placeholder="Nome completo" id="fullname" name="fullname">
		  			
  				</div>
			</div>
			
			
			<div class="form-group">
	  			<label for="password" class="col-2 col-form-label">Email: </label>
	 			 <div class="col-10">
	  			  <input class="form-control" type="email" placeholder="Email" id="email" name="email">
	  			</div>
			</div>
			
			<div class="form-group">
  				<label for="password" class="col-2 col-form-label">Password: </label>
 				 <div class="col-10">
 		   			<input class="form-control" type="password" placeholder="senha" id="password" name="password">
 			 	</div>
			</div>
			
			<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        	<input type="submit" class="btn btn-default">
        	
		 </form>
       </div>
       </div>
        
      
     
      
    </div>

  </div>
</div>

<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>