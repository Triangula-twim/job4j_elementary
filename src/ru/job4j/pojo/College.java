package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAdmissionDate("23.04.2020");
        student.setFio("Frolov Yuriy Olegovich");
        student.setGroup("first");
        System.out.println("Student: " + student.getFio() + " from " + student.getGroup() + " group. Date of admission: " + student.getAdmissionDate());
    }
}
