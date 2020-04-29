package com.yura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rada {

    private List<Fraction> fractionList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Rada() {
    }

    //створити фракцію
    public void addFruction() {
        System.out.println("Name of fraction to ADD?");
        String name = scanner.nextLine();
        fractionList.add(new Fraction(name));
    }

    //видалити фракцію
    public void removeFraction() {
        System.out.println("Name of fraction to DEL?");
        String name = scanner.nextLine();
        fractionList.removeIf(fraction -> fraction.getNameFraction().equals(name));
    }

    //показати всі фракції
    public void getAllFractions() {
        fractionList.forEach(System.out::println);
    }

    //вивести конкректну фракцію
    public void getFractionName() {
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
    public void addDeputatIntoFraction() {
        System.out.println("Add deputat to Fraction. ");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.addDeputat();
            }
        }
    }

    //видалити депутата з фракції
    public void removeDeputatFromFraction() throws MyEmptyListException {
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
    public void giveHabarToDeputat() {
        System.out.println("Give a habar to Deputat from Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.giveHabarToDeputat();
            }
        }
    }

    //показати хабарників фракції
    public void getHabarnykInFraction() {
        System.out.println("Show habarnykiv in Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.getHabarnyk();
            }
        }
    }

    //показати найбільшого хабарника у фракції
    public void getMaxHabarnykInFraction() {
        System.out.println("Get the biggest habarnyk from Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.getMaxHabarnyk();
            }
        }
    }

    //показати найбільшого хабарника у Раді
    public void getMaxHabarnykInRada() {
        for (Fraction fraction : fractionList) {
            fraction.getMaxHabarnyk();
        }
    }

    //видалити хабарника з фракції
    public void removeMaxHabarnyk() {
        System.out.println("Remove the biggest habarnyk from Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.removeHabarnykiv();
            }
        }
    }

    //видалити всіх депутатів з фракції
    public void removeAllDeputatsFromFraction() {
        System.out.println("Remove all deputats from Fraction");
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.removeAllDeputats();
            }
        }
    }

}
