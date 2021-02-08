package com.alimuddin.knoldus;

public class User {

    private int id;
    private String name;
    private int age;
    private String course;

    public User() {
    }

    public User(int id ,String name, int age,String course) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getID() {
        return this.id;
    }



    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public String getCourse()
    {
        return this.course;
    }

    public String toString() {
        return "{id=" +id+ ", name='" + name + "', age=" + age + ", course=" + course + "}";
    }
}