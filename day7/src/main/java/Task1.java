import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String fileName = "day7/Borodino.txt";
        BufferedReader reader =new BufferedReader(new FileReader(fileName));
        BufferedWriter writer = new BufferedWriter(new FileWriter("day7/Borodino2.txt"));

        String line;
        while ((line = reader.readLine()) != null ){
            line = line.replaceAll("\\s+", " ");
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }
        writer.close();
        reader.close();

    }
}

