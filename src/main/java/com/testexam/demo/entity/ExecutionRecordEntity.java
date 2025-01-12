package com.testexam.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "execution_record")
public class ExecutionRecordEntity {
    @Id
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
