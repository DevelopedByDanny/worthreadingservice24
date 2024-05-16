package com.practice.worthreadingservice24.repository;

import com.practice.worthreadingservice24.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends ListCrudRepository<User, String> {
}
