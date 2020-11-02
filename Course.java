package com.Homework_13;

public class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student) {
        //get the index of student to be dropped
        int stu_index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                stu_index = i;
                break;
            }
        }
        //drop student
        for (int i = stu_index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }

        // students[numberOfStudents] = null;
        numberOfStudents--;
    }

    //clone
    @Override
    public Object clone() throws CloneNotSupportedException{
        Course courseClone = (Course)super.clone();
        courseClone.students = (String[])(students.clone());
        return courseClone;
    }
}
