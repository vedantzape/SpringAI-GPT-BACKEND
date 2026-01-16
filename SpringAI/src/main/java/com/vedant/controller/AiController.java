package com.vedant.controller;



import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AiController {

    private final ChatClient chatClient;



    @GetMapping("/chat")
    public String chat(@RequestParam String message) {

        return chatClient
                .prompt(message)
                .call()
                .content();
    }
}