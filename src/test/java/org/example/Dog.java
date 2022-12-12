package org.example;

public class Dog {
    String dogName ;
    String dogColor;
    int dogWeight;
public Dog(String dogName, String dogColor, int dogWeight){
    this.dogName = dogName;
    this.dogColor = dogColor;
    this.dogWeight = dogWeight;
}
    public String barking(){
        return "Гав-Гав!";
    }
}