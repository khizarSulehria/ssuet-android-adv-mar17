package com.company;

/**
 * Created by zeeshanhanif-pc on 4/16/2017.
 */
public class Student extends Human {


    public Student(String name, int age){
        super(name,age);
    }

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displayDetails(){
        System.out.println(this.getName());
        System.out.println(super.getAge());
    }
}






