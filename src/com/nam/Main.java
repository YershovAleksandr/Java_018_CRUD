package com.nam;

public class Main {

    public static void main(String[] args) {
	// write your code here

        drawStars(50);

        System.out.println("Hello CRUD");

        drawStars(50);

        System.out.println("Please Enter what you want to do...");

        try {
            int i = System.in.read();
        } catch (Exception e){
            System.err.println("Error!");
            e.printStackTrace();
        }


    }

    public static void drawStars(int count){
        //System.out.println("");
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
