package com.company.shop;

public interface IBuyer {

    Product buy(long id) throws ClassNotFoundException;

    void getInfo(String name);
}
