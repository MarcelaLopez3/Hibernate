package com.udb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.udb.entity.Estudiante;
import com.udb.services.IEstudianteService;

@Controller
@RequestMapping("/estudiante")
public class EstudianteController 
{
	@Autowired
	@Qualifier("estudianteService")
	private IEstudianteService estudianteService;
	
	
	@GetMapping("/")
	public String getHome(){
		return "redirect:estudiantes.html";
	}
	
	@GetMapping("/estudiantes")
	public ModelAndView getEstudiantes(){
		
		ModelAndView model  = new ModelAndView("estudiantes");
		List<Estudiante> listaEstudiantes = estudianteService.getEstudiantes();
		model.addObject("estudiantes", listaEstudiantes);
		return model;
		
	}
	
	@GetMapping("/editarEstudiantesVista/{idEstudiante}")
	public ModelAndView getEditarEstudianteForm(@PathVariable("idEstudiante") String idEstudiante){
		
		ModelAndView model  = new ModelAndView("editarEstudiante");
		Estudiante estudiante = estudianteService.getEstudiante(Long.parseLong(idEstudiante));
		model.addObject("estudiante", estudiante);
		return model;
		
	}
	
	@RequestMapping(value="/editarEstudianteProceso",method=RequestMethod.POST)
	public ModelAndView editarEstudiante(HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("estudiantes");
		String id = request.getParameter("id");
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String edad = request.getParameter("edad");
		String carnet = request.getParameter("carnet");
		
		Estudiante estudiante = estudianteService.updateEstudiante(Long.parseLong(id), nombres, apellidos, edad, carnet);
		if(estudiante!=null){
			model.addObject("exito", "Estudiante actualizado exitosamente :"+estudiante.getNombres());
		}else{
			model.addObject("error", "Ha ocurrido un error al actualizar el estudiante");
		}
		List<Estudiante> listaEstudiantes = estudianteService.getEstudiantes();
		model.addObject("estudiantes", listaEstudiantes);
		return model;
		
	}
	
	@RequestMapping(value="/agregarEstudianteProceso",method=RequestMethod.POST)
	public ModelAndView agregarEstudiante(HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("estudiantes");
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String edad = request.getParameter("edad");
		String carnet = request.getParameter("carnet");
		
		Estudiante estudiante = estudianteService.addCliente(nombres, apellidos, edad, carnet);
		if(estudiante!=null){
			model.addObject("exito", "Estudiante actualizado exitosamente :"+estudiante.getNombre());
		}else{
			model.addObject("error", "Ha ocurrido un error al actualizar el cliente");
		}
		List<Estudiante> listaEstudiantes = estudianteService.getEstudiantes();
		model.addObject("estudiantes", listaEstudiantes);
		
		return model;
		
	}
	
	@RequestMapping(value="/eliminarEstudiante/{idEstudiante}",method=RequestMethod.GET)
	public ModelAndView eliminarEstudiante(@PathVariable("idEstudiante") String idEstudiante){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("estudiantes");
		estudianteService.deleteEstudiante(Long.parseLong(idEstudiante));
		
		List<Estudiante> listaEstudiantes = estudianteService.getEstudiantes();
		model.addObject("estudiantes", listaEstudiantes);
		
		return model;
		
	}
}
