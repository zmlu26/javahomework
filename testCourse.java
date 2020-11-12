package com.Homework_13;

public class testCourse {
    public static void main(String[] args){
        //initialize
        Course course1 = new Course("Java");
        course1.addStudent("Peter");
        course1.addStudent("Kim");
        course1.addStudent("Anne");
        course1.addStudent("Jenn");
        //test drop students
//        for(int i=0; i<course1.getNumberOfStudents(); i++){
//            if(i == course1.getNumberOfStudents()-1){
//                System.out.println(course1.getStudents()[i]);
//            }
//            else {
//                System.out.print(course1.getStudents()[i] + ", ");
//            }
//        }
//        course1.dropStudent("Kim");
//        for(int i=0; i<course1.getNumberOfStudents(); i++){
//            if(i == course1.getNumberOfStudents()-1){
//                System.out.println(course1.getStudents()[i]);
//            }
//            else {
//                System.out.print(course1.getStudents()[i] + ", ");
//            }
//        }

        //test clone
        String[] studentList1 = course1.getStudents();
        System.out.println("===Before changing the first student in the original student list through cloned list===");
        System.out.println("First student in the student list is " + course1.getStudents()[1]);
        try{
            Course clonedCourse = (Course)course1.clone();
            String[] studentList2 = clonedCourse.getStudents();
            //change first students in clonedCourse to be "Simon
            clonedCourse.getStudents()[1] = "Simon";
            System.out.println("===After changing the first student in the original student list through cloned list===");
            System.out.println("First student in the student list is " + course1.getStudents()[1]);
            System.out.println("First student in the cloned student list is " + clonedCourse.getStudents()[1]);
            System.out.println("===\"course1 == clonedCourse(cloned one)?\"===");
            System.out.println("The answer is " + (course1 == clonedCourse));
            System.out.println("===\"studentList1 == studentList2(cloned one)?\"===");
            System.out.println("The answer is " + (studentList1 == studentList2));
        }
        catch(CloneNotSupportedException e){
            System.out.println("error");
        }

    }
}
