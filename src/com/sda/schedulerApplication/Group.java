package com.sda.schedulerApplication;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private Trainer trainer;
    private List<Student> studentsList;

    public Group() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Student> getStudentsList() {
        if (studentsList == null) {
            return new ArrayList<>();
        }
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {

        this.studentsList = studentsList;
    }

    public void addStudent(Student student) {
        if (studentsList == null) {
            studentsList = new ArrayList<>();
        }
        try{
            studentsList.add(student);
            if (studentsList.size() > 4){
                throw new Exception("Maximum number of students reached");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }




    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.name);
        sb.append(", ").append("Trainer: ");
        if (this.trainer == null) {
            sb.append("Trainer does not exist").append(", ");
        } else {
            sb.append(this.trainer.getFirstName())
                    .append(" ").append(this.trainer.getLastName())
                    .append(", ");
        }
        sb.append("Students number: ")
                .append(getStudentsList().size());
        return sb.toString();
    }
}
