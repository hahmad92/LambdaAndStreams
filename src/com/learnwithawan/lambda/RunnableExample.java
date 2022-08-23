package com.learnwithawan.lambda;

import sun.awt.windows.ThemeReader;

public class RunnableExample {

    public static void main(String[] args) {
        runnableWithAnonymousInnerClass();
    }

    public static final void runnableWithAnonymousInnerClass(){

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Yo! bro I am a runnable but also AnonymousInnerClass");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread lambdaThread = new Thread(()-> System.out.println("Yo! bro I am a runnable but created using lambda"));
        lambdaThread.run();

    }
}
