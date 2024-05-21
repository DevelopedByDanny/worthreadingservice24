package com.practice.worthreadingservice24.controller;

import com.practice.worthreadingservice24.service.LikeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/like/")
@AllArgsConstructor
public class LikesController {

    private LikeService likeService;

    @PutMapping("toggleLike/{messageId}")
    ResponseEntity<String> toggleLike(@PathVariable String messageId, @RequestHeader String userId) {

        return ResponseEntity.ok(likeService.toggleLike(messageId, userId));
    }

    @GetMapping("amount/{messageId}")
   ResponseEntity<Integer> getAmountOfLikes(@PathVariable String messageId) {
        return ResponseEntity.ok(likeService.likeCount(messageId));
    }
}
