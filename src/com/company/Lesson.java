package com.company;


import java.util.ArrayList;


/**
 * Created by Max on 10-Mar-17.
 */
public class Lesson {
    private static String nameOfLesson;
    private static ArrayList<Account> students;
    private static Account teacher;
    private long startOfLesson;
    private long lenghtOfLesson;


    public long getStartOfLesson() {
        return startOfLesson;
    }

    public void setStartOfLesson(long startOfLesson) {
        this.startOfLesson = startOfLesson;
    }

    public long getLenghtOfLesson() {
        return lenghtOfLesson;
    }

    public void setLenghtOfLesson(long lenghtOfLesson) {
        this.lenghtOfLesson = lenghtOfLesson;
    }

    public static String getNameOfLesson() {
        return nameOfLesson;
    }

    public static void setNameOfLesson(String nameOfLesson) {
        Lesson.nameOfLesson = nameOfLesson;
    }

    public static ArrayList<Account> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Account> students) {
        Lesson.students = students;
    }

    public static Account getTeacher() {
        return teacher;
    }

    public static void setTeacher(Account teacher) {
        Lesson.teacher = teacher;
    }
}
