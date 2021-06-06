package com.sda.SDASchedulerApp;

import java.time.LocalDate;

public class Student extends Person {

    private boolean hasPreviousJavaKnowledge;


    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public boolean isHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    public void setHasPreviousJavaKnowledge(boolean hasPreviousJavaKnowledge) {
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", ");
        sb.append("Java Knowledge: ");
        sb.append(this.hasPreviousJavaKnowledge ? "Yes" : "No");

        return sb.toString();
    }

}
