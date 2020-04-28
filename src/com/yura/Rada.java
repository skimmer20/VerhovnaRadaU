package com.yura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Rada {

    private List<Fraction> fractionList = new ArrayList<>();

    //створити фракцію
    public void addFruction(){
        System.out.println("Name of fraction to ADD?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        fractionList.add(new Fraction(name));
    }

    //видалити фракцію
    public void removeFraction(){
        System.out.println("Name of fraction to DEL?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        fractionList.removeIf(fraction -> fraction.getNameFraction().equals(name));
    }

    //показати всі фракції
    public void getAllFractions(){
        fractionList.forEach(System.out::println);
    }

    //вивести конкректну фракцію
    public void getFractionName(){
        System.out.println("Which fraction would you like to see?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        fractionList.forEach(fraction -> fraction.getNameFraction().equals(name));
    }

    //додати депутата до фракції
    public void addDeputatIntoFraction(){
        System.out.println("Add deputat to Fraction");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.addDeputat();
            }
        }
    }

    //видалити депутата з фракції
    public void removeDeputatFromFraction() throws MyEmptyListException{
        System.out.println("Delete deputat from Fraction");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Fraction fraction : fractionList) {
            if (fraction.getNameFraction().equals(name)) {
                fraction.removeDeputat();
            }
        }
    }




}
