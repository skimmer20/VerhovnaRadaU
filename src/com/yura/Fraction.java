package com.yura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Fraction {
    private String nameFraction;
    private static List<Deputat> deputatList = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public Fraction() {
    }

    public Fraction(String nameFraction) {
        this.nameFraction = nameFraction;
    }

    public String getNameFraction() {
        return nameFraction;
    }

    public void setNameFraction(String nameFraction) {
        this.nameFraction = nameFraction;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "deputatList=" + deputatList +
                '}';
    }

    //додати депутата
    public void addDeputat() {
        System.out.println("Name");
        String name = scanner.nextLine();
        System.out.println("lastName");
        String lastName = scanner.nextLine();
        System.out.println("age");
        int age = scanner.nextInt();
        System.out.println("habarnyk? - Enter true or false!");
        boolean habarnyk = scanner.nextBoolean();
//        if (habarnyk) {
//            Deputat deputat = new Deputat();
//            deputat.giveHabar();
//        }
        System.out.println("weight");
        double weight = scanner.nextInt();
        System.out.println("height");
        double height = scanner.nextInt();
        System.out.println();
        //Deputat deputat = new Deputat();
        deputatList.add(new Deputat(weight, height, name, lastName, age, habarnyk));
    }

    //видалити депутата
    public void removeDeputat() {
        System.out.println("Which deputat should be removed? (lastName)");
        String lastName = scanner.nextLine();
        try {
            deputatList.removeIf(deputat -> deputat.getLastName().equals(lastName));
        } catch (NoSuchElementException e) {
            System.out.println("There is no such Deputat");
        }
    }

    //дати хабаря
    public void giveHabarToDeputat() {
        System.out.println("Give a habar (lastName)");
        String lastName = scanner.nextLine();
        for (Deputat deputat : deputatList) {
            if (deputat.getLastName().equals(lastName)) {
                deputat.giveHabar();
            }
        }
    }

    //показати хабарника
    public void getHabarnyk() {
        try {
            for (Deputat deputat : deputatList) {
                if (deputat.isHabarnyk()) {
                    System.out.println(deputat);
                    getAllDeputats();
                }
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    //найбільший хабарник
    public void getMaxHabarnyk() {
        try {
            Deputat maxValue = Collections.max(deputatList,
                    Comparator.comparing(Deputat::getHavarValue));
            System.out.println("The biggest habarnyk is " + maxValue.getLastName());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    //видалити хабарника
    public void removeHabarnykiv() {
        try {
            for (Deputat deputat : deputatList) {
                if (deputat.getHavarValue() > 0) {
                    deputatList.remove(deputat);
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("There is no habarnyk");
        }
    }

    //показати всіх депутатів
    public void getAllDeputats() {
        try {
            deputatList.forEach(System.out::println);
        } catch (NoSuchElementException e) {
            System.out.println("List is empty");
        }
    }

    //видалити всіх
    public void removeAllDeputats() {
        for (Deputat deputat : deputatList) {
            if (deputatList.contains(deputat)) {
                deputatList.removeAll(deputatList);
            }
        }
        System.out.println("Rada is empty");
    }
}
