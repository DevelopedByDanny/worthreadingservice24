package com.practice.worthreadingservice24.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/like/")
public class LikesController {

    @PutMapping("toggleLike/{messageId}")
    public void toggleLike(@PathVariable String messageId, @RequestHeader String userId) {
        // TODO document why this method is empty
    }

    @GetMapping("amount/{messageId}")
    public int getAmountOfLikes() {
        // TODO document why this method is empty
        return 0;
    }
}
