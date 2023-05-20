package pe.com.autoxtreme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.autoxtreme.model.Carro;
import pe.com.autoxtreme.repository.CarroRepository;
import pe.com.autoxtreme.repository.MarcaRepository;

@Controller
public class CarroController {
	
	@Autowired /*crea los metodos get y set, constructores*/
	private CarroRepository carroRep;
	
	@Autowired /*crea los metodos get y set, constructores*/
	private MarcaRepository marcaRep;
	
	@GetMapping("/cargaMc")
	public String cargarListaCarro(Model model) {
		model.addAttribute("lstCarros", carroRep.findAll());
		model.addAttribute("lstMarca", marcaRep.findAll());
		return "MatenimientoCarro";
	}
	
	
	
	
}
