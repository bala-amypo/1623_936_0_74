package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import com.example.demo.exception.ValidationException;


@RestControllerAdvice
public class GlobalException{

     @ExceptionHandler(ValidationException.class)
public ResponseEntity<String> handleValidationException(ValidationException ex){
    return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
}
} 