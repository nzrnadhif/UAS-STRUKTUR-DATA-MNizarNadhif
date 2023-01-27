/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastack;

/**
 *
 * @author Nadhif Nizar
 */
public class BinarySearch {
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element Ditemukan Pada Index Ke : " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element Tidak Ditemukan!");
        }
    }
    public static void main(String args[]){
        int arr[] = {11,22,33,44,55};
        int key = 22;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }
}  

