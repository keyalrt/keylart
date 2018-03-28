import java.util.Random;
import java.util.Scanner;

public class HomeWork_26_03 {

    public static void main(String[] args) {

        //задача 1 массивы
        int[] arr1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Число Массива 1 №" + i + ": " + arr1[i]);
        }

        //задача 2 массивы
        int[] arr2 = new int[50];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (i * 2) + 1;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        // задача 3 массивы
        int b = 0;
        int[] arr3 = new int[15];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) Math.round(Math.random() * 10);
            System.out.println(arr3[i]);
            if (arr3[i] % 2 == 0) b++;
        }
        System.out.println("Количество четных " + b);

        //задача 4 массивы
        int[] arr4 = new int[5];
        double average1 = 0;
        double sum1 = 0;
        for (int o = 0; o < arr4.length; o++) {
        arr4[o] = (int) Math.round(Math.random() * 10);
        sum1 += arr4[o];}
        average1 = sum1/arr4.length;
        System.out.println("Среднее первого массива = " + average1);

        int[] arr5 = new int[5];
        double average2 = 0;
        double sum2 = 0;
        for (int p = 0; p < arr5.length; p++) {
        arr5[p] = (int) Math.round(Math.random() * 10);
        sum2 += arr5[p];}
        average2 = sum2 / arr5.length;
        System.out.println("Среднее второго массива = " + average2);

        if (average1 > average2) {System.out.println("Первый массив больше второго");}
        else if (average2 > average1){System.out.println("Второй массив больше первого");}
        else if (average1 == average2){System.out.println("Массивы равны");}



        //задача 5 массивы

        int [] arr6 = new int [4];
        for (int z = 0; z < arr6.length; z++) {
        arr6[z] =(int) ((int) 10 + Math.random()* 89);
        System.out.print(" " + arr6 [z] + " ");}
        if (arr6 [0] < arr6 [1] && arr6 [1] < arr6 [2] && arr6 [2] < arr6 [3]) {
        System.out.print("Массив возрастающий");}
        else {System.out.print("Массив приуныл и не является возрастающей последовательностью");}


        //задача 7 многомерные массивы
        Random random = new Random();
        int minimal = 0;
        int maximal = 0;
        int[][] arr7 = new int[5][8];
        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 8; j++) {
        int a = random.nextInt(199) - 99;
        arr7[i][j] = a;
        System.out.print(arr7[i][j] + " ");
        }
        System.out.println();
        }
        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 8; j++) {
        if (arr7[i][j] > maximal) maximal= arr7[i][j];
        if (arr7[i][j] < minimal) minimal = arr7[i][j];
            }
        }
        System.out.println("Минимальное значение: " + minimal);
        System.out.println("Максимальное значение: " + maximal);

        System.out.println ("Задачи на строки:");

        // задача 1 строки

        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        String str3;
        System.out.println("Введите параметр строки");
        str1 = sc.nextLine();
        do {
        System.out.println("Введите параметр строки, которую нужно заменить:");
        str2 = sc.nextLine();
        if (str1.contains(str2)){
        System.out.println("Введите новый параметр:");
        str3 = sc.nextLine();
        str1 = str1.replaceAll(str2,str3);
        break;
        }else {
        System.out.println("Указанная Вами строка не найдена, введите новый параметр:(\nВвести новую строку для замены? (y/n):");
        String answer = sc.nextLine();
        System.out.println(answer);
        if (answer.equals("n")){
        System.out.println("Замена окончена");
        break;
        }
        }
        }while (true);
        System.out.println(str1);

        // задача 2 строки

        Scanner op = new Scanner(System.in);
        System.out.println("Введите параметр строки");
        String str = op.nextLine();
        str = str.replaceAll(" ","");
        StringBuffer buff = new StringBuffer(str);
        for (int i = 0; i < buff.length()-1; i++){
        char q = buff.charAt(i);
        for (int j = i+1; j < buff.length();){
        if (q == buff.charAt(j)){
        buff.deleteCharAt(j);
        }else {
        j++;
        }
        }
        }
        System.out.println(buff.toString());


    }
        }


















