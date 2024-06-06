package com.git.sweetmanager.iam.infrastructure.persistence.mongo.repositories;

import com.git.sweetmanager.iam.domain.model.aggregates.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
