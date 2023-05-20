package pe.com.autoxtreme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.autoxtreme.model.Empleado;
import pe.com.autoxtreme.repository.IEmpleadoRepository;

@Controller
public class EmpleadoController {
    @Autowired
    private IEmpleadoRepository repoEmple;

    @GetMapping("/empleado")
    public String cargarPagEmpleado(Model model){
        model.addAttribute("empleado", new Empleado());
        return "crud-empleados";
    }
}
