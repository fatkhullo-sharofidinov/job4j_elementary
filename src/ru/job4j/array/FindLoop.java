package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i =  (data.length - (data.length - start) ); i < (data.length - (data.length - finish) ); i++) {
            if (el == data[i]) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        System.out.println(result);
    }
}
