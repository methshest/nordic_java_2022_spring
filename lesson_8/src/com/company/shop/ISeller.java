package com.company.shop;

public interface ISeller {
    void add(ProductAtShop product);
    void updateProduct(ProductAtShop product,long id);


    void getInfoId(long id);
}
