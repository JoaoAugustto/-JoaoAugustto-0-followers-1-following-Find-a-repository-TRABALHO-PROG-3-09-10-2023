package com.joaopaulo.demo.api;

import com.joaopaulo.demo.facade.ClientFacade;
import com.joaopaulo.demo.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientAPI {
    @Autowired
    private ClientFacade clientFacade;

    @PostMapping
    @ResponseBody
    public Client create(@RequestBody Client client){
        return clientFacade.create(client);
    }
    @GetMapping
    @ResponseBody
    public List<Client> getAll(){
        return clientFacade.getAll();
    }

   @GetMapping(value = "/{id}")
   @ResponseBody
   public Client getById(@PathVariable Integer id){
        return clientFacade.getById(id);
   }
}
