package com.websocket.socket.redis;

import com.websocket.socket.dto.MessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedisPublisher {
    private final RedisTemplate<String, Object> redisTemplate;

    //TODO: Redis Topic 에 메시지 발행.  메시지를 발행 후, 대기 중이던 redis 구독 서비스(RedisSubscriber)가 메시지를 처리
    public void publish(ChannelTopic topic, MessageDto message){
        redisTemplate.convertAndSend(topic.getTopic(), message);
    }

}
