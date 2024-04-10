package com.app.eventscheduling.model;

public class Participant {
    private String participantId;
    private String participantName;
    private String contactInfo;

    private boolean attended;

    public boolean isAttended() {
        return attended;
    }

    // TODO: Implement constructor
    public Participant(String participantId, String participantName, String contactInfo) {
        this.participantId = participantId;
        this.participantName = participantName;
        this.contactInfo = contactInfo;
        this.attended = false;
    }


    // TODO: Implement getters and setters
    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }
}


