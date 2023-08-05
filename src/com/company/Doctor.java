package com.company;

public class Doctor extends Employee{
    String Speciality;
    String hasTenure;

    public Doctor(){
        System.out.println("This is a doctor object");
    }
    public void speak(){
        System.out.println("Doctor is speaking");
    }
}
