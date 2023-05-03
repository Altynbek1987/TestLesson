import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    static double v;
    static int i;
    static String s;
    static boolean aBoolean;

    static Integer integer;

    static char aChar;

    static float aFloat;

    static long aLong;
    public static void main(String[] args) {

//        System.out.println(v);
//        System.out.println(i);
//        System.out.println(s);
//        System.out.println(aBoolean);
//        System.out.println(integer);
//        System.out.println(aChar);
//        System.out.println(aFloat);
//        System.out.println(aLong);



//        int[] num = {3,4,53,23,5,17,2,4,14,3,15};
//
//        int minElement = num[0];
//        int minIndex = 0;
//
//        for (int j = 1; j < num.length; j++) {
//            if (num[j] < minElement){
//                minElement = num[j];
//                minIndex = j;
//            }
//        }
//        System.out.println(minElement);
//        System.out.println(minIndex);

        int[] array = {3,4,53,23,5,17,2,4,14,3,15};

        int sum = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] != sum){
                sum = array[i];
                System.out.println(sum + " unikum");
            } else if (array[i] == sum) {
                sum = array[i];
                System.out.println(sum + " dublicate");
            }

        }

    }


    /*
    ДЗ:
● Создать массив дробных (не целых) чисел размером 15 элементов и наполнить
его положительными и отрицательными числами;
● Затем через цикл “for each” посчитать среднее арифметическое положительных
чисел расположенных после первого отрицательного числа и вывести его на экран
(8, -2, -4, 2, 3, 6) = 11/3

 double[] num = {3,4,53,-23,5,1,-3,4,14,3,15};
        boolean b = false;
        double count = 0.0;
        int index = 0;
        double overol;

        for (double sum:num) {
            if (sum <= 0){
                b = true;
            } else if (b) {
                count += sum;
                index ++;
            }
        }

        System.out.println(count);
        System.out.println(index);
        overol = count / index;

        System.out.println(overol);
     */
}