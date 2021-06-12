package com.sda.schedulerApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppManager {
    private List<Student> studentsList;
    private List<Trainer> trainersList;
    private List<Group> groupsList;


    public void start() {
        initializeStudents();
        System.out.println("----------------------------------------");
        initializeTrainers();
        System.out.println("----------------------------------------");
        initializeGroups();
        System.out.println("----------------------------------------");
        assignTrainerToGroup();
        System.out.println("----------------------------------------");
        assignStudentsToGroup();
        System.out.println("----------------------------------------");
        System.out.println(isDistinctStudentToGroup());
    }

    public void initializeStudents() {
        this.studentsList = new ArrayList<>();
        System.out.println("Students list: ");
        for (int i = 0; i < 15; i++) {
            //String.valueOf transforma numarul intreg in String
            Student student = new Student("Std", String.valueOf(i + 1),
                    LocalDate.now(), i % 2 == 0 ? true : false);
            studentsList.add(student);

            System.out.println(student.toString());
        }
        System.out.println("----------------------------------");
    }

    public void initializeGroups() {
        this.groupsList = new ArrayList<>();
        System.out.println("Groups list: ");

        for (int i = 0; i < 4; i++) {
            Group group = new Group();
            //nu folosim String.valueOf pentru i+1,
            // pentru ca i+1 va fi concatenat cu un string,
            // iar rezultatul va fi tot string
            group.setName("Java Remote" + (i + 1));
            groupsList.add(group);
            System.out.println(group.toString());
        }
        System.out.println("----------------------------------");
    }

    public void initializeTrainers() {

        System.out.println("Trainers list: ");
        Trainer trainer1 = new Trainer("Tartar", "Lavinia",
                LocalDate.of(1988, 8, 28), true);
        Trainer trainer2 = new Trainer("Gaina", "Elena",
                LocalDate.of(1990, 11, 21), true);
        Trainer trainer3 = new Trainer("Lascu", "Mihail",
                LocalDate.of(1985, 5, 12), false);
        this.trainersList = Arrays.asList(trainer1, trainer2, trainer3);
        System.out.println(trainer1);
        System.out.println(trainer2);
        System.out.println(trainer3);

    }

    public void assignTrainerToGroup() {
        for (int i = 0; i < groupsList.size(); i++) {
            int trainerIndex = getRandomNumber(0, trainersList.size() - 1);
            Trainer trainer = trainersList.get(trainerIndex);
            groupsList.get(i).setTrainer(trainer);
            System.out.println(groupsList.get(i).toString());

        }


    }

    public void assignStudentsToGroup() {
        for (Group group : groupsList) {
            int students = getRandomNumber(2, 3);
            for (int i = 0; i < students; i++) {
                int studentIndex = getRandomNumber(0, studentsList.size() - 1);
                Student student = studentsList.get(studentIndex);
                group.addStudent(student);
            }

            System.out.println(group);
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max + 1 - min)) + min) ;
    }

    public boolean isDistinctStudentToGroup() {
        return studentsList.stream().anyMatch((Student s) -> s.getLastName().equals(s.getLastName()));
    }

    public void displayAllStudentsSortedAlphabeticallyByLastName(List<Student> studentsList){
        studentsList.stream().sorted()
    }


}
