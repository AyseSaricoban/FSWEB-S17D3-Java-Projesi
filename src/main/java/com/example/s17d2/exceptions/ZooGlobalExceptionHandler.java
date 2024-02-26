package com.example.s17d2.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Slf4j
@ControllerAdvice
public class ZooGlobalExceptionHandler {
@ExceptionHandler
    public ResponseEntity<ZooErrorResponse> handleZooException(ZooException zooException){
//log.error
    return null;
}

}
