package com.company;

import java.util.Objects;

public class Animal {
    int age;
    int weight;

    public Animal(int age, int weight){
        this.age = age;
        this.weight = weight;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        return age == animal.age && weight == animal.weight;
//    }
//
    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
