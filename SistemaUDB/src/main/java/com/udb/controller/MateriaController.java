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

import com.udb.entity.Materia;
import com.udb.services.IMateriaService;

@Controller
@RequestMapping("/materia")
public class MateriaController 
{
	@Autowired
	@Qualifier("materiaService")
	private IMateriaService materiaService;
	
	
	@GetMapping("/")
	public String getHome(){
		return "redirect:materias.html";
	}
	
	@GetMapping("/materias")
	public ModelAndView getClientes(){
		
		ModelAndView model  = new ModelAndView("materias");
		List<Materia> listaMaterias = materiaService.getProductos();
		model.addObject("materias", listaMaterias);
		return model;
		
	}
	
	@GetMapping("/editarMateriaVista/{idMateria}")
	public ModelAndView getEditarMateriaForm(@PathVariable("idMateria") String idMateria){
		
		ModelAndView model  = new ModelAndView("editarMateria");
		Materia materia = materiaService.getProducto(Long.parseLong(idMateria));
		model.addObject("materia", materia);
		return model;
		
	}
	
	@RequestMapping(value="/editarMateriaProceso",method=RequestMethod.POST)
	public ModelAndView editarMateria(HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("materias");
		String id = request.getParameter("id");
		String nombreMateria = request.getParameter("nombreMateria");
		
		Materia producto = materiaService.updateProducto(Long.parseLong(id), nombreMateria);
		if(producto!=null){
			model.addObject("exito", "Materia actualizado exitosamente :"+producto.getNombreMateria());
		}else{
			model.addObject("error", "Ha ocurrido un error al actualizar la Materia");
		}
		List<Materia> listaMaterias = materiaService.getMaterias();
		model.addObject("materias", listaMaterias);
		return model;
		
	}
	
	@RequestMapping(value="/agregarMateriaProceso",method=RequestMethod.POST)
	public ModelAndView agregarMateria(HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("materias");
		String nombreMateria = request.getParameter("nombreMateria");
		
		Materia materia = materiaService.addProducto(nombreMateria);
		if(materia!=null){
			model.addObject("exito", "materia actualizado exitosamente :"+materia.getNombreMateria());
		}else{
			model.addObject("error", "Ha ocurrido un error al actualizar el materia");
		}
		List<Materia> listaMaterias = materiaService.getProductos();
		model.addObject("materias", listaMaterias);
		
		return model;
		
	}
	
	@RequestMapping(value="/eliminarMateria/{idMateria}",method=RequestMethod.GET)
	public ModelAndView eliminarMateria(@PathVariable("idMateria") String idMateria){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("materias");
		materiaService.deleteMateria(Long.parseLong(idMateria));
		
		List<Materia> listaMaterias = materiaService.getMaterias();
		model.addObject("materias", listaMaterias);
		
		return model;
		
	}
}
