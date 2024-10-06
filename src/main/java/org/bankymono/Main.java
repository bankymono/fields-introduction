package org.bankymono;

public class Main {
    public static class Movie extends Product {
        public static final double MINIMUM_PRICE = 10.99;
        private boolean isReleased;
        private Category category;
        private double actualPrice;

        public Movie(String name, int year, double price, boolean isReleased, Category category){
            super(name,year);
            this.isReleased = isReleased;
            this.category = category;
            this.actualPrice = Math.max(price, MINIMUM_PRICE);
        }

    }

    public static class Product {
        protected String name;
        protected int year;
        protected double actualPrice;

        public Product(String name, int year){
            this.name = name;
            this.year = year;
        }
    }

    public enum Category {
        ADVENTURE,ACTION,COMEDY
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}