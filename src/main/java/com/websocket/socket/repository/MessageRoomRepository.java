package com.websocket.socket.repository;

import com.websocket.socket.entity.MessageRoom;
import com.websocket.socket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRoomRepository extends JpaRepository<MessageRoom, Long> {
    List<MessageRoom> findByUserOrReceiver(User user, String receiver);

    MessageRoom findByIdAndUserOrIdAndReceiver(Long id, User user, Long id1, String nickname);

    MessageRoom findBySenderAndReceiver(String nickname, String receiver);

    MessageRoom findByRoomIdAndUserOrRoomIdAndReceiver(String roomId, User user, String roomId1, String nickname);

    MessageRoom findByRoomId(String roomId);

    @Override
    <S extends MessageRoom> S save(S entity);
}
