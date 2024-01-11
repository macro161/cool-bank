package com.coolbank.coolbank.controller;

import com.coolbank.coolbank.domain.Client;
import com.coolbank.coolbank.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @RequestMapping(method = RequestMethod.POST)

    public void createClient(@RequestBody Client client) {
        clientService.createClient(client);
    }
}
