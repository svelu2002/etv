package com.app.eventscheduling.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Event {
    private String eventId;
    private String eventName;
    private String eventDate;
    private String eventTime;
    private String eventLocation;
    private List<Participant> participants;

    public String getEventId() {
        return eventId;
    }

    public List<Participant> getParticipants() {
        return participants;
    }


    // TODO: Implement constructor

    public Event(String eventId, String eventName, String eventDate, String eventTime, String eventLocation) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.participants = new ArrayList<>();
    }


    // TODO: Implement getters and setters

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }


    // TODO: Implement method to add a participant to the event
    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    // TODO: Implement method to mark attendance for a participant
    public void markAttendance(Participant participant) { participant.setAttended(true); }

    public Participant getParticipantById(String participantId) {
        for (Participant participant: participants) {
            if (participant.getParticipantId() == participantId)
                return participant;
        }
        return null;
    }

    public String getDetails() {
        String details =  "Event Name: " + getEventName() + "\nDate: " + getEventDate() + "\nTime: " + getEventTime() + "\nLocation: " + getEventLocation() + "\nParticipants:\n";
        if (participants != null) {
            for(Participant participant: participants) {
                details = details.concat("  " + participant.getParticipantName() + " -- " + (participant.isAttended() ? "Attended" : "Didn't Attend") + "\n");
            }
        }
        return details;
    }
}

