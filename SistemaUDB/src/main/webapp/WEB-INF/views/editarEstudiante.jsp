<%@ include file="Header.jsp" %>
<section class="wrapper">
		<div class="inner">
<div class="container-fluid">

  <div class="row">
  	<div class="col-md-8 offset-md-3">
  			  <h2>Editando al estudiante: ${estudiante.nombre }</h2>
			<form class="form-horizontal"  action="<%=request.getContextPath()%>/estudiante/editarEstudianteProceso.html" method="post" role="form">
				<input type="hidden" value="${estudiante.id }"	 name="id" id="id">
				<div class="form-group">
					<label for="title">Nombres</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" value="${estudiante.nombres }"	class="form-control" name="nombres" id="nombres" placeholder="Ingrese nombre" required>
					</div>
				</div>
				<div class="form-group">
					<label for="title">Apellidos</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" value="${estudiante.apellidos }"	class="form-control" name="apellidos" id="apellidos" placeholder="Ingrese apellido" required>
					</div>
				</div>
								<div class="form-group">
					<label for="title">Edad</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" value="${estudiante.edad }"	class="form-control" name="edad" id="edad" placeholder="Ingrese edad" required>
					</div>
				</div>
								<div class="form-group">
					<label for="title">Carnet</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" value="${estudiante.carnet }"	class="form-control" name="carnet" id="carnet"  placeholder="Ingrese carnet" required>
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