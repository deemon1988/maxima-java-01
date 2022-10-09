package org.example;
public class homework {


    public static void main(String[] args) {

        System.out.println(daysCount((byte) 2, 2000));

    }

    public static byte daysCount(byte month, int year) {
        byte result;
        switch (month) {
            case 1:
                result = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0)  // год кратен 4 и делится на 100 с остатком
                // год высокосный

                {
                    result = 29;                             // год не кратен 4

                } else {
                    if (year % 4 == 0 && year % 100 == 0) {       // год кратен 4 делится на 100 без остатка
                        result = 29;
                    } else {
                        result = 28;
                    }
                }

                break;
            // Отсюда следует распределение високосных годов:
            //
            //год, номер которого кратен 400, — високосный;
            //остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
            //остальные годы, номер которых кратен 4, — високосные[5].
            //все остальные годы — невисокосные.

            case 3:
                result = 31;
                break;
            case 4:
                result = 30;
                break;
            case 5:
                result = 31;
                break;
            case 6:
                result = 30;
                break;
            case 7:
                result = 31;
                break;
            case 8:
                result = 31;
                break;
            case 9:
                result = 30;
                break;
            case 10:
                result = 31;
                break;
            case 11:
                result = 30;
                break;
            case 12:
                result = 31;
                break;

            default:
                result = 0;
                break;
        }
        return result;
    }
}