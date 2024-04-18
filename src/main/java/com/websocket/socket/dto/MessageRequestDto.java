package com.websocket.socket.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MessageRequestDto {
    private String receiver;    // 메세지 수신자
    private Long postId;        // 게시글 id
}
