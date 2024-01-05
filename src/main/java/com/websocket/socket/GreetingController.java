package com.websocket.socket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
//    "hello" 경로로 메시지가 날아오면 greeting 메소드가 실행되어 Greeting 객체가 반환
    public Greeting greeting(HelloMessage message) throws InterruptedException {
        Thread.sleep(1000);
        return new Greeting("Hello, "+ HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}
