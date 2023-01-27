/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastack;

/**
 *
 * @author Nadhif Nizar
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {32,33,-17,9,57,3,-22,21,30,-54,75,60,14,-65};

        if(liniearSearch(intArray,-54) == -1){
            System.out.println("Data tidak ditemukan");
        } else{
            System.out.println("Data ditemukan pada index ke " + liniearSearch(intArray, -54));
        }

    }

    public static int liniearSearch(int[] input, int value){
        for(int i=0; i < input.length; i++){
            if(input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

