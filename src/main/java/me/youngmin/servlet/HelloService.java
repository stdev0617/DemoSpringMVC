package me.youngmin.servlet;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getName(){
        return "youngmin";
    }

    public Long getId() { return 1l; }

    public String getAddress() { return "seoul"; }

    public String job() { return "developer"; }
}
