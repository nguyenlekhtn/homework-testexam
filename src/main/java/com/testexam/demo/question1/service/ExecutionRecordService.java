package com.testexam.demo.question1.service;

import com.testexam.demo.question1.dao.ExecutionRecordDAO;
import com.testexam.demo.question1.entity.ExecutionRecordEntity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Service
public class ExecutionRecordService implements HandlerInterceptor {

    private ExecutionRecordDAO executionRecordDAO;

    public ExecutionRecordService(ExecutionRecordDAO executionRecordDAO) {
        this.executionRecordDAO = executionRecordDAO;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        ExecutionRecordEntity entity = new ExecutionRecordEntity();
        // logic to add request info to ExecutionRecordEntity
        executionRecordDAO.save(entity);
    }
}
