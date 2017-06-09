<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div id="conteudo" class="col-lg-8 col-lg-offset-3">

	<form:form action="addquestion" modelAttribute="question">

		<div class="form-group">
			<form:label path="title">Titulo</form:label>
			<form:input cssClass="form-control" path="title" />
		</div>

		<div class="form-group">
			<form:label path="text">Texto</form:label>
			<form:textarea cssClass="form-control" path="text" />
		</div>
		<div class="form-group">
			<form:label path="category">Selecione uma categoria</form:label>
			<form:select path="category" cssClass="form-control">
				<c:forEach var="category" items="${categories}">
					<c:set var="myText" value="${category}" />
					<form:option value="${category}">${fn:replace(myText, '_', ' ')}
				</form:option>
				</c:forEach>

			</form:select>

		</div>

		<input type="submit" class="btn btn-primary pull-right"
			value="Fazer pergunta">
	</form:form>
</div>