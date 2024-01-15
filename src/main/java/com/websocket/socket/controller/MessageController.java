package com.websocket.socket.controller;

import com.websocket.socket.dto.MessageDto;
import com.websocket.socket.redis.RedisPublisher;
import com.websocket.socket.service.MessageRoomService;
import com.websocket.socket.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MessageController {
    private final RedisPublisher redisPublisher;
    private final MessageRoomService messageRoomService;
    private final MessageService messageService;

    //대화 & 대화 저장
    @MessageMapping("/message")
    public void message(MessageDto messageDto) {
        //클라이언트의 쪽지방(topic) 입장, 대화를 위해 리스너와 연동
        messageRoomService.enterMessageRoom(messageDto.getRoomId());

    }

}
