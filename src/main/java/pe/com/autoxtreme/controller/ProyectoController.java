package pe.com.autoxtreme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProyectoController {
	
	// crear un controlador para cargar la pagina index
	@GetMapping("/")
	public String Inicio() {
		return "index";
	}
	
	// crear un controlador para cargar la pagina
	@GetMapping("/menu/principal")
	public String Menu() {
		return "MenuPrincipal";
	}

}
