package com.jfb.crudclient.services;

import com.jfb.crudclient.dto.ClientDTO;
import com.jfb.crudclient.entities.Client;
import com.jfb.crudclient.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAllPages(PageRequest pageRequest) {
        Page<Client> list = repository.findAll(pageRequest);
        return list.map(cli -> new ClientDTO(cli));
    }

}
