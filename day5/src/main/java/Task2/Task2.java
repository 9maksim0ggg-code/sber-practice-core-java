package Task2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;


public class Task2 {
    public static void main(String[] args) throws IOException {
        String filePath = "day5/textDay5.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        HashMap<String,Integer> wordsMap = new HashMap();

        while((line = reader.readLine()) != null){
            String[] words = line.split("\\s+");
            int currentKValue;
            for(String word : words){
                word = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
                word = word.toLowerCase(Locale.ROOT);

                if(wordsMap.containsKey(word) == false){
                    wordsMap.put(word,1);
                }
                else{
                    currentKValue = wordsMap.get(word) + 1;
                    wordsMap.put(word,currentKValue);
                }
            }
        }
        System.out.println(wordsMap);
    }
}
