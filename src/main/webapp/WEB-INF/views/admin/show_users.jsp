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
						<td class="hidden id">${user.username}</td>
						<td class="username"><a
							href="/show_user_perfil?username=${user.username}">${user.username}</a></td>
						<td>${user.fullname}</td>
						<td>${user.email}</td>


						<c:choose>
							<c:when test="${user.isAdmin eq false}">
								<td><button type="button"
										class="btn btn-outline-primary makeAdmin">Tornar
										admin</button></td>
							</c:when>
							<c:otherwise>
								<td><button type="button"
										class="btn btn-danger retireAdmin">Retirar admin</button></td>
							</c:otherwise>
						</c:choose>
						<td class="removeruser"><button type="button"
								class="btn btn-link">Remover</button></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>
</div>


