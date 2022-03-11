package com.company.shop;


import com.company.shop.exception.ProductNotFoundException;

import java.util.List;

public class Shop implements IBuyer, ISeller {

    private String name;
    private List<ProductAtShop> products;
    private List<User> sellers;

    public Shop(String name, List<ProductAtShop> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public Product buy(long id) throws ClassNotFoundException {
        for (ProductAtShop product : products) {
            if (product.compare(id)) {
                product.buy();
                if (product.getCount() == 0) {
                    products.remove(product);
                }
                return product;
            }
        }
        throw new ProductNotFoundException("Продукт не был найден");
    }

    @Override
    public void getInfo(String name) {
        for (Product product : products) {
            if (product.containInName(name)) {
                System.out.println(product);
            }
        }
    }
    public void getInfoId(long id){
        for (ProductAtShop product : products) {
            if (product.compare(id)) {
                System.out.println(product);
            }
        }
    }



    public String getName() {
        return name;
    }

    public List<ProductAtShop> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

    @Override
    public  void add(ProductAtShop product) {
        //найти удостовериться что такого продукта еще нет, иначе именить значение count
        if(this.products.contains(product)){
            for (ProductAtShop prd : products){
                if (this.products.equals(prd)){
                    prd.addCount(product.getCount());
                }
            }
        }else{
            this.products.add(product);
        }
    }

    @Override
    public void updateProduct(ProductAtShop product, long id) {
        for (ProductAtShop prod : products){
                if (product.compare(id)){
                    this.products.set(3,product);
                }else {
                    System.out.println("Нет такого продукта");
            }
        }
        }


    }



