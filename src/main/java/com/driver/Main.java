package com.driver;

public class Main {
    public static class Product {
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

    public static void main(String[] args) {
        Product p = new Product();

        System.out.println("Product of 2 and 3: " + p.product(2, 3));              // Output: 6
        System.out.println("Product of 2, 3, and 4: " + p.product(2, 3, 4));       // Output: 24
        System.out.println("Product of 2.5 and 3.5: " + p.product(2.5, 3.5));      // Output: 8.75
    }
}
