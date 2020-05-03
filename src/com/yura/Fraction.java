package com.yura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
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
        System.out.println("weight");
        double weight = scanner.nextInt();
        System.out.println("height");
        double height = scanner.nextInt();
        System.out.println();
        deputatList.add(new Deputat(weight, height, name, lastName, age, habarnyk));
    }

    //видалити депутата
    public void removeDeputat() {
        System.out.println("Which deputat should be removed? (FirstName)");
        String firstName = scanner.nextLine();
        System.out.println("LastName");
        String lastName = scanner.nextLine();
        deputatList.removeIf(deputat -> deputat.getLastName().equals(firstName)
                && deputat.getLastName().equals(lastName));
    }

    //дати хабаря
    public void giveHabarToDeputat() {
        System.out.println("Give a habar (Enter FirstName)");
        String firstName = scanner.nextLine();
        System.out.println("LastName");
        String lastName = scanner.nextLine();
        System.out.println("Sum");
        for (Deputat deputat : deputatList) {
            if (deputat.getName().equals(firstName) && deputat.getLastName().equals(lastName)) {
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
                }
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    //найбільший хабарник
    public void getMaxHabarnyk() {
        try {
            Deputat deputat = Collections.max(deputatList,
                    Comparator.comparing(Deputat::getHavarValue));
            if (deputat.isHabarnyk()){
                System.out.println("The biggest habarnyk is " + deputat.getName() + " " + deputat.getLastName());
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    //видалити хабарника
    public void removeHabarnykiv() {
        try {
            for (Deputat deputat : deputatList) {
                if (deputat.getHavarValue() > 0 || deputat.isHabarnyk()) {
                    deputatList.remove(deputat);
                }
            }
        } catch (ConcurrentModificationException e) {
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
