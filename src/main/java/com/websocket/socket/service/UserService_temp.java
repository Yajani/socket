package com.websocket.socket.service;

import com.websocket.socket.entity.User_mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.List;
import java.util.Optional;

@Service
public class UserService_temp {

    @Autowired
    private MongoTemplate mongoTemplate;

//    public User_mongo getEvent(String _id) {
//        User_mongo event = mongoTemplate.findById(_id, User_mongo.class);
//        return Optional.ofNullable(event).orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND, "Not found event"));
//    }

    public User_mongo insertEvent(User_mongo body) {
        return mongoTemplate.insert(body);
    }


}
