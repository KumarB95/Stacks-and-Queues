package com.bridgelabz;

import org.junit.jupiter.api.Test;

import java.util.Queue;

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
    @Test
    public void given3NumbersCreatingStackAndPeakAndPopTillStackGetsEmpty(){
        System.out.println("Welcome to stack and queue program");
        StackQueue stackQueue=new StackQueue();
        stackQueue.push(70);
        stackQueue.push(30);
        stackQueue.push(56);
        stackQueue.print();
        stackQueue.peek();
        stackQueue.push(34);
        stackQueue.print();
        stackQueue.peek();
        stackQueue.pop();
        stackQueue.print();
    }
    @Test
    public void given3NumbersEnqueueAndDequeue(){
        System.out.println("Welcome to queue program");
        Queue queue=new Queue();
        queue.enque(15);
        queue.enque(16);
        queue.enque(17);
        queue.print();
        queue.dequeue();
        queue.print();
    }
}
