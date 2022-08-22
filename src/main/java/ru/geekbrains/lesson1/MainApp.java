package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {



        //Задам типы перемены данных

        int count = 19;
        short a = 3999;
        byte b = 127;
        long c = 1999999L;
        float d = 14.37F;
        double e = 199.199;
        char f = 'c';
        boolean g = false; //or true

        float a1 = 14.12f;
        float a2 = 13.11f;
        float a3 = 11.09f;
        float a4 = 12.04f;

        int b1 = 1;
        int b2 = 19;

        int d1 = -3;

        int c1 = -4;

        String someName = "ivan";

        // сюда возвращаем результаты работы методов
        System.out.println(calculate(a1, a2, a3, a4));
        System.out.println(sum1(b1, b2));
        positiveOrNegative(d1);
        negative(c1);
        nameUser(someName);





    }

    // Рассчитаем выражение 4х чисел типа float по формуле a1 * (a2 + (a3 / a4)) с возвратом результата
     public static float calculate(float a1, float a2, float a3, float a4) {
         float res = a1 * (a2 + (a3 / a4));
         return res;
    }

    //Зададим два числа int и проверим, лежат ли они в пределах от 10 до 20
    public static int sum1(int b1, int b2) {
        int sum1 = b1 + b2;

        if (sum1 >= 10 && sum1 <= 20){
            System.out.println("Сумма чисел a и b  - В интервале от 10 до 20");
        }
        else
            if (sum1 < 10 || sum1 > 20)
            {
            System.out.println("Сумма чисел a и b - НЕ в интервале от 10 до 20");
        }

        return sum1;
        }

    // нам требуется ввести целое число в d1 и узнать, Положительное или Отрицательное ли оно
        public static void positiveOrNegative(int d1){
            if(d1 >=0){
                System.out.println("Число положительное");
            }

            else{
                System.out.println("Число отрицательное");
            }

        }
        // Ниже указан метод, который при отрицательно значении выдаёт true, и false при положильном числе
            public static boolean negative(int c1){
            if(c1 < 0){
                return true;
            }
            else {
                return false;
            }
        }

        // Метод, которому в качестве параметра строка, показывающая имя.

        public static void nameUser(String someName){
            System.out.println("Привет, " + someName);
        }
    }

