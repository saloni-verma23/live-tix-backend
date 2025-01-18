package com.saloni.tbSystem;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/type/{type}")
    public List<Event> getEventsByType(@PathVariable String eventType) {
        return eventService.getEventsByType(eventType);
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }
}