//create a java program that has the following three classes.
//attributes must be encapsulated,classes must have a constructor that initialises the attributes
//the classes must have a zero argument constructor,a batch must have three students

// Class Declaration

package com.Assignment3;

public class student {

    String name;
    String email;
    Str age;
    String address;
    //constructor
    class student {
        public void student(String name, String email,
                            int age, String address) {
            this.name = name;
            this.email = email;
            this.age = age;
            this.address = address;
        }

        public String getname() {
            return name;
        }

        public String getemail() {
            return email;
        }

        public int getage() {
            return age;
        }

        public String getaddress() {
            return address;
        }

        public void setname(String name){
            this.name=name;
        }
        public void setage(String age){
            this.age=age;
        }
        public void setemail(String email){
            this.email=email;
        }
        public void address(String address){
            this.address=address;
        }

    }


    class teacher
    {

        public void teacher(String name, String email,
                            int age, String address)
        {
            System.out.println("teacher default constructor");
        }

        public String getteachername() {
            return name;
        }

        public String getteacheremail() {
            return email;
        }

        public int getteacherage() {
            return age;
        }

        public String getteacheraddress() {
            return address;
        }

        public void setteachername(String name){
            this.name=name;
        }
        public void setteacherage(String age){
            this.age=age;
        }
        public void setteacheremail(String email){
            this.email=email;
        }
        public void setteacheraddress(String address){
            this.address=address;
        }
    }

}




package javaassignments.assignment3;

public class Teacher {
    public static void main(string args[]) {
        student teacher=new teacher();

        teacher.setteachername("MR.bablu");
        teacher.setteacherage(67);
        teacher.setteacheremail("MRbablu@dhakar.fel");
        teacher.setteacheraddress("Ghar me");

        teacher.setteachername("MR.dablu");
        teacher.setteacherage(45);
        teacher.setteacheremail("MRablu@dhakar.fel");
        teacher.setteacheraddress("Ghar me");

        teacher.setteachername("MR.Tablu");
        teacher.setteacherage(55);
        teacher.setteacheremail("MRtablu@dhakar.fel");
        teacher.setteacheraddress("Ghar me");

        System.out.println("teacher name" + teacher.getteachername());
        System.out.println("teacher age" + teacher.getteacherage());
        System.out.println("teacher email" + teacher.getteacheremail());
        System.out.println("teacher address" + teacher.getteacheraddress());
    }
}

package javaassignments.assignment3;

public class School {

    student.setname("bablu");
    public static void main(string args[]) {
        student student=new student();

        student.setstudentage(10);
        student.setstudentemail("bablu@dhakar.fel");
        student.setstudentaddress("Ghar me");

        student.setstudentname("Dablu");
        student.setstudentage(20);
        student.setstudentemail("Dablu@dhakar.fel");
        student.setstudentaddress("Gharwa me");

        student.setstudentname("Tablu");
        student.setstudentage(30);
        student.setstudentemail("Tablu@dhakar.fel");
        student.setstudentaddress("lockdown me");


        System.out.println("student name" + student.getstudentname());
        System.out.println("student age" + student.getstudentage());
        System.out.println("student email" + student.getstudentemail());
        System.out.println("student address" + student.getstudentaddress());

    }
}
