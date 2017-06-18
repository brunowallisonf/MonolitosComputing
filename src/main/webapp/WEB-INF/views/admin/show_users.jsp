<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="panel panel-default col-lg-10 col-lg-offset-1">
	<div class="panel-heading">Usuarios</div>
	<div class="panel-body">
		<table class="table">
			<thead>
				<tr>
					<th>Nome</th>
					<th>email</th>
					<th>Usuario</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
					<tr>
						<td>${user.fullname}</td>
						<td>${user.email}</td>
						<td class="username">${user.username}</td>
						<td class="removeuser"><a>Remover</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>
</div>