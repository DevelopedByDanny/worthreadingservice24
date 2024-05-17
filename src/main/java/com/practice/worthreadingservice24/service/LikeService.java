package com.practice.worthreadingservice24.service;

import com.practice.worthreadingservice24.entity.Likes;
import com.practice.worthreadingservice24.repository.LikesRepository;
import org.springframework.stereotype.Service;

@Service
public class LikeService {

    private LikesRepository likesRepository;

    public LikeService(LikesRepository likesRepository) {
        this.likesRepository = likesRepository;
    }
    public void toggleLike(String messageId, String userId) {

        if (likesRepository.existsByMessageIdAndUserId(messageId, userId)) {
            likesRepository.deleteByMessageIdAndUserId(messageId, userId);
        } else {
            likesRepository.save(new Likes(messageId, userId));
        }
    }

    public int likeCount(String messageId) {

        return likesRepository.countByMessageId(messageId);
    }
}
