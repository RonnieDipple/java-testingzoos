package com.rdipple.javazoosassignment.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final Logger logger = LoggerFactory.getLogger(ResourceNotFoundException.class);



    public ResourceNotFoundException(String message) {
        super(message);
        logger.info("ResourceNotFoundException accessed");
    }

    public ResourceNotFoundException(String message, Throwable cause){

        super(message, cause);
        logger.info("ResourceNotFoundException accessed");
    }

}
