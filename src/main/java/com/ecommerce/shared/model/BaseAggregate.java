package com.ecommerce.shared.model;

import com.ecommerce.shared.event.DomainEvent;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public abstract class BaseAggregate {
    private List<DomainEvent> events;

    protected void raiseEvent(DomainEvent event) {
        getEvents().add(event);
    }

    void clearEvents() {
        getEvents().clear();
    }

    List<DomainEvent> getEvents() {
        if (events == null) {
            events = newArrayList();
        }
        return events;
    }

}
