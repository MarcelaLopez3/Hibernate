   <div class="container-fluid">
    <div class="row">
  	 <div class="col-md-12">
  			  <h2>Agregar Estudiante</h2>
			<form class="form-horizontal" action="<%=request.getContextPath()%>/estudiante/agregarEstudianteProceso.html" method="post" role="form">
				<div class="form-group">
					<label for="title">Nombres</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" class="form-control" name="nombres" id="nombres" placeholder="Ingrese su nombre" required>
					</div>
				</div>
				<div class="form-group">
					<label for="title">Apellidos</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" class="form-control" name="apellidos" id="apellidos" placeholder="Ingrese su apellido" required>
					</div>
				</div>
				<div class="form-group">
					<label for="title">Edad</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" class="form-control" name="edad" id="edad" placeholder="Ingrese su edad" required>
					</div>
				</div>
				<div class="form-group">
					<label for="title">Carnet</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" class="form-control" name="carnet" id="carnet" placeholder="Ingrese su carnet" required>
					</div>
				</div>
				<button type="submit" class="button.primary">Guardar</button>
			</form>
  	
  	      </div>
       </div>
     </div>
	