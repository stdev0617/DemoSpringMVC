package me.youngmin.servlet;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.Controller;

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class)) // controller를 걸러내고 서비스만 빈으로 등록해줌
public class AppConfig {
}
