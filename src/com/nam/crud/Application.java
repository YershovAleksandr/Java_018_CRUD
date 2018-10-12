package com.nam.crud;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {

    private StudentDao studentDao = new StudentDaoImpl();

    public Application(){
        System.out.println("Application::Constructor");
    }

    public void run(){
        System.out.println("Application::run()");

        //read();
        create();
        read();
        update();
        read();
        delete();
        read();
    }

    private void create(){
        System.out.println("Application::create()");

        studentDao.createStudent(new Student(0,"John",'M',1,"P-11"));
        studentDao.createStudent(new Student(1,"John", 'M',1,"P-11"));
        studentDao.createStudent(new Student(2,"Emma", 'F',2,"P-22"));

    }

    private void read(){
        System.out.println("Application::read()");

        for (Student student: studentDao.getAllStudents()) {
            System.out.print("Name: " + student.getName());
            System.out.print(" Sex: " + student.getSex());
            System.out.print(" Course: " + student.getCourse());
            System.out.println(" Group: " + student.getGroup());
        }
    }

    private void update(){
        System.out.println("Application::update()");

        for (Student student: studentDao.getAllStudents()){
            if (student.getCourse() == 1){
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    private void delete(){
        System.out.println("Application::delete()");

        Iterator iterator = studentDao.getAllStudents().iterator();

        while (iterator.hasNext()){

            Student student = (Student)iterator.next();

            if (student.getSex() == 'M'){
                iterator.remove();
            }

        }
        /*for (Student student: studentList){
            if (student.getSex() == 'F'){
                studentList.remove(student);
            }
        }
        */
    }

    private void print(){
        System.out.println("Application::delete()");
    }



}
