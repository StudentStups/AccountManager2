package com.company;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

/**
 * Created by Max on 10-Mar-17.
 */
public class Lesson {
    private static String nameOfLesson;
    private static ArrayList<Account> students;
    private static Account teacher;

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
