public class strings {

    public static void main(String[] args) {
    //способы создания строк
    String str = "String"; //принято создавать строки вот так
    String str2 = new String("String2"); //объекты этого класса являются неизменными

        //форматирование вывода чисел
        String st = String.format("шаблон со специальными символами %d%n", 3434);
        System.out.println(st);

        StringBuilder sb = new StringBuilder ();
        StringBuffer sf = new StringBuffer();
        sb.append("some new ").append("new");
        sb.insert(3, "VSTAVKA");
        System.out.println(sb);

        //в цикле:
        String stFlomLoop = "";
        for (int i = 1; i < 19; i++ ) {
        stFlomLoop += " number:" + i;

                }
        System.out.println(stFlomLoop);
    }
}
