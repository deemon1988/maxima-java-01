package org.example;

public class App {
    static int[] arr = {35, 15, 12, 3, 36, 44, 3, 53, 7, 8, 16, 35};
    static int[] arrNums = new int[arr.length];

    public static void main(String[] args) {
        System.out.println("Максимальный индекс " + maxDigitsSumPosition(arr));
    }

    public static byte maxDigitsSumPosition(int[] arr) {
        sumOfDigits(arr);

        byte indexMax = 0;
        byte indexMin = 0;
        int maxValue = arrNums[0];
        int minValue = arrNums[0];


        for (int j = 0; j < arrNums.length; j++) {
            int counter = arrNums[j];

            if (maxValue <= counter) {
                maxValue = counter;
                indexMax = (byte) j;                  // максимальный индекс элемента по сумме цифр
            }
        }

        for (int j = 0; j < arrNums.length; j++) {
            int counter = arrNums[j];

            if (minValue > counter) {
                minValue = counter;
                indexMin = (byte) j;
            }
        }
         System.out.println("Минимальный индекс "+indexMin);
        return indexMax;

    }


    public static void sumOfDigits(int [] num) {
        for (int i = 0; i < arr.length; i++) {
            int val = 0;
            int n = num[i];
            while (n != 0) {
                val = val + (n % 10);       //Суммирование цифр числа
                n = n / 10;
                arrNums[i] = val;
            }
            //System.out.println(val + " сумма цифр");
        }
    }
}
