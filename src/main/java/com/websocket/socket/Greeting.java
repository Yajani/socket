package com.websocket.socket;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
//TODO: 메시지 내용에 관한 데이터 전달
public class Greeting {
    private String contents;
}
