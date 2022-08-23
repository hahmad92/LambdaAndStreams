package com.learnwithawan.lambda;

import com.learnwithawan.problems.Greeting;
import com.learnwithawan.problems.HelloWorldGreeting;


public class LambdaGreeting {
    public static void main(String[] args) {

        //Interface impl
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        helloWorldGreeting.perform();


        //Lambda Expression
        Greeting greeting = () -> System.out.println("Hello My Friend!");
        greeting.perform();

        //Inner Class
        Greeting greeting1 = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello My Friend from Inner class!");
            }
        };

        greeting1 .perform();

    }
}
