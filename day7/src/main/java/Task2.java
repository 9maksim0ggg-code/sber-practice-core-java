import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String filename = "day7/listNames.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        BufferedWriter writer = new BufferedWriter(new FileWriter("day7/newListNames.txt"));
        String line;
        Set nameSet = new TreeSet<>();
        String[] nameArray = new String[0];

        while ((line = reader.readLine()) != null){
            line = line.replaceAll(",","");
            nameArray = line.split(" ");
            //System.out.println(line);
        }
        for (String name : nameArray){
            nameSet.add(name);
            System.out.println(name);
        }

        for( Object name : nameSet){
            writer.write((String) name);
            writer.newLine();
        }
        System.out.println(nameSet);


        writer.close();
        reader.close();
    }
}
