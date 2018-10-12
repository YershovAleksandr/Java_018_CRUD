package com.nam.crud;

public class Student {
    private int id;
    private String name;
    private char sex;
    private int course;
    private String group;

    //TODO add Subjects & Grades
    //private List<String>    mSubjects;
    //private List<String>    mGrades;

    public Student(int id, String name, char sex, int course, String group){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.course = course;
        this.group = group;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public char getSex(){
        return sex;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public int getCourse(){
        return course;
    }

    public void setCourse(int course){
        this.course = course;
    }

    public String getGroup(){
        return group;
    }

    public void setGroup(String group){
        this.group = group;
    }

    //TODO add methods for Subjects & Grades

}
