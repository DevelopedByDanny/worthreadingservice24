package com.practice.worthreadingservice24.repository;

import com.practice.worthreadingservice24.entity.Likes;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRepository extends ListCrudRepository<Likes, String> {
    boolean existsByMessageIdAndUserId(String messageId, String userId);

    void deleteByMessageIdAndUserId(String messageId, String userId);

    int countByMessageId(String messageId);
}
