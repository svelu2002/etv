package com.app.eventscheduling;
import com.app.eventscheduling.model.Event;
import com.app.eventscheduling.model.Participant;
import com.app.eventscheduling.service.EventScheduler;

public class EventManagementApp {
    public static void main(String[] args) {
        // TODO: Create an instance of EventScheduler
        EventScheduler eventScheduler = new EventScheduler();

        // TODO: Schedule an event
        Event event = new Event("E001", "Sample Event", "2024-03-15", "09:00 AM", "City Park");
        eventScheduler.scheduleEvent(event);

        // TODO: Register participants for the event
        Participant participant1 = new Participant("P001", "John Doe", "john@example.com");
        eventScheduler.registerParticipant(event.getEventId(), participant1);
        Participant participant2 = new Participant("P002", "Velayutham Sankaralingam", "velu@example.com");
        eventScheduler.registerParticipant(event.getEventId(), participant2);

        // TODO: Mark attendance for participants
        eventScheduler.markAttendance(event.getEventId(), participant1.getParticipantId());
        // eventScheduler.markAttendance(event.getEventId(), participant2.getParticipantId());

        // TODO: Display event details and attendance reports
        System.out.print(eventScheduler.getEventDetails(event.getEventId()));
    }
}
