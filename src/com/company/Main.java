package com.company;


import sun.java2d.pipe.SpanShapeRenderer;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    private static int randomNumber(int min, int max){
        return (int)(min+ (Math.random()*(max-min)+1));
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
        ArrayList<Teacher> teacherArray = new ArrayList<>();
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Algebra");
        subjects.add("Geom ");
        subjects.add("Phys");
        subjects.add("Sport");
        subjects.add("Chem");
        subjects.add("His");
        subjects.add("Mus");
        subjects.add("English");
        subjects.add("Spanish");
        subjects.add("Ling");
        ArrayList<Lesson> lessons = new ArrayList<>();
        long timeOfFirstLesson = getCorrectTime(dayInMills);
        if(timeOfFirstLesson==0){
            System.out.println("WEEKEND");
        }
        else {
            for(int j = 0; j < 10; j++){
                Teacher teacher = new Teacher();
                teacher.setTypeTeacher();
                teacher.setName("Name of Teacher Here...");
                teacher.setSubject(subjects.get(j));
                teacher.setDateOfLastLogin(System.currentTimeMillis());
                teacher.setPassword("123");
                teacherArray.add(teacher);
            }
            for (int i = 0; i < randomNumber(4,7); i++){
                Lesson lesson = new Lesson();

            }
        }
        return lessons;


    }


    public static long getCorrectTime(long dayInMills){
        long correctTime =0;
        Date date = new Date();
        date.setTime(dayInMills);
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        int day = gc.get(gc.DAY_OF_WEEK);
        if(day==7 || day==1){
            System.out.println("weekend");
            return correctTime;
        } else {
            int dayOfMonth = gc.get(gc.DAY_OF_MONTH);
            int moth = gc.get(gc.MONTH);
            int year = gc.get(gc.YEAR);
            GregorianCalendar correctDate = new GregorianCalendar();
            correctDate.set(year,moth,dayOfMonth,9,0,0);
            correctTime = correctDate.getTimeInMillis();

        }
        return correctTime;
    }

    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(getCorrectTime(System.currentTimeMillis()));
        SimpleDateFormat formatting = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        String dateAsString = formatting.format(date);
        System.out.println(dateAsString);



    }
}
