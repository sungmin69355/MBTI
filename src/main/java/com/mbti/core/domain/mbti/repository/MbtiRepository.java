package com.mbti.core.domain.mbti.repository;


import com.mbti.core.domain.mbti.entity.Mbti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MbtiRepository extends JpaRepository<Mbti, Long>, QuerydslPredicateExecutor<Mbti> {
}
