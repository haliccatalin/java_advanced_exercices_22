package com.sda.SDASchedulerApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppManager {

    private List<Student> studentsList;
    private List<Trainer> trainersList;
    private List<Group> groupsList;


    public void start() {

        initStudents();
        initGroups();
        initTrainers();
        System.out.println("--------------");
        assignTrainerToGroup();
        System.out.println("--------------");
        assignStudentsToGroup();
        System.out.println("--------------");

    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * ((max + 1) - min)) + min);
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


    public void initStudents() {
        this.studentsList = new ArrayList<>();
        System.out.println("Students list: ");

        for (int i = 0; i < 15; i++) {
            //string.valueOf transforma nr intreg in string
            Student student = new Student("std", String.valueOf(i + 1),
                    LocalDate.now(), i % 2 == 0 ? true : false);
            studentsList.add(student);
            System.out.println(student.toString());

        }
        System.out.println("________________");
    }

    public void initGroups() {
        this.groupsList = new ArrayList<>();
        System.out.println("Groups list: ");
        for (int i = 0; i < 4; i++) {
            Group group = new Group();
            //nu folosim string.valueof pt i+1,
            // pentru ca i+1 va fi concatenat cu un string, iar rezultatul va fi tot string
            group.setName("JavaRemote" + (i + 1));
            groupsList.add(group);
            System.out.println(group.toString());
        }

        System.out.println("---------------");
    }

    public void initTrainers() {
        System.out.println("Trainers list: ");
        Trainer trainer1 = new Trainer("Popa", "Ana", LocalDate.of(1987, 1, 12), true);
        Trainer trainer2 = new Trainer("Alex", "Maria", LocalDate.of(1990, 2, 12), false);
        Trainer trainer3 = new Trainer("Ana", "Ana", LocalDate.of(1978, 4, 10), true);
        this.trainersList = Arrays.asList(trainer1, trainer2, trainer3);

        System.out.println(trainer1);
        System.out.println(trainer2);
        System.out.println(trainer3);

    }


}
