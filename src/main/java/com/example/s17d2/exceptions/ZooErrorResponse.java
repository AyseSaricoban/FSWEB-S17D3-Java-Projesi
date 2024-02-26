package com.example.s17d2.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZooErrorResponse {
    private Integer status;
    private String massage;
    private Long timestamp;

}
