package com.hakerrank.DataStructures.JavaGenerics;

class Printer
{
    public <T> void printArray(T[] array){
        for(T tmp : array){
            System.out.println(tmp);
        }
    }

}