package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int j = index + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        String temp = array[j];
                        array[j] = array[index];
                        array[index] = temp;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
            return array;
        }
    }
