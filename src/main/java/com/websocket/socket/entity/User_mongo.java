package com.websocket.socket.entity;

import lombok.Getter;
import lombok.Setter;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Message")
public class User_mongo {

    @Id
    private String id;

    private String name;
}
