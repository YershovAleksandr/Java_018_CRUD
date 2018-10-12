package com.nam;

import com.nam.crud.Application;

public class Main {

    public static void main(String[] args) {
	// write your code here

        drawStars(50);

        System.out.println("Hello CRUD");

        drawStars(50);

        //System.out.println("Please Enter what you want to do...");

        Application app = new Application();

        app.run();

    }

    public static void drawStars(int count){
        //System.out.println("");
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
