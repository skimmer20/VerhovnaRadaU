package com.yura;

import java.util.Scanner;

public class Deputat extends Human {
    private String firstName;
    private String lastName;
    private int age;
    private boolean habarnyk;
    private int habarValue;

    public Deputat() {
        super();
    }

    public Deputat(double weight, double height, String firstName, String lastName, int age, boolean habarnyk) {
        super(weight, height);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.habarnyk = habarnyk;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
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

    boolean isHabarnyk() {
        return habarnyk;
    }

    public void setHabarnyk(boolean habarnyk) {
        this.habarnyk = habarnyk;
    }

    int getHavarValue() {
        return habarValue;
    }

    public void setHaBarValue(int havarValue) {
        this.habarValue = havarValue;
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "firstName='" + firstName + '\'' +
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
     void giveHabar() {
        if (!isHabarnyk()) {
            System.out.println("Slava Ukraine");
        } else {
            int sum = new Scanner(System.in).nextInt();
            if (sum >= 10000) {
                System.out.println("Go to jail!");
            } else {
                habarValue += sum;
                System.out.println(habarValue);
            }
        }
    }
}
