package com.company;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    private static int randomNumber(int min, int max){
        return (int)(Math.random()*(max-min)+min);
    }

    public static Account createNewAccount(){
        Account newAccount = new Account();
        newAccount.setName(RandomString.randomString());
        newAccount.setLogin(newAccount.getName()+"@"+RandomDomain.randomDomain());
        newAccount.setPassword("MyPass");
        newAccount.setDateOfLastLogin(System.currentTimeMillis());
        newAccount.setTypeStudent();
        //logger.log(Level.INFO,"Account name is - "+Account.getName());
        //logger.log(Level.INFO,"Account login is - "+Account.getLogin());
        //logger.log(Level.INFO,"Account password is - "+Account.getPassword());
        //logger.log(Level.INFO,"Account lastLogin is - "+Account.getDateOfLastLogin());
        //logger.log(Level.INFO,"Account type is - "+Account.getType());
        return newAccount;
    }

    public static Account createTeacherAccount(){
        Account newAccount = new Account();
        newAccount.setName(RandomString.randomString());
        newAccount.setLogin(newAccount.getName());
        newAccount.setPassword("MyPass");
        newAccount.setDateOfLastLogin(System.currentTimeMillis());
        newAccount.setTypeTeacher();
        //logger.log(Level.INFO,"Account name is - "+Account.getName());
        //logger.log(Level.INFO,"Account login is - "+Account.getLogin());
        //logger.log(Level.INFO,"Account password is - "+Account.getPassword());
        //logger.log(Level.INFO,"Account lastLogin is - "+Account.getDateOfLastLogin());
        //logger.log(Level.INFO,"Account type is - "+Account.getType());
        return newAccount;

    }

    public static ArrayList<Account> createNumberOfRandomAccounts(int number){
        ArrayList<Account> accounts = new ArrayList<Account>();
        for (int i = 0; i < number; i++){
            accounts.add(createNewAccount());
            //logger.log(Level.INFO,"Account name is - "+Account.getName());
           // logger.log(Level.INFO,"Account login is - "+Account.getLogin());
           // logger.log(Level.INFO,"Account password is - "+Account.getPassword());
           // logger.log(Level.INFO,"Account lastLogin is - "+Account.getDateOfLastLogin());
          //  logger.log(Level.INFO,"Account type is - "+Account.getType());
        }
        return accounts;
    }

    public static Lesson createRandomLesson(){
        Lesson newLesson = new Lesson();
        newLesson.setNameOfLesson("Name of lesson here... ");
        newLesson.setTeacher(createTeacherAccount());
        newLesson.setStudents(createNumberOfRandomAccounts(randomNumber(0,20)));
        return newLesson;
    }

    public static ArrayList<Lesson> createPackOfLessons(int number){
        ArrayList<Lesson> pack = new ArrayList<Lesson>();
        for(int i = 0; i < number; i++){
            pack.add(createRandomLesson());
        }
        return pack;
    }

    public static Schedule createOneDaySchedule(){
        Schedule dayOne = new Schedule();
        dayOne.setLessons(createPackOfLessons(randomNumber(0,5)));
        return dayOne;

    }

    public static ArrayList<Schedule> createWeekOfLessons(){
        ArrayList<Schedule> week = new ArrayList<Schedule>();
        for (int i = 0; i < 7; i++){
            week.add(createOneDaySchedule());
        }
        return week;
    }

    public static ArrayList<ArrayList<Schedule>> createMonthOfLessons(){
        ArrayList<ArrayList<Schedule>> month = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            month.add(createWeekOfLessons());
        }
        return month;
    }

    public static ArrayList<Lesson> getLessonsForDay(long dayInMills){
        ArrayList<Lesson> lessons = new ArrayList<>();
        Date date = new Date();
        date.setTime(dayInMills);


       /* SimpleDateFormat formating = new SimpleDateFormat("A") ;
        String dateAsString = formating.format(date);
        Date startOfLessson = new Date(date.getYear(),date.getMonth(),date.getDate(),9 ,0,0);
        */


        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        int day = gc.get(gc.DAY_OF_WEEK);
        if(day==7 || day==1){
            System.out.println("weekend");
        }
        else {
            int dayOfMonth = gc.get(gc.DAY_OF_MONTH);
            int moth = gc.get(gc.MONTH);
            int year = gc.get(gc.YEAR);
            Date correctDate = new Date(dayOfMonth,moth,year);
        }




        return lessons;

    }

    public static void main(String[] args) {


    }
}
