<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
						<li class="active" id="homeButton"><a href="/show_all">Home<span
								class="sr-only">(current)</span></a></li>
						<li id="fazer_pergunta"><a href="/fazer-pergunta">Fazer
								Pergunta</a></li>
					</ul>

					<c:choose>
						<c:when test="${sessionScope.user ne null}">
							<div class="dropdown pull-right">
								<button class="btn btn-default dropdown-toggle" type="button"
									data-toggle="dropdown">
									${sessionScope.user.username}<span
										class="glyphicon glyphicon-user"></span><span class="caret"></span>
								</button>
								<ul class="dropdown-menu">
									<li><a href="#">Meu Perfil</a></li>
									<li><a href="/logout">Logout</a></li>
									<c:if test="${sessionScope.user.isAdmin eq true}">
										<li><a href="/admin/show_panel">Gerenciar Forum</a></li>
									</c:if>
								</ul>
							</div>
						</c:when>

						<c:otherwise>
							<a href="/show-login"><button type="button"
									class="btn btn-secondary pull-right">Fazer login</button></a>
						</c:otherwise>
					</c:choose>
				</div>



			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<div class="page-header">
		<div class="row">
			<h1 class="col-lg-offset-4">
				<a href="/">Monolitos computing</a>
			</h1>
		</div>
	</div>
</header>