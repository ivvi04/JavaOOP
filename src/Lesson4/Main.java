package Lesson4;

import Lesson4.Classes.*;
import Lesson4.Classes.Box;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Box<String> stringBox = new Box<>(); // недопустимо
        Box<Fruit> fruitBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> anotherOrangeBox = new Box();
        Box<Apple> appleBox = new Box<>();
        Box<GoldenApple> goldenAppleBox = new Box<>();

        orangeBox.add(new Orange(1));
        //orangeBox.add(new Apple(1));  // недопустимо
        //orangeBox.add(new GoldenApple(1));  // недопустимо
        System.out.println("orangeBox = " + orangeBox.getWeight()); // 1

        appleBox.add(new Apple(1));
        appleBox.add(new GoldenApple(1));
        System.out.println("appleBox = " + appleBox.getWeight()); // 2

        //goldenAppleBox.add(new Apple(1)); // недопустимо
        goldenAppleBox.add(new GoldenApple(1));

        orangeBox.moveTo(anotherOrangeBox);
        //orangeBox.moveTo(appleBox); // недопустимо
        System.out.println("anotherOrangeBox = " + anotherOrangeBox.getWeight()); // 1
        System.out.println("orangeBox = " + orangeBox.getWeight()); // 0

        //appleBox.moveTo(goldenAppleBox); // недопустимо
        goldenAppleBox.moveTo(appleBox);
        System.out.println("goldenAppleBox = " + goldenAppleBox.getWeight()); // 0
        System.out.println("appleBox = " + appleBox.getWeight()); // 3

        appleBox.moveTo(fruitBox);
        //fruitBox.moveTo(goldenAppleBox); // недопустимо
        System.out.println("fruitBox = " + fruitBox.getWeight()); // 3
    }
}