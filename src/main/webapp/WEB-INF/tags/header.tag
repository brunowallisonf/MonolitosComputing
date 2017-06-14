<%@ tag language="java" pageEncoding="UTF-8"%>


<header>
	<nav class="navbar navbar-fixed">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>


			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="row">
				<div class="collapse navbar-collapse inline"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active" id="homeButton"><a href="/show_all">Home<span class="sr-only">(current)</span></a></li>
						<li id="fazer_pergunta"><a href="/fazer-pergunta">Fazer Pergunta</a></li>
					</ul>
				</div>
				<div class="dropdown pull-right">
					<button class="btn btn-default dropdown-toggle" type="button"
						data-toggle="dropdown">
						${sessionScope.username}<span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="#">Meu Perfil</a></li>
						<li><a href="/logout">Logout</a></li>
					</ul>
				</div>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<div class="page-header">
		<div class="row">
			<h1 class="col-lg-offset-4">Monolitos computing</h1>
		</div>
	</div>
</header>