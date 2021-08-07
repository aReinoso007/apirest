package com.ups.apirest.models.service;

import java.util.Date;
import java.util.List;

import com.ups.apirest.models.dao.IClienteDao;
import com.ups.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public void ingresarCliente(Cliente cliente) {
        Date createdAt = new Date();
        cliente.setCreateAt(createdAt);
        System.out.println("Registrando cliente: "+cliente);
        clienteDao.save(cliente);
    }


}