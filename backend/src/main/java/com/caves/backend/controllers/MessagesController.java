package com.caves.backend.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessagesController {

    @GetMapping("/messages")
    public ResponseEntity<List<String>> getMessages() {
        return ResponseEntity.ok(Arrays.asList("first", "second"));
    }

}
