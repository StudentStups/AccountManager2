package com.company;

/**
 * Created by student on 22.03.2017.
 */
public class Teacher extends Account {
    private static String subject;

    public static String getSubject() {
        return subject;
    }

    public static void setSubject(String subject) {
        Teacher.subject = subject;
    }
}
