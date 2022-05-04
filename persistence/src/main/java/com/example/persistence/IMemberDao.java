package com.example.persistence;

import com.example.persistence.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Transactional(readOnly = false)
public interface IMemberDao extends JpaRepository<MemberEntity, Long> {
    Optional<MemberEntity> findMemberEntityByEmail(String email);
    void deleteByEmail(String email);

}
