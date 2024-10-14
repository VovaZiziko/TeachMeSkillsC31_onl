package Homework15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentProcessor {

    private List<Student> studentList;

    public StudentProcessor(List<Student> s) {
        studentList = s;
    }

    public void printStudents(List<Student> studentList, int course){
        for(Student student : studentList){
            if(student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }

    public List<Student> process() {
        List<Student> procStudentsList = studentList.stream()
                .filter(student -> student.avgGrades() >= 3)
                .collect(Collectors.toList());
        procStudentsList.stream().forEach(student ->student.setCourse(student.getCourse() + 1) );
        return procStudentsList;
    }
}
