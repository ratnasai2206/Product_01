package com.project.Product_01.data.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseStructure {
    private HttpStatus httpStatus;
    private int statusCode;
    private Object response;
}
