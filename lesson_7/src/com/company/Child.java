package com.company;

public class Child extends Parent {

    class Hand{
        public Hand(){
            System.out.println("hand");
        }

        private void someMet(){
            System.out.println("Hand someMet " + age);
        }

        public void getMet(){
            someMet();
        }
    }
    public Child() {
        Hand hand = new Hand();
        hand.getMet();
        System.out.println("Child");
    }

    public Child(int age) {
        super(age);
        System.out.println("Child age");
    }


    @Override
    public String getProfession() {
        return super.getProfession();
    }

    public final String getVoice(){
        return "voice";
    }

    public void method1(){
        System.out.println("child m1");
        method2();
    }

    void method2(){
        System.out.println("Child m2");
    }
}
