package com.company;

public enum Days {
    SUNDAY("Holiday"),
    MONDAY("Java Lesson"),
    TUESDAY("English Lesson"),
    WEDNESDAY("English Talking Club"),
    THURSDAY("Technical Soft Skills"),
    FRIDAY("Master Class From Esen N"),
    SATURDAY("Practicing Your Self");

    private String difference;

    Days(String difference) {
        this.difference = difference;
    }

    public String getDifference() {
        return difference;
    }

    public void setDifference(String difference) {
        this.difference = difference;
    }
}
