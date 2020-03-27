package org.kaiburr.servers.controllers;

import org.kaiburr.servers.dao.ServerEntity;
import org.kaiburr.servers.dto.Server;
import org.kaiburr.servers.exceptions.ServerNotFoundException;
import org.kaiburr.servers.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ServerController {

    private static final String template = "Hello, %s!";

    @Autowired
    private ServerRepository database;

    @GetMapping("/server/{id}")
    public Server getServerDetails(@PathVariable("id") String id){
        Optional<ServerEntity> serverEntityOptional = database.findById(id);
        if(serverEntityOptional.isPresent()){
            ServerEntity serverEntity =  serverEntityOptional.get();
            return new Server(serverEntity);
        }else{
            throw new ServerNotFoundException();
        }
    }

    @GetMapping("/server/")
    public List<Server> getAllServer() {
        List<Server> serverList = new ArrayList<>();
        List<ServerEntity> serverEntityList = database.findAll();

        for(ServerEntity temp : serverEntityList)
        {
            serverList.add(new Server(temp));
        }
        return serverList;
    }

    @PutMapping("/server")
    public Server createServer(@NotNull @RequestBody Server server){
        ServerEntity serverEntity = new ServerEntity(server);
        ServerEntity savedServerEntity = database.save(serverEntity);
        return new Server(savedServerEntity);
    }

    @DeleteMapping("/server/{id}")
    public void delete(@PathVariable("id") String id){
        Optional<ServerEntity> serverEntityOptional = database.findById(id);
        if(serverEntityOptional.isPresent()){
            ServerEntity serverEntity =  serverEntityOptional.get();
            database.delete(serverEntity);
        }else{
            throw new ServerNotFoundException();
        }
    }

    @GetMapping("/server/search/{name}")
    public List<Server> findServerByName(@PathVariable(value = "name")String name){
        List<ServerEntity> serverEntityList = database.findByNameLike(name);
        if(!serverEntityList.isEmpty()){
            List<Server> serverList = new ArrayList<>();
            for(ServerEntity temp : serverEntityList)
            {
                serverList.add(new Server(temp));
            }
            return serverList;
        }else{
            throw new ServerNotFoundException();
        }
    }
}