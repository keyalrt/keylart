public class HomeWork_23_03_18 {

    // блок циклы задание 1.
    public static void main(String[] args) {

        int a = 1000;
        while (a < 9999) {
        System.out.println(a);
        a = a + 3;}

    //блок циклы задание 2
        int b = 90;
        while (b > 0) {
        System.out.println(b);
        b = b - 5;}

    //блок циклы задание 3
        int c,e;
        for (c=0, e=2; c <= 20; c ++, e = e * 2) {
        System.out.println(e); }
    // или так блок циклы задание 3
        int c1,e1;
        for (c1=0, e1=2; c1 <= 20; c1 ++, e1 = e1 + e1) {
            System.out.println(e1); }

    // блок циклы задание 4
        int d = 8;
        if (d / d == 1 && d / 1 == d){
        System.out.println("Число - простое");}
        else if (d / d != 1 && d / 1 != d) {
        System.out.println("Число - составное");}


        int num = 10;
        for ( int i=2; i < num; i++) {
        if ( num%i == 0) {
        System.out.println("Заданное число не простое");
        //        return;
            }
        }
        System.out.println("Заданное число простое");

    // блок циклы задание 4
        int f=1,m=1,g=0, l;
        for (l=1; l <= 11; l ++) {
        g = f + m;
        f = m;
        m = g;
        System.out.println(g); }

    // блок циклы задание 5
        int sum = 0;
        for(int i = 000001; i <= 999999; i++){
            int number1 = i/100000;
            int number2 = (i/10000)%10;
            int number3 = (i/1000)%10%10;
            int number4 = (i/100)%10%10%10;
            int number5 = (i/10)%10%10%10%10;
            int number6 = i%10%10%10%10;

            if(number1 + number2 + number3 == number4 + number5 + number6){
                sum++;
            }
        }
        System.out.println("Рулон билетов с номерами от 000001 до 999999 имеет " + sum + " счастливых билетов.");

// блок циклы задание 6
        int sovpadeniy=0;
        for(int hour=1;hour<=24;hour++){
        for(int minute=0;minute<=59;minute++){
        if(hour/10%10==minute%10&hour%10==minute/10%10){
                    sovpadeniy++;
                }
            }
        }
        System.out.println("Всего "+sovpadeniy+" совпадений");
    }

    }

















