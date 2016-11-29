package com.example.Dao;

import com.example.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer,Student> students;

    static {
        students=new HashMap<Integer,Student>() {
            {
                put(1,new Student(1,"Helder","Disciplina 1"));
                put(2,new Student(2,"Luis","Disciplina 2"));
                put(3,new Student(3,"Meneses","Disciplina 3"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public void removeStudentById(int id) {
        this.students.remove(id);
    }
}
