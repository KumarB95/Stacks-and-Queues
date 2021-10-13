package com.bridgelabz;

import org.junit.jupiter.api.Test;

public class MyStackAndQueueTest {
    @Test
    public void given3NumbersCreatingStack(){
        System.out.println("Welcome to stack and queue program");
        StackQueue stackQueue=new StackQueue();
        stackQueue.push(70);
        stackQueue.push(30);
        stackQueue.push(56);
        stackQueue.print();
    }
}
