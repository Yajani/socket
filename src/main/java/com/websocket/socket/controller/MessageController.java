//package com.websocket.socket.controller;
//
//import com.websocket.socket.dto.MessageDto;
//import com.websocket.socket.redis.RedisPublisher;
//import com.websocket.socket.service.MessageRoomService;
//import com.websocket.socket.service.MessageService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
//@Controller
//@RequiredArgsConstructor
//public class MessageController {
//    private final RedisPublisher redisPublisher;
//    private final MessageRoomService messageRoomService;
//    private final MessageService messageService;
//
//    // 대화 & 대화 저장
//    @MessageMapping("/message")
//    public void message(MessageDto messageDto) {
//        messageRoomService.enterMessageRoom(messageDto.getRoomId());
//        redisPublisher.publish(messageRoomService.getTopic(messageDto.getRoomId()), messageDto);
//        messageService.saveMessage(messageDto);
//    }
//
//    // 대화 내역 조회
//    @GetMapping("/api/room/{roomId}/message")
//    public ResponseEntity<List<MessageDto>> loadMessage(@PathVariable String roomId) {
//        return ResponseEntity.ok(messageService.loadMessage(roomId));
//    }
//}
