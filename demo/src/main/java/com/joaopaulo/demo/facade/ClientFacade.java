package com.joaopaulo.demo.facade;

import com.joaopaulo.demo.model.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ClientFacade {
    private static final HashMap<Integer, Client> clients = new HashMap<>();

    public Client create(Client client){
        Integer nextId = clients.keySet().size() + 1;
        client.setClientId(nextId);
        clients.put(nextId, client);
        return client;
    }

    public Client getById (Integer clientId){
        return clients.get(clientId);
    }

    public List<Client> getAll(){
        return new ArrayList<>(clients.values());
    }

}
