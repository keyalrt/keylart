public class DataTypes {

    public static void main (String [] args) {
    System.out.println("привет");

    short a = 32;
    short b = 654;
    short c = (short) (a + b);

    //int
    int a1 = 9324;
    int b1 = 435453;
    int c1 = a1 / b1;
    System.out.println(c1);


    //float
        float a2 = 0.2f;
        float b2 = 0.3f;
        float c2 = a2 * b2;
        System.out.println(c2);

        double a3 = 0.2;
        double b3 = 0.3;
        double c3 = a3 * b3;
        System.out.println(c3);

        char a4 = 88;
        char c4 = 89;
        char e4 = 73;
        System.out.println("Char: " + a4 + c4 + e4);

        byte x = Byte.parseByte("100");
        int x1 = Integer.parseInt("100");
        short x2 = Short.parseShort ("100");


       //String
  String str1 = "STRING";
 String str2 = "STRING";

       String str3 = new String("STRING");
       String str4 = new String("STRING");

       System.out.println(str1 == str2); //true
       System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); //true


    }


}
