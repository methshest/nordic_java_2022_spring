package com.company;

public class Parent extends AbstractParent implements Person {
    int age;
    static int FIELD;

//    {
//        age = 3;
//    }

    static {
        field = 3;
    }

    public Parent() {
        System.out.println("Parent");
    }

    public Parent(int age) {
        System.out.println("Parent age");
        this.age = age;
    }

    public String getProfession() {
        return ProfessionEnum.BUILDER.toString();
    }

    @Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                '}';
    }
}
