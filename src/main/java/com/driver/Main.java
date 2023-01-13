package com.driver;

public class Main {

    public static void main(String[] args) {

        Product p = new Product();
        p.product(10,20);
        System.out.println(p.product(10,20));
        p.product(10,20,30);
        System.out.println(p.product(10,20,30));
        p.product(10.5,20.5);
        System.out.println(p.product(10.5,20.5));
    }

    public static class Product{

        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }

    }
}