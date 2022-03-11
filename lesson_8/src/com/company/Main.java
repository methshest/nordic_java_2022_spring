package com.company;

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
                    try {
                        shop.buy(in.nextInt());
                    } catch (ClassNotFoundException ex) {
                        System.out.println(ex);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
            outputForBuyer();
            System.out.print("Введите число: ");
            chose = in.nextInt();
        }
        System.out.println("Возвращайтесь еще!!!");
    }
    private  static void inputForSeller(Shop shop) {
        int choose = 1;
        while (choose >= 1 && choose <= 4) {
            switch (choose) {
                case 1:
                    System.out.println(shop.getProducts());
                    break;
                case 2:
                    System.out.print("Введите id продукта: ");
                    shop.getInfoId(in.nextLong());
                    break;
                case 3:
                    System.out.print("Вы добавили продукт\n");
                    shop.add(new ProductAtShop("qqqq",555,ProductTypeEnum.fish,666,44));
                    break;
                case 4:
                    System.out.println("Хотелось бы, чтобы это работало, но нет");
                    shop.updateProduct(new ProductAtShop("rrrrr",777,ProductTypeEnum.liquid,665,23231),76);
            }
            outputForSeller();
            System.out.print("Введите число: ");
            choose = in.nextInt();

        }
    }

    private static void outputForBuyer() {
        System.out.println("1. Вывести все продукты");
        System.out.println("2. Поиск по имени");
        System.out.println("3. Покупка по id");
        System.out.println("Завершить работу - любое другое число");
    }
    private static void outputForSeller() {
        System.out.println("1. Вывести все продукты");
        System.out.println("2. Поиск по id");
        System.out.println("3. Добавление продукта");
        System.out.println("4. Изменение продукта");
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
        Scanner sc=new Scanner(System.in);
        int start= sc.nextInt();
        switch (start) {
            case 1:
            inputForBuyer(shop);
            break;
            case  2:
                inputForSeller(shop);
                break;
        }
//        inputForSeller(shop);
    }
}
