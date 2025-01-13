package com.testexam.demo.question1.dao;

import com.testexam.demo.question1.entity.ExecutionRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutionRecordDAO extends JpaRepository<ExecutionRecordEntity, Integer> {
}
