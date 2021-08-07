package com.ups.apirest.models.view;

import ch.qos.logback.core.net.server.Client;
import com.ups.apirest.models.entity.Cliente;
import com.ups.apirest.models.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import java.util.List;

@Component
@ViewScoped
public class ClienteView {

    private List<Cliente> clienteList;
    private Cliente cliente;

    @Autowired
    private IClienteService clienteService;

    @PostConstruct
    public void init(){
        this.clienteList = clienteService.findAll();
        this.cliente = new Cliente();
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public void saveCliente(Cliente cliente){
        System.out.println("Registrando cliente lol: "+cliente);
        this.clienteService.ingresarCliente(cliente);
        this.cliente = new Cliente();
        this.clienteList = clienteService.findAll();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
