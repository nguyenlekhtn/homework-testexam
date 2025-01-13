package com.testexam.demo.question1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "execution_record")
public class ExecutionRecordEntity {
    @Id
    @GeneratedValue
    @NotNull
    private Integer serno;

    @NotNull
    private String serviceName;

    @NotNull
    private String msgId;

    @NotNull
    private String requestPayload;

    @NotNull
    private LocalDateTime requestTimestamp;
}
