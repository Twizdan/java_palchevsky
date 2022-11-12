package com.test.idea;

abstract class Student {
    private String name = "Your name";
    private Integer age = 19;

    public String setName(String name){
        this.name = name;
        return name;
    }

    public String getName(){
        return name;
    }

    public int setAge(int age){
        this.age = age;
        return age;
    }

    public int getAge(){
        return age;
    }
}
