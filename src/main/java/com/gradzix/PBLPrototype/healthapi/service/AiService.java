package com.gradzix.PBLPrototype.healthapi.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private ChatClient chatClient;


    public AiService(ChatClient.Builder builder) {
        chatClient = builder.build();
    }

    public String getCompletion(String prompt) {
        return chatClient
                .prompt(prompt)
                .call()
                .content();
    }

}
