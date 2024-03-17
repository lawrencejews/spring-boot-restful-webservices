package com.lawrencejews.springbootrestfulwebservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private String resourceName;
    private String fieldName;
    private Long fieldValve;

    public ResourceNotFoundException(String resourceName, String fieldName, Long fieldValve){
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValve));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValve = fieldValve;
    }
}
