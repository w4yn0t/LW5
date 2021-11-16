package com.company;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        String s = "ABCDEFGH";
        char c = (char)(65 + (int)(Math.random()*26));
        if (s.indexOf(c) >= 0) {
            System.out.println("Ok");
        }
        //2
        Scanner in1 = new Scanner(System.in);
        float x1, x2;
        x1 = in1.nextFloat();
        x2 = in1.nextFloat();
        int k = (int)x1;
        x1 -= k;
        k = (int)x2;
        x2 -=k;
        x1 *= 1000;
        x2 *= 1000;
        if (x1 > x2) {
            System.out.println("x1 > x2");
        }
        else if (x1 == x2) {
            System.out.println("x1 == x2");
        }
        else if (x1 < x2) {
            System.out.println("x1 < x2");
        }
        //3
        Scanner in2 = new Scanner(System.in);
        String str;
        int p1, p2;
        String f;
        String array = ">, <, >=, <=, ==";
        while (true) {
            str = in2.nextLine();
            if (Objects.equals(str, "exit")) return;
            if (str.length() == 5) {
                p1 = Integer.parseInt(str.substring(0, 1));
                f = str.substring(2, 3);
                p2 = Integer.parseInt(str.substring(4, 5));
            } else {
                p1 = Integer.parseInt(str.substring(0, 1));
                f = str.substring(2, 4);
                p2 = Integer.parseInt(str.substring(5, 6));
            }
            if (array.contains(f)) {
                if (f.equals(">")) {
                    if (p1 > p2) System.out.println("YES");
                    else System.out.println("NO");
                } else if (f.equals("<")) {
                    if (p1 < p2) System.out.println("YES");
                    else System.out.println("NO");
                } else if (f.equals(">=")) {
                    if (p1 >= p2) System.out.println("YES");
                    else System.out.println("NO");
                } else if (f.equals("<=")) {
                    if (p1 <= p2) System.out.println("YES");
                    else System.out.println("NO");
                } else if (f.equals("==")) {
                    if (p1 == p2) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }
    }
}
