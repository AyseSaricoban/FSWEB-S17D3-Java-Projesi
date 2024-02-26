package com.example.s17d2.controller;

import com.example.s17d2.entity.Kangroo;
import com.example.s17d2.validation.ZooValidation;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/kangaroos")
public class KangarooController {
    private Map<Integer, Kangroo> kangaroos;


    @PostConstruct
    public void init(){
        kangaroos=new HashMap<>();
    }

    @GetMapping("/kangaroos")
    public List<Kangroo> findAll(){
        return kangaroos.values().stream().toList();
    }
    @GetMapping("/kangaroos/{id}")
    public Kangroo getKangarooById(@PathVariable Integer id){
        ZooValidation.isIdValid(id);
        return kangaroos.get(id);
    }

}

