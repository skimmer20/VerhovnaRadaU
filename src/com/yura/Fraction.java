package com.yura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {
    private String nameFraction;
    private List<Deputat> deputatList = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

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
        System.out.println("habarnyk?");
        boolean habarnyk = scanner.nextBoolean();
        System.out.println("havarValue");
        int havarValue = scanner.nextInt();
        System.out.println("weight");
        double weight = scanner.nextInt();
        System.out.println("height");
        double height = scanner.nextInt();
        System.out.println();
        deputatList.add(new Deputat(weight, height, name, lastName, age, habarnyk, havarValue));
    }

        //видалити депутата
        public void removeDeputat() throws MyEmptyListException {
            System.out.println("Which deputat should be removed? (lastName)");
            String lastName = scanner.nextLine();
                deputatList.removeIf(deputat -> deputat.getLastName().equals(lastName));
            //    if (deputatList.equals(lastName))

        }
        //видалити хабарника
        public void removeHabarnykiv(){
             for (Deputat deputats: deputatList) {
                 if (deputats.getHavarValue() > 0){
                     deputatList.remove(deputats);
                 }
             }
        }

        //найбільший хабарник
        public void getMaxHabarnyk(){
                 Deputat maxValue = Collections.max(deputatList,
                         Comparator.comparing(Deputat::getHavarValue));
             System.out.println("The most habarnyk is " + maxValue.getLastName());
         }

        //показати всіх депутатів
        public void getAllDeputats(){
         deputatList.forEach(System.out::println);
        }
        //видалити всіх
        public void removeAll(){
            deputatList.removeAll(deputatList);
            System.out.println("Rada is empty");
        }

        //загальна сума хабарів для фракції
        /*public void habarSum(){
            Deputat sumHabar = Collections.;
        }*/

}
