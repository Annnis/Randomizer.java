package com.company;
import java.util.Scanner;
import static com.sun.tools.javac.jvm.Code.width;
import java.lang.Math;

public class Math<include> {
   Scanner scanner = new Scanner(System.in);
//    static void task1(){
//        double speed, alpha;
//        speed = scanner.nextInt();
//        alpha = scanner.nextInt();
//        double s = ((speed * speed) / 9.8) * Math.sin(Math.toRadians(2 *alpha));
//
//    }

    void task2()
    {
        float v1,v2,t,s,s1,s2;
        System.out.println("Введите скорости автомобилей, расстояние между ними и время движения: ");
        v1 = scanner.nextInt();
        v2 = scanner.nextInt();
         s = scanner.nextInt();
         t= scanner.nextInt();
        s1 = s + (v1 + v2) * t;
        s2 = java.lang.Math.abs((v1 - v2) * t - s);
       System.out.println(width(4));
        System.out.println(String.format("Расстояние будет равно  %s км или %s км", s1,s2));
    }
    void task3(){
        double x,y;
        System.out.println("Введите точку Х");
        x = scanner.nextInt();
        System.out.println("Введите точку Y");
        y= scanner.nextInt();;
        if(	(x >= 0) && (y >= 1.5 * (x -1) && (y <= x)||(x <= 0) && (y >= -1.5 * x-1) && (y <= -x))){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
