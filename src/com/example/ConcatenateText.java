package com.example;

public class ConcatenateText {
    public static void main(String[] args) {
        String[] names = {"Fredy", "Jose", "John"};
        String concanateText = "";

        for(String name: names) {
           concanateText = concanateText.concat(name + " ");
        }

        System.out.println(concanateText);
    }
}
