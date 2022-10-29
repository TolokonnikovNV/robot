package edu.javacourse.loops;

public class Main {

    public static void main(String[] args) {
        square();
        System.out.println();
        triangle();
        System.out.println();
        rightTriangle();
        System.out.println();
        rhombus();


    }

    public static void square() {
        int count = 11;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0 || i == count - 1 || j == 0 || j == count - 1 || i == j || i == count - j - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void rightTriangle() {
        int count = 11;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == count - 1 || j == count - 1 || i == count - j - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle() {
        int count = 6;
        int base = 11;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < base; j++) {
                //base 7 , count 1
                //base 8, count 2
                //base 9, count 3
                //base 10 count 4
                if (i == count - 1 || i == count - j - 1 || i == j - 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void rhombus() {
        int count = 11;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j - i == 5 || i - j == 5 || i + j == 5 || i + j == 15) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


}

