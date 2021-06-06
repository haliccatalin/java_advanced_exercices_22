package com.sda.SDASchedulerApp;

/**
 * Create a class hierarchy Person.
 * java - firstname
 * - lastname
 * - dateOfBirth
 * Trainer.java (extends Person) - isAuthorized (boolean)
 * Student.java (extends Person) - hasPreviousJavaKnowledge (boolean)
 * Create a Group class which has name (Java2Gdansk, Tester3Bucharest, etc)
 * one trainer a list of studentsManually initialize 15 students;
 * 4 groups and 3 trainers;
 * Store all students in a list;
 * all groups in a list;
 * all trainers in a list;
 * Asign a trainer to each group
 * Asign 2-3 students to each groupEnsure the fact that a group will only have distinct students (How would you do that?)
 * Ensure the fact that a group will only have a maximum of 5 students;
 * When you try to add a 6th one throw an MaximumNumberOfStudentsReached exceptionDisplay all students in a group sorted alphabetically by lastName
 * Display the group with the maximum number of studentsDisplay all students younger than 25,
 * from all groupsDisplay all students grouped by trainer that teaches to them (eg. Trainer1 - stud1, stud3, stud4; Trainer2 - stud2, stud 10)
 * - regardless of the group they're part of (If you were to store this information in a data structure what would you use?)
 * Display all students with previous java knowledge
 * Display the group with the highest number of students with no previous java knowledge
 * Remove all the students younger than 20 from all groups
 */

public class Main {
    public static void main(String[] args) {
        AppManager appManager = new AppManager();
        appManager.start();
    }
}
