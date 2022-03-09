package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GenerateNumber {

    public static void main(String[] args) {
        int[] array = new int[30];
        int index = 0;
        while (index!=array.length) {
            int number = (int) Math.floor(Math.random() * (30) + 1);
            if (isValid(array, index, number))
                array[index++] = number;
        }

        System.out.println(Arrays.toString(array));
    }

    public static boolean isValid(int[] array, int index, int number) {
        for (int i = 0; i < index; i++)
            if (array[i] == number)
                return false;

        return true;
    }

}
