package com.company;

import com.company.shop.Product;
import com.company.shop.ProductAtShop;
import com.company.shop.ProductTypeEnum;
import com.company.shop.Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    private static void inputForBuyer(Shop shop) {
        int chose = 1;
        while (chose >= 1 && chose <= 3) {
            switch (chose) {
                case 1:
                    System.out.println(shop.getProducts());
                    break;
                case 2:
                    System.out.print("Введите название продукта: ");
                    shop.getInfo(in.next());
                    break;
                case 3:
                    System.out.print("Введите название продукта: ");
                    shop.buy(in.nextInt());
                    break;
            }
            outputForBuyer();
            System.out.print("Введите число: ");
            chose = in.nextInt();
        }
        System.out.println("Возвращайтесь еще!!!");
    }

    private static void outputForBuyer() {
        System.out.println("1. Вывести все продукты");
        System.out.println("2. Поиск по имени");
        System.out.println("3. Покупка по id");
        System.out.println("Завершить работу - любое другое число");
    }

    public static void main(String[] args) {
        List<ProductAtShop> products = new ArrayList<>();
        products.add(new ProductAtShop("asd", 123, ProductTypeEnum.fish, 231, 23));
        products.add(new ProductAtShop("sdas", 123, ProductTypeEnum.liquid, 213, 2));
        products.add(new ProductAtShop("dasf", 23, ProductTypeEnum.fish, 232, 1));
        products.add(new ProductAtShop("asfsa", 123, ProductTypeEnum.meal, 323, 3));
        Shop shop = new Shop("MyShop", products);
        System.out.println("1. Для покупателя");
        System.out.println("2. Для продавца");
        System.out.println("Welcome to " + shop.getName());
        inputForBuyer(shop);
    }
}
