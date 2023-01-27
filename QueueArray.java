/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastack;
import java.util.NoSuchElementException;
/**
 *
 * @author Nadhif Nizar
 */
public class QueueArray {
     private Employee[] queue;
    private int front;
    private int rear;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void enqueue(Employee employee){
        if(rear == queue.length){
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }
        queue[rear] = employee;
        rear++;
    }

    public Employee dequeue(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if(size() == 0){
            front = 0;
            rear = 0;
        }
        return employee;
    }

    public Employee peekFront(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }
    public Employee peekRear(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        return queue[rear-1];
    }

    public int size(){
        return rear - front;
    }

    public void printQueue(){
        for(int i = front; i< rear; i++){
            System.out.println(queue[i]);
        }
    }
}

