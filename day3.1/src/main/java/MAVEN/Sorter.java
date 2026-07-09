package MAVEN;
public class Sorter{
    Sorter(){}
    int[] vector;
    int length;

    public Sorter(int[] vector){
        this.vector = vector;
        this.length = vector.length;
    }

    public void sorting_Bubble(){
        for(int j = 0;j<length-1;j++){
            for(int i=0;i<length-1-j;i++){
                if(vector[i]> vector[i+1]) {
                    swap(i,i+1);
                }
            }
        }
    }

    void swap(int i,int j){
        int reserv = vector[i];
        vector[i] = vector[j];
        vector[j] = reserv;
    }

    public void fast_method(){
        sorting_Fast(0,length-1);
    }

    private void sorting_Fast(int low,int high){
        if (low < high){
            int pivot_index = partition(low,high);
            sorting_Fast(low,pivot_index-1);
            sorting_Fast(pivot_index+1,high);
        }


    }

    int partition(int low,int high){
        int pivot = vector[high];
        int i = low-1;
        for(int j = low; j<high;j++){
            if (vector[j] < pivot){
                i = i+1;
                swap(i,j);
            }
        }
        swap(i+1,high);
        return i+1;

    }

    public void printVector(){
        for (int i = 0;i<length;i++){
            System.out.print("["+ vector[i] + "] ");
        }
        System.out.println("");
    }

}