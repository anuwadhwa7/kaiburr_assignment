package org.kaiburr.servers.repositories;

import org.kaiburr.servers.dao.ServerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;
import java.util.Optional;

@EnableMongoRepositories
public interface ServerRepository extends MongoRepository <ServerEntity, String> {
    Optional<ServerEntity> findById(String Id);
    List<ServerEntity> findByNameLike(String name);
}
