package me.sejin.events;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

// TODO Resource<Event>(2.1.0.RELEASE) -> EntityModel<Event>(2.2.5.RELEASE)
public class EventResource extends EntityModel<Event> {

    // TODO Resource로 깔끔하게 처리하기
    public EventResource(Event event, Link... links) {
        super(event, links);
        // add(new Link("http://localhost:8080/api/events/" + event.getId()));
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }
}
