<%@ include file="Header.jsp" %>
<section class="wrapper">
		<div class="inner">
<div class="container-fluid">

  <div class="row">
  	<div class="col-md-8 offset-md-3">
  			  <h2>Editando la Materia: ${materia.nombreMateria }</h2>
			<form class="form-horizontal"  action="<%=request.getContextPath()%>/materia/editarMateriaProceso.html" method="post" role="form">
				<input type="hidden" value="${materia.id }"	 name="id" id="id">
				<div class="form-group">
					<label for="title">Nombre</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" value="${materia.nombreMateria }"	class="form-control" name="nombreMateria" id="nombreMateria" placeholder="Ingrese nombre de la materia" required>
					</div>
				</div>
				<div class="form-group">
					<label for="title">Descripcion</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <textarea class="form-control" name="descripcionMateria" id="descripcionMateria"  required>${materia.descripcionMateria }</textarea>
					</div>
				</div>
								<div class="form-group">
					<label for="title">Hora Clase</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" value="${materia.horasMateria }"	class="form-control" name="horasMateria" id="horasMateria" placeholder="Ingrese Horas Clases" required>
					</div>
				</div>
								<div class="form-group">
					<label for="title">UV</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" value="${materia.uvMateria }"	class="form-control" name="uvMateria" id="uvMateria" placeholder="Ingrese UV"  required>
					</div>
				</div>
				<button type="submit" class="button.primary">Actualizar</button>
			</form>
  	
  	</div>
 </div>
</div>
</div>
</section>
<%@ include file="footer.jsp" %>