/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastack;

import java.util.LinkedList;
import java.util.ListIterator;
/**
 *
 * @author Nadhif Nizar
 */
public class LinkedStack {
    private LinkedList<Employee> stack;

    public LinkedStack(){
        stack = new LinkedList<Employee>();
    }

    public void push (Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public void printStack(){
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

