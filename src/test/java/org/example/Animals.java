package org.example;

import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {
        Dog myDog = new Dog("Clifford", "red", 120);
        System.out.println("Имя cобаки: " + myDog.dogName + "\nЦвет собаки: "  + myDog.dogColor + "\nВес собаки:  " + myDog.dogWeight + " кг");
        System.out.println(myDog.barking());

        Cat myCat = new Cat ("Fluffy", "black");
      System.out.println("Имя кошки: " + myCat.catName + "\nЦвет кошки: "  + myCat.catColor);

        System.out.println("Сколько килограмм весит эта кошка?: ");
        Scanner in = new Scanner(System.in);
        int catWeight = in.nextInt();
        if (catWeight < 7) {
            myCat.smallCat();
        }else{
            System.out.println(myCat.bigCat());
        }
    }
}
