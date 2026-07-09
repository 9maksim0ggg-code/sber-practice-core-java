package MAVEN;

import MAVEN.Sorter;

public class Task {
    public static void main(String[] args) {
        int length = 10;
        int[] vector = new int[length];
        for (int i = 0;i<length;i++){
            vector[i] = (int) (Math.random()*length);
        }
        //Просто вызов
        Sorter sort = new Sorter(vector.clone());
        Sorter sort1 = new Sorter(vector.clone());
        sort.printVector();
        //Пузырьковый
        System.out.println("Пузырьковый метод");
        sort.sorting_Bubble();
        sort.printVector();

        System.out.println("Быстрый метод");
        sort1.fast_method();
        sort1.printVector();



    }
}
