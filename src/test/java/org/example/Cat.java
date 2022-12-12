package org.example;

public class Cat {
    String catName;
    String catColor;
    int catWeight;

    public Cat(String catName, String catColor){
        this.catName = catName;
        this.catColor = catColor;
        this.catWeight = catWeight;
    }

    public void smallCat(){
        System.out.println("Маленькие кошки говорит: \nМяу!");
    }
    public String bigCat(){
        return "Большие кошки говорят: \nМЯУ!";
    }
}

