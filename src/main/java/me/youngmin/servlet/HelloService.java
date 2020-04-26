package me.youngmin.servlet;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getName(){
        return "youngmin";
    }
}
