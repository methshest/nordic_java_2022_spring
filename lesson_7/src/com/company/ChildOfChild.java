package com.company;

public class ChildOfChild extends Child{
    public ChildOfChild(){
        System.out.println("CoC");
    }
    public ChildOfChild(int age){
        super(age);
        System.out.println("CoC age");
    }

    @Override
    public String getProfession() {
        return super.getVoice();
    }

    @Override
    protected void method2() {
        System.out.println("CoC m2");
        super.method1();
    }
}
