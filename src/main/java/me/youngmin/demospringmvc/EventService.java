package me.youngmin.demospringmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {
        Event event = Event.builder()
                .name("스프링 웹 MVC 스터디")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019,1,10,10,0))
                .endDateTime(LocalDateTime.of(2019,1,10,10,0))
                .build();

        Event event1 = Event.builder()
                .name("스프링 웹 MVC 스터디 2차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019,1,17,10,0))
                .endDateTime(LocalDateTime.of(2019,1,17,12,0))
                .build();
        return null;
    }
}
