package me.youngmin.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello") // DispatcherServlet이 필요함.
    @ResponseBody
    public String hello() {
        return "Hello, " + helloService.getName();
    }

    @GetMapping("/simple")
    public String sample(){
        return "WEB-INF/sample.jsp";
    }
}
