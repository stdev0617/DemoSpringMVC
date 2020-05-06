package me.youngmin.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    /**
     * /hello/1?name=youngmin,age=25
     * @param id
     * @param name
     * @return
     */
    @GetMapping("/hello") // DispatcherServlet이 필요함.
    @ResponseBody
    public String hello(@PathVariable int id, @RequestParam String name) {
        return "Hello, " + helloService.getName();
    }

    @GetMapping("/simple")
    public String sample(){
        return "WEB-INF/sample.jsp";
    }
}
