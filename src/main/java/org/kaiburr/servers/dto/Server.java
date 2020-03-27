package org.kaiburr.servers.dto;

import org.kaiburr.servers.dao.ServerEntity;

import javax.validation.constraints.NotBlank;

public class Server {
    @NotBlank
    private String name;

    @NotBlank
    private String id;

    @NotBlank
    private String language;

    @NotBlank
    private String framework;

    public Server() {
    }

    public Server(String name, String id, String language, String framework) {
        this.name = name;
        this.id = id;
        this.language = language;
        this.framework = framework;
    }

    public Server(ServerEntity serverEntity){
        name = serverEntity.getName();
        id = serverEntity.getId();
        language = serverEntity.getLanguage();
        framework = serverEntity.getFramework();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}