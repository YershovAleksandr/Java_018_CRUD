package com.nam.crud;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

    private List<Student> students;

    public StudentDaoImpl(){
        students = new ArrayList<>();
    }

    @Override
    public List<Student> getAllStudents(){
        return students;
    }

    @Override
    public Student getStudent(int id){
        return students.get(id);
    }

    @Override
    public void createStudent(Student student){
        students.add(student);
    }

    @Override
    public void updateStudent(Student student){
        Student st = students.get(student.getId());

        st.setName(student.getName());
        st.setSex(student.getSex());
        st.setCourse(student.getCourse());
        st.setGroup(student.getGroup());
    }

    @Override
    public void deleteStudent(Student student){
        students.remove(student.getId());
    }
}
