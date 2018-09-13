package com.nam.crud;

import java.util.List;

public class Student {
    private String  mName;
    private String  mLastname;
    private char    mSex;
    private int     mCourse;
    private String  mGroup;

    //TODO add Subjects & Grades
    private List<String>    mSubjects;
    private List<String>    mGrades;

    public Student(){
//        mName =
    }

    public String getName(){
        return mName;
    }

    public void setName(String name){
        mName = name;
    }

    public String getLastname(){
        return mLastname;
    }

    public void setLastname(String lastname){
        mLastname = lastname;
    }

    public char getSex(){
        return mSex;
    }

    public void setSex(char sex){
        mSex = sex;
    }

    public int getCourse(){
        return mCourse;
    }

    public void setCourse(int course){
        mCourse = course;
    }

    public String getGroup(){
        return mGroup;
    }

    public void setGroup(String group){
        mGroup = group;
    }

    //TODO add methods for Subjects & Grades

}
