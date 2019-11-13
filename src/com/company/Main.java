package com.company;

public class Main {
    public static void helloWorld(){
        System.out.println("Hello world");
    }

    public static void videogame() {
        boolean playbutton = true;
        if (playbutton) {
            System.out.println("game is playing");
        } else {
            System.out.println("game is paused");
        }
    }
        public static void weather () {
            System.out.println("it is snowing");

        }
        public static void main (String[]args){
            System.out.println("\n----------------------\n");
            System.out.println("calls play music");
            helloWorld();
            System.out.println("\n----------------------\n");
            System.out.println("calls play music");
            weather();
            System.out.println("\n----------------------\n");
            System.out.println("calls play music");
            videogame();


        }
}