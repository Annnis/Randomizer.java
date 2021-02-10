//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int res = start(5);
//        System.out.println(res);
//
//    }
//    public static int start(int attempts) {
//        Scanner inputNumber = new Scanner(System.in);
//        int min = 1;
//        int max = 100;
//        int secretNumber = min + (int) (Math.random() * max);
//        System.out.println(secretNumber);
//        System.out.println(String.format("Привет, я загадал число от %s до %s. Попробуй угадать его за %s попыток!", min, max, attempts));
//        int guessNumber = 0;
//        boolean isLock = true;
//        int difference = 0;
//
//        do {
//            System.out.println(String.format("Введите число от %s до %s", min, max));
//            if (inputNumber.hasNextInt()) {
//                guessNumber = inputNumber.nextInt();
//                if (guessNumber < 1 || guessNumber > 100) {
//                    System.out.println("Введите правильное число");
//                } else if (guessNumber == secretNumber) {
//                    System.out.println(String.format("Поздравляю! Ты угадал задуманное число за %s попыток", attempts));
//                    break;
//                } else if (isLock) {
//                    difference = Math.abs(secretNumber - guessNumber);
//                    System.out.println(String.format("Не угадал!!! Осталось %s попыток", --attempts));
//                    isLock = false;
//                } else {
//                    if (Math.abs(secretNumber - guessNumber) < difference) {
//                        System.out.println(String.format("Не угадал, но теплее!!! Осталось %s попыток", --attempts));
//                    } else {
//                        System.out.println(String.format("Не угадал, но холоднее!!! Осталось %s попыток", --attempts));
//                    }
//                }
//            }
//        } while (attempts > 0);
//        System.out.println("спробуй ще");
////        System.out.println("Введите число");
//        return min;
//    }
//}
