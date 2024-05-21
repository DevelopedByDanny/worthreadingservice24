package com.practice.worthreadingservice24.repository;

import com.practice.worthreadingservice24.entity.Likes;
import com.practice.worthreadingservice24.entity.LikesId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRepository extends CrudRepository<Likes, LikesId> {
    boolean existsByMessageIdAndUserId(String messageId, String userId);

    void deleteByMessageIdAndUserId(String messageId, String userId);

    int countByMessageId(String messageId);
}
