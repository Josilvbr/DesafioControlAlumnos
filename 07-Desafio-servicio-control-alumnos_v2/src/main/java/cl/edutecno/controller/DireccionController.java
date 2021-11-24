package cl.edutecno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.edutecno.model.Direccion;
import cl.edutecno.service.DireccionService;

@Controller
@RequestMapping("direcciones")
public class DireccionController {
	
	@Autowired
	private DireccionService direccionService;
	
	@GetMapping("/crear")
	public ModelAndView crear(){
		ModelAndView modelAndView = new ModelAndView("crear-direccion");
		modelAndView.addObject("direcciones", direccionService.findAll());
		return modelAndView;
	}
	
	@PostMapping("/crear")
	public RedirectView crear(@ModelAttribute Direccion direccion){
		direccionService.save(direccion);
		return new RedirectView("/direcciones");
	}
	
	@GetMapping
	public ModelAndView direcciones(){
		ModelAndView modelAndView = new ModelAndView("direcciones");
		modelAndView.addObject("direcciones", direccionService.findAll());
		return modelAndView;
		
	}

}
