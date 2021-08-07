package com.ups.apirest.rest;

import com.ups.apirest.models.entity.Cliente;
import com.ups.apirest.models.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/usuarios")
public class ClienteRest {
    @Autowired
    private IClienteService iClienteService;

    @GetMapping("")
    public List<Cliente> list(){
        return iClienteService.findAll();
    }

    @PostMapping("/")
    public void add(@RequestBody Cliente cliente){
        iClienteService.ingresarCliente(cliente);
    }
}
