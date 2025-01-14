package com.testexam.demo.question2.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorMessageDTO {
    private String code;
    private String description;
}
