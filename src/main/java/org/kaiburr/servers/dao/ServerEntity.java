package org.kaiburr.servers.dao;

import org.kaiburr.servers.dto.Server;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "server")
public class ServerEntity {
    @Id
    private String id;
    private String name;
    private String language;
    private String framework;

    public ServerEntity() {
    }

    public ServerEntity(String id, String name, String language, String framework) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.framework = framework;
    }

    public ServerEntity(Server server){
        this.id = server.getId();
        this.name = server.getName();
        this.language = server.getLanguage();
        this.framework = server.getFramework();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
