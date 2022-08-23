package com.learnwithawan.problems;

public class Main{

    public void greet(Greeting greeting) {
        greeting.perform();
    }
    public static void main(String[] args) {
        Main main = new Main();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        main.greet(helloWorldGreeting);
    }
}
