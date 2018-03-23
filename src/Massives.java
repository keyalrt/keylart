import java.util.Arrays;

public class Massives {

    public static void main(String[] args) {



        String [] arr2 = new String [3]; //- тут лежат только строки
        int [] arr1 = new int [3]; //- тут лежат только переменные типа инт;
        System.out.println(Arrays.toString (arr1));
        System.out.println(Arrays.toString (arr2));

       // int a = 3;
        int [] arr3 = {3, 8, 9, 1, -50, 97};

//        //Как обратиться к массиву по его индексу:
//        int arr3Elem = arr3 [2];
//
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = "elem # "+ i;
//        }
//        for (int i = 0; i < arr3.length; i ++) {
//            System.out.println("#" + i + ": " + arr3[i]);}
//
//        //arr3 = {a, 8, 9, 1, -50, 97};
//        int [] newArr3 = arr3.clone(); // первый вариант копирования массива
//        //System.arraycopy (
                //массив - источник,
                //позиция - начало нового массива,
                //массив назначения,
                //начальная позиция целевого массива
                // количество копируемых элементов

       // );

        int [] newArr4 = new int [3];
        System.arraycopy(arr3,  2, newArr4, 0,  2);
        System.out.println(Arrays.toString (newArr4));

        //еще два метода копирования
       // int [] newArr5 = Arrays.copyOf(исходный_массив, длина_нового массива);
        int [] newArr5 = Arrays.copyOf (arr3, 3);
        System.out.println(Arrays.toString (newArr5));
        int [] newArr6 =Arrays.copyOfRange(arr3, 2, 4);
        System.out.println(Arrays.toString (newArr6));

        // сравнение масиивов
        Arrays.equals(arr1, arr3);
        Arrays.binarySearch (arr3, 9);
        Arrays.binarySearch (arr3, 2,4,9);

        Arrays.sort (arr3);
        Arrays.parallelSort (arr3);
        System.out.println(Arrays.toString (arr3));

        int c = Arrays.binarySearch(arr3, 3);
        System.out.println(c);


        //многомерные массивы
        int [] [] arr2D;
        int [] [] [] arr4D;
        int [] [] arr2d = new int [10][];
        for (int i =0; i < arr2d.length; i++) {
        arr2d[i] = new int [i];
        System.out.println(Arrays.deepToString(arr2d));
        }
        int a = 708;
        int a1 = a % 100/10;
        int a2 = a % 100 % 10;
        int a3 = a / 100;
        System.out.println(a3);


    }
        }
