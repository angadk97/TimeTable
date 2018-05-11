package com.android.garvit.timetable;

import java.io.Serializable;

public class Subjects implements Serializable{
    private String Name;
    private String Room;
    private String Prof;
    private String Day;
    private String Period;

    public Subjects(String name, String room, String prof, String day, String period) {
        Name = name;
        Room = room;
        Prof = prof;
        Day = day;
        Period = period;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String room) {
        Room = room;
    }

    public String getProf() {
        return Prof;
    }

    public void setProf(String prof) {
        Prof = prof;
    }

    public String getDay() { return Day; }

    public void setDay(String day) {
        Day = day;
    }

    public String getPeriod() { return Period; }

    public void setPeriod(String period) {
        Period = period;
    }


}
