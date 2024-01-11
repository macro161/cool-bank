package com.coolbank.coolbank.service;

import com.coolbank.coolbank.domain.Client;
import com.coolbank.coolbank.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> getClients() {
        return repository.findAll();
    }

    public void createClient(Client client) {
        repository.save(client);
    }
}
