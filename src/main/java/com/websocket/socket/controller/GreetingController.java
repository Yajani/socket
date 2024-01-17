package com.websocket.socket.controller;

import com.websocket.socket.Greeting;
import com.websocket.socket.HelloMessage;
import com.websocket.socket.entity.User_mongo;
import com.websocket.socket.service.UserService;
import com.websocket.socket.service.UserService_temp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
//    @MessageMapping("/hello")
//    @SendTo("/topic/greetings")
//    public Greeting greeting(HelloMessage message) throws Exception {
//        Thread.sleep(1000);
//        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
//    }
    private UserService userService;
    private UserService_temp userService_temp;

    @Autowired
    public GreetingController(UserService userService, UserService_temp userServiceTemp) {
        this.userService = userService;
        userService_temp = userServiceTemp;
    }


//    @MessageMapping("/hello")
//    @SendTo("/topic/greetings")
//    public Greeting greeting(User_mongo message) throws Exception {
//        Thread.sleep(1000);
//        userService.saveUser(message);
//        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
//    }


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(User_mongo message) throws Exception {
        Thread.sleep(1000);
        userService_temp.insertEvent(message);
        System.out.println("mongo template 실행!!!");
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }



}
