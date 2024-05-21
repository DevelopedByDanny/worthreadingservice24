package com.practice.worthreadingservice24.service;

import com.practice.worthreadingservice24.entity.Likes;
import com.practice.worthreadingservice24.repository.LikesRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LikeService {

    private final LikesRepository likesRepository;

    public LikeService(LikesRepository likesRepository) {
        this.likesRepository = likesRepository;
    }

    public void like(String messageId, String userId) {
        likesRepository.save(new Likes(messageId, userId));
    }

    @Transactional
    public String toggleLike(String messageId, String userId) {

        if (likesRepository.existsByMessageIdAndUserId(messageId, userId)) {
            likesRepository.deleteByMessageIdAndUserId(messageId, userId);
            return "unliked";
        } else {
            likesRepository.save(new Likes(messageId, userId));
            return "liked";
        }
    }

    public int likeCount(String messageId) {

        return likesRepository.countByMessageId(messageId);
    }
}
