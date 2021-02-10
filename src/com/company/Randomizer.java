//package com.company;
//import java.util.Scanner;
//
//public class Randomizer {
//    public int min, max;
//    public Scanner scanner;
//    public String login;
//    public int[] array;
//
//    public Randomizer() {
//        this.login = login;
//        this.scanner = new Scanner(System.in);
//    }
//
//    public void start() {
//        greeting();
//        setMinMax();
//
//        boolean isRunning = true;
//
//        int[] array = new int[max - min + 1]; // [0, 0, 0, 0, 0] // 1 - 5
////        for (int i = 0; i < array.length; i++) {
////
////        }
//        int index = 0;
//        while (isRunning) {
//            System.out.println("now choose command: generate, help or exit");
//            String command = scanner.next();
//            if (command.equals("generate")) {
//                int randomNumber = min + (int) (Math.random() * max); // 1, 4, 5, 3, 4
//               reset();
//               setMinMax();
//                array[index++] = randomNumber; // [1, 4, 5, 3, 0]
//                System.out.println("random number = " + randomNumber);
////                }
//            } else if (command.equals("exit")) {
//                System.out.println("Bye bye!");
//                isRunning = false;
////                System.exit(0);
//            } else if (command.equals("help")) {
//                System.out.println("cmd generate - generating random number");
//                System.out.println("cmd exit - quit application");
//            } else if (command.equals("switch")) {
//                setMinMax();
//            } else {
//                System.out.println("wrong command was entered, make one more try");
//            }
//        }
//        System.out.println("вышли с цикла");
//    }
//
//    private void greeting() {
//        System.out.println("HELLO " + login);
//    }
//
//    private void setMinMax() {
//        System.out.println("Enter min:");
//        min = scanner.nextInt(); // 1
//        System.out.println("Enter max:");
//        max = scanner.nextInt(); // 10
//        System.out.println("min = " + min + "; max = " + max);
//    }
//    public void reset() {
//        int uniqueNumbers = 0;
//    }
//    public void generateRandomNumber(){
//        randomNumber = min + (int)(Math.random() * (max - min + 1));
//    }
//    public boolean isUniqueRandomNumber() {
//        boolean isUnique = true;
//        for (int arraySecond : array) {
//            if (randomNumber == arraySecond) {
//                return false;
//            }
//        }
//    }
//