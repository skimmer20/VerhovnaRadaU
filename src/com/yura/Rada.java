package com.yura;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Rada {

    private static List<Fraction> fractionList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    Rada() {
    }

    //створити фракцію
    void addFruction() {
        System.out.println("Name of fraction to ADD?");
        String name = scanner.nextLine();
        fractionList.add(new Fraction(name));
    }

    //видалити фракцію
    void removeFraction() {
        System.out.println("Name of fraction to DEL?");
        String name = scanner.nextLine();
        try {
            fractionList.removeIf(fraction -> fraction.getNameFraction().equals(name));
        }catch (NoSuchElementException e){
            System.out.println("Такої фракції не існує.");
        }
    }

    //показати всі фракції
    void getAllFractions() {
        for (Fraction fraction : fractionList){
            System.out.println(fraction.getNameFraction());
        }
    }

    //вивести конкректну фракцію
    void getFractionName() {
        System.out.println("Which fraction would you like to see?");
        String name = scanner.nextLine();
        //fractionList.forEach(fraction -> fraction.getNameFraction().equals(name));
        for (Fraction fraction: fractionList){
            if (fraction.getNameFraction().equals(name)){
                fraction.getAllDeputats();
            }
        }
    }

    //додати депутата до фракції
    void addDeputatIntoFraction() {
        System.out.println("Add deputat to Fraction. Enter name of Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.addDeputat();
            }
        }
    }

    //видалити депутата з фракції
    void removeDeputatFromFraction() {
        System.out.println("Delete deputat from Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.removeDeputat();
            }
            throw new IllegalStateException();
        }
    }

    //дати хабаря депутату
    void giveHabarToDeputat() {
        System.out.println("Give a habar to Deputat from Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.giveHabarToDeputat();
            }
        }
    }

    //показати хабарників фракції
    void getHabarnykInFraction() {
        System.out.println("Show habarnykiv in Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.getHabarnyk();
            }
        }
    }

    //показати найбільшого хабарника у фракції
    void getMaxHabarnykInFraction() {
        System.out.println("Get the biggest habarnyk from Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.getMaxHabarnyk();
            }
        }
    }

    //показати найбільшого хабарника у Раді
    void getMaxHabarnykInRada() {
        for (Fraction fraction : fractionList) {
            fraction.getMaxHabarnyk();
        }
    }

    //видалити хабарника з фракції
    void removeMaxHabarnyk() {
        System.out.println("Remove the biggest habarnyk from Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.removeHabarnykiv();
            }
        }
    }

    //видалити всіх депутатів з фракції
    void removeAllDeputatsFromFraction() {
        System.out.println("Remove all deputats from Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.removeAllDeputats();
            }
        }
    }
}
