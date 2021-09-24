package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] fractionalNumbers = {0.53, -1.2, 2.23, 2.31, 9.6, -4.21, 0.43, 3.2, -5.32, -4.52, 1.4, 7.63, 10.1, -2.7, 6.1};
        double result = 0;
        int i = 0;
        boolean negetive = false;
        for (double a : fractionalNumbers) {
            if (a > 0 && negetive) {
                result += a;
                i++;
                System.out.println(a);
            } else {
                negetive = true;
                continue;
            }
        }

        System.out.println(result / i);
        System.out.println("-----------------------------------------------------------------------------------------");
        sort(fractionalNumbers);
    }

    public static void sort(double[] a) {
        int size = a.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    double c = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = c;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
