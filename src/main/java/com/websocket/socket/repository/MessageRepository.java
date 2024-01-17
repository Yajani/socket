//package com.websocket.socket.repository;
//
//import org.apache.logging.log4j.message.Message;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.List;
//
//public interface MessageRepository extends JpaRepository<Message, Long> {
//
//    List<Message> findTop100ByRoomIdOrderByCreatedAtAsc(String roomId);
//
//    Message findTopByRoomIdOrderByCreatedAtDesc(String roomId);
//
//
//}
