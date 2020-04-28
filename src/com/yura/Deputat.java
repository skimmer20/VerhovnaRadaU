package com.yura;

import java.util.Scanner;

public class Deputat extends Human {
    private String name;
    private String lastName;
    private int age;
    private boolean habarnyk;
    private int havarValue;

    public Deputat() {
        super();
    }

    public Deputat(double weight, double height, String name, String lastName, int age, boolean habarnyk, int havarValue) {
        super(weight, height);
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.habarnyk = habarnyk;
        this.havarValue = havarValue;
        this.getHeight();
        this.getWeight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHabarnyk() {
        return habarnyk;
    }

    public void setHabarnyk(boolean habarnyk) {
        this.habarnyk = habarnyk;
    }

    public int getHavarValue() {
        return havarValue;
    }

    public void setHavarValue(int havarValue) {
        this.havarValue = havarValue;
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", habarnyk=" + habarnyk +
                ", havarValue=" + havarValue +
                " weight " + getWeight() +
                " height " + getHeight() +
                '}';
    }

    /**
     * Method shows Habarykiv
     */
    public void giveHabar() {
        if (!habarnyk) {
            System.out.println("Slava Ukraine");
        }else {
            Scanner scanner = new Scanner(System.in);
            int sum = scanner.nextInt();
            if (sum >= 10000){
                System.out.println("Go to jail!");
            }else {
                havarValue += sum;
            }
        }
    }

}
