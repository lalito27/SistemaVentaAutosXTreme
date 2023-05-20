package pe.com.autoxtreme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.autoxtreme.model.Cliente;
import pe.com.autoxtreme.repository.IClienteRepository;

@Controller
public class ClienteController {
    @Autowired
    private IClienteRepository repoCli;

    @GetMapping("/cliente")
    public String cargarPagCliente(Model model){
        model.addAttribute("cliente", new Cliente());
        return "crud-clientes";
    }
}
