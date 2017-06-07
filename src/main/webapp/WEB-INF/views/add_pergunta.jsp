<form>
	
	<div class="form-group">
		<label for="title">Titulo</label> 
		<input type="text" class="form-control" id="title" type="text" name="title">
	</div>

	<div class="form-group">
		<label for="text">Texto da pergunta</label>
		<textarea class="form-control" id="text" name="text"></textarea>
	</div>

	<div class="form-group">
		<label for="category">Categoria</label> <select class="form-control"
			id="category" name="category">
			<option>Sistemas Operacionais</option>
			<option>Redes de computadores</option>
			<option>Segurança da informção</option>
			<option>Hardware</option>
			<option>Programacao</option>
		</select>
	</div>
	<input type="submit" class="btn btn-primary pull-right" value="Criar pergunta"/>
</form>