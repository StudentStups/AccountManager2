package com.company;



import java.util.Calendar;
import java.util.Date;


/**
 * Created by Max on 10-Mar-17.
 */
public class Account {
    private static String login;
    private static String password;
    private static long dateOfLastLogin = System.currentTimeMillis();
    private static Date birthDate;
    private static int type;
    private static int TYPE_TEACHER = 1;
    private static int TYPE_STUDENT = 0;

    public void setTypeTeacher(){
        this.type = TYPE_TEACHER;
    }
    public void setTypeStudent(){
        this.type = TYPE_STUDENT;
    }

    public static int getType() {
        return type;
    }

    public void setBirthDate(int Year, int Month, int Day ) {
        Calendar cal = Calendar.getInstance();
        cal.set( Year, Month, Day );
        this.birthDate = cal.getTime();
    }

    public static Date getBirthdate() {
        return birthDate;
    }

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    public static long getDateOfLastLogin() {
        return dateOfLastLogin;
    }

    public static void setLogin(String login) {
        Account.login = login;
    }

    public static void setPassword(String password) {
        Account.password = password;
    }

    public static void setDateOfLastLogin(long dateOfLastLogin) {
        Account.dateOfLastLogin = dateOfLastLogin;
    }



}
