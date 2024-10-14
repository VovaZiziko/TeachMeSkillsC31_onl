package Homework15;

public class Student {

    private String name;
    private int course;
    private int group;
    private int[] grades;



    public Student(String name, int course, int group, int[] grades) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.grades = grades;

    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public int[] getGrades() {
        return grades;
    }

    public double avgGrades(){
        double sumOfGrades = 0;
        for(int grade : grades){
            sumOfGrades += grade;

        }
        return sumOfGrades/grades.length;
    }

}
