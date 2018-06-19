package ITMO.HWITMO.WarPeace;

import javax.swing.text.html.parser.Entity;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class WordTopRate {

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap){

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }});

        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry: list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    public static <K,V> void printMap(Map<K, V> map){
        for (Map.Entry<K, V> entry : map.entrySet()){
            System.out.println("Слово: " + entry.getKey() + " Повторений: " + entry.getValue());
        }
    }
    public static <K, V> void top10 (Map<K, V> map){ //выводим десятку популярных слов со значениями
        int c =0;
        for (Map.Entry<K, V> entry : map.entrySet()){
            System.out.println("Слово: " + entry.getKey() + " Повторений: " + entry.getValue());
            c += 1;
            if (c == 10)
                break;
        }
    }

    public static void main(String[] args) throws IOException {

        File wp = new File("src/wap.txt");
        List<String> txtList = Files.readAllLines(wp.toPath());
        Set<String> txtSet = new HashSet<>();
        List<String> anotherList = new ArrayList<>();

        Map<String, Integer> wordStat = new HashMap<String, Integer>();
        for (String txtStr : txtList) {
            String strVal = txtStr.trim().toLowerCase().replaceAll("\\pP|\\d", "");
            String arrStr[] = strVal.split(" ");
            for (int i = 0; i < arrStr.length; i++) {
                Integer value = wordStat.get(arrStr[i]);
                wordStat.put(arrStr[i], value == null ? 1 : value + 1);
            }
        }
        wordStat.remove("");
        Map<String, Integer> sortWP = sortByValue(wordStat);
        top10(sortWP);
    }}