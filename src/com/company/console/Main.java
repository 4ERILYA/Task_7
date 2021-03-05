package com.company.console;

import com.company.MainForm;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static int locationMax(int[] arr) {
        int maximum = 0;
        int iMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maximum <= arr[i]) {
                maximum = arr[i];
                iMax = i;
            }
        }
        return iMax;
    }


    public static int solution(int[] arr, int n) {
        int c = 0;
        int indexN = 0;
        int indexM = locationMax(arr);

        for (int i = 0; i < arr.length && c < n; i++) {
            if (arr[i] % 2 == 0) {
                indexN = i;
                c++;
            }
        }
        if (indexN == indexM || indexN == indexM - 1 || indexN == indexM + 1 || indexN < n) {
            return -1;
        }

        int minimum = Integer.MAX_VALUE;
        int indexMinimum = 0;

        if (indexN < indexM) {
            int temp = indexM;
            indexM = indexN + 1;
            indexN = temp;
        }
        for (int i = indexM; i < indexN; i++) {
            if (arr[i] < minimum) {
                indexMinimum = i;
                minimum = arr[i];
            }
        }
        return indexMinimum;
    }

    private static void fillArray(int size, int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
    }

    private static int readInteger(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Write %s", phrase);
        return scanner.nextInt();
    }


    public static void main(String[] args) {
        if (args[0].equals("GUI")) {
            MainForm mainForm = new MainForm();
        }
        Locale.setDefault(Locale.ROOT);

        if (args[0].equals("CLI")) {

            try {
                int n = readInteger("n ");
                int l = readInteger("size array ");
                System.out.println("elements array ");
                int[] mainArr = new int[l];
                if (l > 0) {
                    mainArr = new int[l];
                } else {
                    System.out.println("Write true size ");
                }
                fillArray(l, mainArr);
                if (n >= 1 && n % 2 == 0) {
                    System.out.println(solution(mainArr, n));
                } else {
                    System.out.print("Your n contradicts the condition");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid character entered.");
            }
        }
    }
}
