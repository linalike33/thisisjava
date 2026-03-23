package com.mjc813.ch20.game;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameRestControler {
    @PostMapping("/api/insert-data")
    public void insertData(@RequestBody GameDta gameDta){
        System.err.println("inserData"+gameDta.toString());
    }
}
