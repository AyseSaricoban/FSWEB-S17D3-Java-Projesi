package com.example.s17d2.validation;

import com.example.s17d2.exceptions.ZooException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


public class ZooValidation {
    public static void isIdValid(Integer id){
        if(id==null || id<0){
            throw new ZooException("id cannot be null or less than zero" + id, HttpStatus.BAD_REQUEST);
        }
    }
}
