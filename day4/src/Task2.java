import java.util.HashSet;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int totalCheck = 1000000;
        HashSet hashSet = new HashSet();
        for(int i = 0;i<=totalCheck;i++){
            hashSet.add((int)(Math.random()*100000));
        }
        long hashSetTime = System.currentTimeMillis() -start;

        System.out.println("Время создания:" + hashSetTime + " мс");

        start = System.currentTimeMillis();
        int k = 0;
        for(int i = 0;i<=totalCheck;i++){
            if (hashSet.contains((int)(Math.random()*100000))){
                k = k+1;
            }
            if (k == 30000){
                break;
            }
        }
        hashSetTime =  System.currentTimeMillis() -start;
        System.out.println("Время нахождения " +k+ " элементов составило: " + hashSetTime+" мс\n\n\n");


        start = System.currentTimeMillis();
        TreeSet treeSet = new TreeSet();
        for(int i = 0;i<=totalCheck;i++){
            treeSet.add((int)(Math.random()*100000));
        }
        long treeSetTime = System.currentTimeMillis() -start;
        System.out.println("Время создания:" + treeSetTime + " мс");

        start = System.currentTimeMillis();
        int n = 0;
        for(int i = 0;i<=totalCheck;i++){

            if (treeSet.contains((int)(Math.random()*100000))){
                n = n+1;
            }
            if (n == 30000){
                break;
            }

        }
        treeSetTime =  System.currentTimeMillis() -start;
        System.out.println("Время нахождения " +k+ " элементов составило: " + treeSetTime+" мс");

    }
}
