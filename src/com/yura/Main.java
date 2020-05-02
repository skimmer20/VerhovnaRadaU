package com.yura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyEmptyListException {

        while (true) {
            System.out.println("Welcome to Rada! Куди бажаєте перейти? \n" +
                    "1 - Верховна Рада \n" +
                    "2 - Фракція \n" +
                    "3 - Депутат \n" +
                    "4 - Вийти");
            try {
                int menu = new Scanner(System.in).nextInt();

                switch (menu) {

                    case 1:
                        System.out.println(
                                "1 - Створити фракцію \n" +
                                        "2 - Видалити фракцію \n" +
                                        "3 - Показати всі фракції \n" +
                                        "4 - Вивести конкректну фракцію \n" +
                                        "5 - Додати депутата до фракції \n" +
                                        "6 - Видалити депутата з фракції \n" +
                                        "7 - Дати хабаря депутату \n" +
                                        "8 - Показати хабарників фракції \n" +
                                        "9 - Показати найбільшого хабарника у фракції \n" +
                                        "10 - Показати найбільшого хабарника у Раді \n" +
                                        "11 - Видалити хабарника з фракції \n" +
                                        "12 - Видалити всіх депутатів з фракції \n" +
                                        "0 - Вихід з програми");
                        int choose1 = new Scanner(System.in).nextInt();
                        Rada rada = new Rada();
                        switch (choose1) {

                            case 1:
                                rada.addFruction();
                                break;
                            case 2:
                                rada.removeFraction();
                                break;
                            case 3:
                                rada.getAllFractions();
                                break;
                            case 4:
                                rada.getFractionName();
                                break;
                            case 5:
                                rada.addDeputatIntoFraction();
                                break;
                            case 6:
                                rada.removeDeputatFromFraction();
                                break;
                            case 7:
                                rada.giveHabarToDeputat();
                                break;
                            case 8:
                                rada.getHabarnykInFraction();
                                break;
                            case 9:
                                rada.getMaxHabarnykInFraction();
                                break;
                            case 10:
                                rada.getMaxHabarnykInRada();
                                break;
                            case 11:
                                rada.removeMaxHabarnyk();
                                break;
                            case 12:
                                rada.removeAllDeputatsFromFraction();
                                break;
                            case 13:
                                System.out.println("Повернутись в попереднє меню");
                                return;
                            default:
                                System.out.println("Такої функції не існує");
                        }

                        break;
                    case 2:
                        System.out.println(
                                "1 - Додати депутата \n" +
                                        "2 - Видалити депутата \n" +
                                        "3 - Дати хабаря конкретному депутату \n" +
                                        "4 - Показати хабарників \n" +
                                        "5 - Показати найбільшого хабарника \n" +
                                        "6 - Видалити хабарників \n" +
                                        "7 - Показати всіх депутатів \n" +
                                        "0 - Вихід з програми");
                        int choose2 = new Scanner(System.in).nextInt();
                        Fraction fraction = new Fraction();
                        switch (choose2) {
                            case 1:
                                fraction.addDeputat();
                                break;
                            case 2:
                                fraction.removeDeputat();
                                break;
                            case 3:
                                fraction.giveHabarToDeputat();
                                break;
                            case 4:
                                fraction.getHabarnyk();
                                break;
                            case 5:
                                fraction.getMaxHabarnyk();
                                break;
                            case 6:
                                fraction.removeHabarnykiv();
                                break;
                            case 7:
                                fraction.getAllDeputats();
                                break;
                            case 8:
                                fraction.removeAllDeputats();
                                break;
                            case 9:
                                System.out.println("Повернутись в попереднє меню");
                                return;
                            default:
                                System.out.println("Такої функції не існує");
                        }

                        break;
                    case 3:
                        System.out.println("1 - Дати хабар депутату \n" +
                                "2 - Вихід з програми");
                        int choose3 = new Scanner(System.in).nextInt();
                        Deputat deputat = new Deputat();
                        switch (choose3) {
                            case 1:
                                System.out.println("Введіть суму: ");
                                deputat.giveHabar();
                                break;
                            case 2:
                                System.out.println("Повернутись в попереднє меню");
                                return;
                            default:
                                System.out.println("Такої функції не існує");
                        }
                        break;
                    case 4:
                        System.out.println("Ви вийшли з програми");
                        return;
                    default:
                        System.out.println("Wrong value! Enter the number from 1 to 4");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong value! Enter the number from 1 to 4");
            }
        }
    }
}
