package com.practice.worthreadingservice24.repository;

import com.practice.worthreadingservice24.entity.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, String> {
}
