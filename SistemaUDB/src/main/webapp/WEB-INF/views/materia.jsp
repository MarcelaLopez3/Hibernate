
   <div class="container-fluid">
    <div class="row">
  	 <div class="col-md-12">
  			  <h2>Agregar Materia</h2>
			<form class="form-horizontal" action="<%=request.getContextPath()%>/materia/agregarMateriaProceso.html" method="post" role="form">
				<div class="form-group">
					<label for="title">Nombre</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" class="form-control" name="nombreMateria" id="nombreMateria" placeholder="Ingrese el nombre de la materia" required>
					</div>
				</div>
				<div class="form-group">
					<label for="title">Descripcion</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <textarea class="form-control" name="descripcionMateria" id="descripcionMateria"  required>Ingrese descripcion</textarea>
					</div>
				</div>
				<div class="form-group">
					<label for="title">Hora Clase</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" class="form-control" name="horasMateria" id="horasMateria" placeholder="Ingrese Hora Clase" required>
					</div>
				</div>
				<div class="form-group">
					<label for="title">UV</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" class="form-control" name="uvMateria" id="uvMateria" placeholder="Ingrese su UV" required>
					</div>
				</div>
				<button type="submit" class="button.primary">Guardar</button>
			</form>
  	
  	      </div>
       </div>
     </div>
	