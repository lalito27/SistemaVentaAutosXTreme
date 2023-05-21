package pe.com.autoxtreme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.autoxtreme.model.Carro;
import pe.com.autoxtreme.repository.ICarroRepository;
import pe.com.autoxtreme.repository.IMarcaRepository;

@Controller
public class CarroController {
    @Autowired
    private ICarroRepository repoCar;
    @Autowired /*crea los metodos get y set, constructores*/
	private IMarcaRepository repoMar;
    @GetMapping("/carro")
    public String cargarPagCarro(Model model){
        model.addAttribute("carro", new Carro());
        model.addAttribute("lstMarca", repoMar.findAll());
        return "crud-carros";
    }
    
    @GetMapping("/carro/listado")
    public String generarListaCarros(Model model){
        model.addAttribute("carro", new Carro());
        model.addAttribute("lstMarca", repoMar.findAll());
        model.addAttribute("lstCarros", repoCar.findAll());
        return "crud-carros";
    }
    
    
    

}
