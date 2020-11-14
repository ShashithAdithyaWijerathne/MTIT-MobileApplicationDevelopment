package com.example.smile;

public class Jokes {
    int ID;
    String Type;
    String Setup;
    String PunchLine;

    public Jokes(int ID, String type, String setup, String punchLine) {
        this.ID = ID;
        Type = type;
        Setup = setup;
        PunchLine = punchLine;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSetup() {
        return Setup;
    }

    public void setSetup(String setup) {
        Setup = setup;
    }

    public String getPunchLine() {
        return PunchLine;
    }

    public void setPunchLine(String punchLine) {
        PunchLine = punchLine;
    }
}
