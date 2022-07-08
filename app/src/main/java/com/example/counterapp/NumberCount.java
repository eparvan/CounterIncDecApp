package com.example.counterapp;

public class NumberCount {
     Integer count;

    NumberCount(Integer count){
        this.count=count;
    }
    NumberCount(){
        this.count = 0;
    }
    String displayIncrement(){
        count++;
        return count.toString();
    }
    String displayDecrement(){
        count--;
        return count.toString();
    }
    String displayInfo(){
        return count.toString();
    }
}
