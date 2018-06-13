package com.company.w8.Shopping;

public class Person {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(){
    }

    public Person(String name){
        setName(name);
    }

    public Person(String name, String age) {
        setName(name);
        setName(age);
    }

}
