package com.jfb.crudclient.services;

import java.util.List;

import com.jfb.crudclient.entities.Client;
import com.jfb.crudclient.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository repository;

    public List<Client> findAll() {
        return repository.findAll();
    }
    
}
