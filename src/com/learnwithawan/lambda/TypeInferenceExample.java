package com.learnwithawan.lambda;

public class TypeInferenceExample {

    public static void main(String[] args) {
        StringLengthLambda myLambda = s -> s.length();

        System.out.println("String length of 'Hammad' is : "+ myLambda.getLength("hammad"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }


}
