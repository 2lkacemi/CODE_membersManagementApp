package com.example.persistence;

import com.example.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
public interface IUserDao extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findUserEntityByEmail(String email);
    void deleteByEmail(String email);

}
