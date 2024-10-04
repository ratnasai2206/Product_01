package com.project.Product_01.utils;


import com.project.Product_01.data.dto.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

    private static ResponseStructure initApiResponse() {
        return new ResponseStructure();
    }

    public static ResponseEntity<ResponseStructure> getCreatedResponse(Object response) {
        ResponseStructure apiResponse = initApiResponse();
        apiResponse.setHttpStatus(HttpStatus.CREATED);
        apiResponse.setStatusCode(HttpStatus.CREATED.value());
        apiResponse.setResponse(response);
        return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);
    }

    public static ResponseEntity<ResponseStructure> getBadRequestResponse(Object response) {
        ResponseStructure apiResponse = initApiResponse();
        apiResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
        apiResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
        apiResponse.setResponse(response);
        return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);
    }

    public static ResponseEntity<ResponseStructure> getOkResponse(Object response) {
        ResponseStructure apiResponse = initApiResponse();
        apiResponse.setHttpStatus(HttpStatus.OK);
        apiResponse.setStatusCode(HttpStatus.OK.value());
        apiResponse.setResponse(response);
        return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);
    }

    public static ResponseEntity<ResponseStructure> getConflictResponse(Object response) {
        ResponseStructure apiResponse = initApiResponse();
        apiResponse.setHttpStatus(HttpStatus.CONFLICT);
        apiResponse.setStatusCode(HttpStatus.CONFLICT.value());
        apiResponse.setResponse(response);
        return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);
    }

    public static ResponseEntity<ResponseStructure> getNoContentResponse(Object response) {
        ResponseStructure apiResponse = initApiResponse();
        apiResponse.setHttpStatus(HttpStatus.NO_CONTENT);
        apiResponse.setStatusCode(HttpStatus.NO_CONTENT.value());
        apiResponse.setResponse(response);
        return ResponseEntity.status(apiResponse.getStatusCode()).body(apiResponse);
    }
}
