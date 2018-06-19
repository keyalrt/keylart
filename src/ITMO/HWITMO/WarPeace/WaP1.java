package ITMO.HWITMO.WarPeace;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class WaP1 {

    public static void main(String[] args) throws IOException {
        File wp = new File("src/wap.txt");
        List<String> txtList = Files.readAllLines(wp.toPath());


//      2. Собрать все слова в группы по количеству букв: например, в одну группу попадут слова: [the, war, jar, get, met...], в другую [on, up, no, of...].
        List<String> threeChars = new ArrayList<>();
        List<String> twoChars = new ArrayList<>();
        for (String strGroup : txtList) {
            String arrGroup[] = strGroup.split(" ");
            for (int i = 0; i < arrGroup.length; i++) {
                if (arrGroup[i].length() == 3) {
                    threeChars.add(arrGroup[i]);
                } else if (arrGroup[i].length() == 2) {
                    twoChars.add(arrGroup[i]);
                }
            }
        }
        System.out.println();

//      4. Тоже, что и 2, но без артиклей, частиц и тп (без the, a, on, to...).

        List<String> twootherChars = new ArrayList<>();
        twootherChars.add("on");
        twootherChars.add("of");
        twootherChars.add("to");
        List<String> threeotherChars = new ArrayList<>();
        threeotherChars.add("the");

        threeChars.removeAll(threeotherChars);
        twoChars.removeAll(twootherChars);
        System.out.println(threeChars);
        System.out.println(twoChars);
        System.out.println();

    }}