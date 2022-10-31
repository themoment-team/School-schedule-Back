package com.backend.schemabackend.repository;

import com.backend.schemabackend.entity.Member;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@Repository
public interface BoardRepository extends JpaRepository<Member, Long> {

    Member findByUseridAndPassword(String userid, String password);

    Optional<Member> findByUserid(String userid);
}
