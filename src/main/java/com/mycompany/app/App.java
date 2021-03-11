package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

<<<<<<< HEAD
    private final String message = "Hello World from git and jenkins!";
=======
    private final String message = "Hello World from git!";
>>>>>>> d5131d3b6581f9ee96d52d1addd44d9852bcf007

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
