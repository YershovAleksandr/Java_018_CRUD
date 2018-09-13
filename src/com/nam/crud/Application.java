package com.nam.crud;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {

    private static Application instance = new Application();

    private ArrayList<Student>  studentList;

    private Application(){
        System.out.println("Application::Constructor");
    }

    public static Application getInstance(){
        return instance;
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

        studentList = new ArrayList<Student>();

        studentList.add(createStudent("John", "Doe", 'M',1,"P-11"));
        studentList.add(createStudent("John", "Smith", 'M',1,"P-11"));
        studentList.add(createStudent("Emma", "Williams", 'F',2,"P-22"));

    }

    private Student createStudent(String name, String lastname, char sex, int course, String group){
        Student student = new Student();

        student.setName(name);
        student.setLastname(lastname);
        student.setSex(sex);
        student.setCourse(course);
        student.setGroup(group);

        return student;
    }

    private void read(){
        System.out.println("Application::read()");

        if (studentList == null){
            return;
        }
        for (Student student: studentList) {
            System.out.print("Name: " + student.getName());
            System.out.print(" Lastname: " + student.getLastname());
            System.out.print(" Sex: " + student.getSex());
            System.out.print(" Course: " + student.getCourse());
            System.out.println(" Group: " + student.getGroup());
        }
    }

    private void update(){
        System.out.println("Application::update()");

        for (Student student: studentList){
            if (student.getCourse() == 1){
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    private void delete(){
        System.out.println("Application::delete()");

        Iterator iterator = studentList.iterator();

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
