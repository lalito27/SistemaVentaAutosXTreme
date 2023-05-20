package pe.com.autoxtreme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.autoxtreme.model.Carro;
import pe.com.autoxtreme.repository.ICarroRepository;

@Controller
public class CarroController {
    @Autowired
    private ICarroRepository repoCar;
    @GetMapping("/carro")
    public String cargarPagCarro(Model model){
        model.addAttribute("carro", new Carro());
        return "crud-carros";
    }
}
