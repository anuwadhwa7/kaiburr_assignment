package org.kaiburr.servers.controllers;

import org.kaiburr.servers.ServerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ServerApplication {
    public class Server{
        String name;
        String id;
        String language;
        String framework;

        public Server(String name, String id, String language, String framework) {
            this.name = name;
            this.id = id;
            this.language = language;
            this.framework = framework;
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }


    @GetMapping("/")
    Server home() {
        return new Server("xyz", "abc", "asf", "adsf");
    }
}
