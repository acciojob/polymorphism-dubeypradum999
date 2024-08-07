package com.driver;

public class Main {


    public static class product{

        public int product(int x , iny y){
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y){
            return x*y;
        }



    }
   public static void main(String args[]){

        Product p = new Product();
        p.product(x:2 , y:3);
        p.product(x:2, y:6, z:8);
        p.product(x:3.0 , y:5.0);

   }

}