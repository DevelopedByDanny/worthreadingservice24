package com.practice.worthreadingservice24.controller;

import com.practice.worthreadingservice24.service.LikeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/like/")
public class LikesController {

    private LikeService likeService;

    @PutMapping("toggleLike/{messageId}")
    public void toggleLike(@PathVariable String messageId, @RequestHeader String userId) {
        likeService.toggleLike(messageId, userId);
    }

    @GetMapping("amount/{messageId}")
    public int getAmountOfLikes(@PathVariable String messageId) {
        likeService.likeCount(messageId);
        return 0;
    }
}
