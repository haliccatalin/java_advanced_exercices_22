package com.sda.schedulerApplication;

import java.time.LocalDate;

public class Trainer extends Person{
    private boolean isAuthorized;



    public Trainer(String firstName, String lastName, LocalDate dateOfBirth, boolean isAuthorized) {
        super(firstName, lastName, dateOfBirth);
        this.isAuthorized = isAuthorized;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", ").append("Authorized:").append(", ")
                .append(this.isAuthorized ?"Yes" : "No");
        return sb.toString();
    }
}
