package com.ups.apirest.models.service;

import java.util.List;

import com.ups.apirest.models.entity.Cliente;

public interface IClienteService {

    public List<Cliente> findAll();

    public void ingresarCliente(Cliente c);

}
