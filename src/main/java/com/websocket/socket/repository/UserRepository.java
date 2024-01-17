package com.websocket.socket.repository;

import com.websocket.socket.entity.User_mongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User_mongo,String> {

}
