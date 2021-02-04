package com.company;

public class task3 {
    public static void main(String[] args) {
//        int month = 1;
//        if (month <= 5 && month >= 3) {
//            System.out.println("Весна");
//        } else if (month <= 8 && month >= 6) {
//           System.out.println("Лето");
//        } else if (month <= 11 && month >= 9) {
//            System.out.println("Осень");
//       }else
//            System.out.println("Зима");
//
//        System.out.println();


        int month = 11;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Значение неверно");
        }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 9; i < array.length && i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();

        int[][] squareArray = new int[2][3];
        squareArray[0][0] = 2;
        squareArray[0][1] = 4;
        squareArray[0][2] = 6;
        squareArray[1][0] = 3;
        squareArray[1][1] = 5;
        squareArray[1][2] = 7;
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + " ");
                System.out.print("[" + i + "]" + "[" + j + "]  ");
            }
            System.out.println();

        }
    }
}
