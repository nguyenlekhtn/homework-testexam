package com.testexam.demo.dao;

import com.testexam.demo.entity.ExecutionRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExecutionRecordDAO extends JpaRepository<ExecutionRecordEntity, Integer> {
}
