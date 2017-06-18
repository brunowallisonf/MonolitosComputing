<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div class="panel panel-default col-lg-10 col-lg-offset-1">
	<div class="panel-heading">Perguntas</div>
	<div class="panel-body">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Titulo</th>
					<th>Usuário</th>
					<th>Categoria</th>
				</tr>
			</thead>
			
			<tbody>
			
				<c:forEach var="question" items="${questions}">
					<tr>
						<td class="hidden id">${question.qid}</td>
						<td class="titulo"><a href="/show_question?id=${question.qid}">${question.title}</a></td>
						<td>${question.user.username}</td>
						<c:set var="myText" value="${question.category}" />
						<td>${fn:replace(myText, '_', ' ')}</td>
						<td class="remover"><a>Remover</a></td>
					</tr>

				</c:forEach>

			</tbody>
		</table>

	</div>
</div>