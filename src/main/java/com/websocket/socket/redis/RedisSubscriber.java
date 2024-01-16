//package com.websocket.socket.redis;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.websocket.socket.dto.MessageDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.redis.connection.Message;
//import org.springframework.data.redis.connection.MessageListener;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.messaging.simp.SimpMessageSendingOperations;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class RedisSubscriber implements MessageListener {
//    //MessageListener => Redis에 메세지가 발행될 때까지 대기하다가, 메시지가 발행되면 해당 메시지를 읽어서 처리해주는 리스너
//    private final ObjectMapper objectMapper;
//    private final RedisTemplate redisTemplate;
//    private final SimpMessageSendingOperations messagingTemplate;
//
//    // 2. Redis 에서 메시지가 발행(publish)되면, listener 가 해당 메시지를 읽어서 처리
//    @Override
//    public void onMessage(Message message, byte[] pattern) {
//
//
//        try {
//            //redis에서 발행된 데이터를 받아 역질렬화
//            String publishMessage = (String)redisTemplate.getStringSerializer().deserialize(message.getBody());
//
//            //해당객체 publishMessage를 MessageDto 객체로 맵핑
//            MessageDto roomMessage = objectMapper.readValue(publishMessage, MessageDto.class);
//
//            // Websocket 구독자에게 채팅 메시지 전송
//            messagingTemplate.convertAndSend("/sub/chat/room/" + roomMessage.getRoomId(), roomMessage);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
//}
