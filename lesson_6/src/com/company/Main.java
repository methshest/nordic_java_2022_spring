package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Animal> lst = new ArrayList<>();
        Animal animal1 = new Animal(12,12);
        lst.add(animal1);
        lst.add(new Animal(13, 13));
        lst.set(1,new Animal(143,123));



        Map<Person, List<Animal>> map =  new HashMap<>();
        map.put(new Person("Radmir"), lst);


        List<Animal> lst1 = new ArrayList<>();
        lst1.add(new Animal(13, 13));
        lst1.add(new Animal(143,123));
        map.put(new Person("Egor"), lst1);

        System.out.println(map.get(new Person("Radmir")));


        for(Person key: map.keySet()){
            System.out.println(map.get(key));
        }


        Set<Person> uniquePerson = new HashSet<>();
        uniquePerson.add(new Person("Gylua"));
        uniquePerson.add(new Person("Yuri"));
        uniquePerson.add(new Person("Yuri"));
        uniquePerson.add(new Person("Egor"));
        for(Person person : uniquePerson){
            System.out.println(person);
        }




    }

    public static Animal getAnimal(Animal animal, int some) {
        int some1 = 213;
        return null;
    }
}
