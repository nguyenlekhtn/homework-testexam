package com.testexam.demo.question1.entity;

import jakarta.persistence.*;
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
    @Column(name = "serno")
    private Integer serNo;

    @NotNull
    @Column(name = "serviceName")
    private String serviceName;

    @NotNull
    @Column(name = "msgid")
    private String msgId;

    @NotNull
    @Column(name = "requestPayload")
    private String requestPayload;

    @NotNull
    @Column(name = "request_timestamp")
    private LocalDateTime requestTimestamp;
}
