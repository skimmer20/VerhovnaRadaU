package com.yura;

import java.util.Scanner;

public class Deputat extends Human {
    private String name;
    private String lastName;
    private int age;
    private boolean habarnyk;
    private int habarValue;

    public Deputat() {
        super();
    }

    public Deputat(double weight, double height, String name, String lastName, int age, boolean habarnyk) {
        super(weight, height);
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.habarnyk = habarnyk;
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
        return habarValue;
    }

    public void setHaBarValue(int havarValue) {
        this.habarValue = havarValue;
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", habarnyk=" + habarnyk +
                ", havarValue=" + habarValue +
                " weight " + getWeight() +
                " height " + getHeight() +
                '}';
    }

    /**
     * Method gets habar
     */
    public boolean giveHabar() {
        if (isHabarnyk()) {
            System.out.println("Slava Ukraine");
        } else {
            Scanner scanner = new Scanner(System.in);
            int sum = scanner.nextInt();
            if (sum >= 10000) {
                System.out.println("Go to jail!");
            } else {
                habarValue += sum;
                System.out.println(habarValue);
            }
        }
        return habarnyk;
    }
}
