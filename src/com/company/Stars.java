package com.company;

public class Stars {

    public static void main(String[] args) {
        Quadrate();
        System.out.println("---------------------");
        HollowSquare();
        System.out.println("---------------------");
        BaseOfTriangle_i_0_j_0();
        System.out.println("---------------------");
        BaseOfTriangle_i_7_j_1();
        System.out.println("---------------------");
        BaseOfTriangle_i_7_j_7();
        System.out.println("---------------------");
        BaseOfTriangle_i_1_j_7();
        System.out.println("---------------------");
        peopleX();
        System.out.println("---------------------");
        pointerDown();
        System.out.println("---------------------");
        pointerUp();
//        System.out.println("---------------------");


    }

    public static void Quadrate() {
        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {
                if (j < 6) {

                    System.out.print(" * ");
                } else {
                    System.out.print(" *");
                    System.out.println();
                }


            }
        }
    }


    public static void HollowSquare() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6 || j == 0 || j == 6) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void BaseOfTriangle_i_0_j_0() {
        int hypotenuse = 6;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || j == 0 || j == hypotenuse) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            hypotenuse--;

        }
    }

    public static void BaseOfTriangle_i_7_j_1() {
        int hypotenuse = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 6 || j == 0 || j == hypotenuse) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            hypotenuse++;

        }
    }

    public static void BaseOfTriangle_i_7_j_7() {
        int hypotenuse = 6;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 6 || j == 6 || j == hypotenuse) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            hypotenuse--;

        }
    }


    public static void BaseOfTriangle_i_1_j_7() {
        int hypotenuse = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || j == 6 || j == hypotenuse) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            hypotenuse++;

        }
    }

    public static void peopleX() {
        int loss = 0;
        int Poss = 6;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == loss || j == Poss) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            loss++;
            Poss--;

        }
    }

    public static void pointerDown() {
        int loss = 0;
        int Poss = 6;
        int centr = 4;
        for (int i = 0; i < centr; i++) {
            for (int j = 0; j < 7; j++) {
                if (i==0 || j == loss || j == Poss) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            loss++;
            Poss--;

        }
    }

    public static void pointerUp() {
        int loss = 3;
        int Poss = 3;
        int center = 3;

        for (int i = 3; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i==6 || j == loss&&i== center||j ==Poss || j==loss) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            loss--;
            Poss++;


        }
    }
}
















