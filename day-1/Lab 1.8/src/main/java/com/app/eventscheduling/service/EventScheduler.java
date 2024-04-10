package com.app.eventscheduling.service;

import com.app.eventscheduling.model.Event;
import com.app.eventscheduling.model.Participant;

import java.util.HashMap;
import java.util.Map;

public class EventScheduler {
    private Map<String, Event> events;

    // TODO: Implement constructor
    public EventScheduler() {
        this.events = new HashMap<>();
    }

    // TODO: Implement method to schedule an event
    public void scheduleEvent(Event event) {
        events.put(event.getEventId(), event);
    }

    // TODO: Implement method to register a participant for an event
    public void registerParticipant(String eventId, Participant participant) {
        Event event = events.get(eventId);
        event.addParticipant(participant);
    }

    // TODO: Implement method to mark attendance for a participant in an event
    public void markAttendance(String eventId, String participantId) {
        Event event = events.get(eventId);
        Participant participant = event.getParticipantById(participantId);
        participant.setAttended(true);
    }

    // TODO: Implement method to get event details
    public String getEventDetails(String eventId) {

        Event event = events.get(eventId);
        return event.getDetails();
    }

    public Map<String, Event> getEvents() {
        return events;
    }
}

