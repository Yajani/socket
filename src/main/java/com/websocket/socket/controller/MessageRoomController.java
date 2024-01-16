package com.websocket.socket.controller;


import com.websocket.socket.UserDetailsImpl;
import com.websocket.socket.dto.MessageRequestDto;
import com.websocket.socket.dto.MessageResponseDto;
import com.websocket.socket.dto.MessageRoomDto;
import com.websocket.socket.service.MessageRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessageRoomController {
    private final MessageRoomService messageRoomService;

    // 쪽지방 생성
    @PostMapping("/room")
    public MessageResponseDto createRoom(@RequestBody MessageRequestDto messageRequestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return messageRoomService.createRoom(messageRequestDto, userDetails.getUser());
    }

    // 사용자 관련 쪽지방 전체 조회
    @GetMapping("/rooms")
    public List<MessageResponseDto> findAllRoomByUser(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        return messageRoomService.findAllRoomByUser(userDetails.getUser());
    }

    // 사용자 관련 쪽지방 선택 조회
    @GetMapping("room/{roomId}")
    public MessageRoomDto findRoom(@PathVariable String roomId, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return messageRoomService.findRoom(roomId, userDetails.getUser());
    }

    // 쪽지방 삭제
    @DeleteMapping("room/{id}")
    public MessageResponseDto deleteRoom(@PathVariable Long id, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return messageRoomService.deleteRoom(id, userDetails.getUser());
    }
}
