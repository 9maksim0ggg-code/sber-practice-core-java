package OOP;

class Matrix{
    private int string = 1;
    private int stolb = 1;
    int[][] arr = new int[string][stolb];

    Matrix(){
    }

    Matrix(int i,int j){
        this.string = i;
        this.stolb = j;
        arr = new int[string][stolb];
        for(int strings = 0; strings<string;strings++){
            for(int stolbs = 0;stolbs<stolb;stolbs++){
                arr[strings][stolbs] = 0;
            }
        }
    }

    void setValue(int i, int j, int value){
        arr[i][j] = value;
    }

    void print(){
        System.out.println("================================");
        for(int strings = 0; strings<string;strings++){
            for(int stolbs = 0;stolbs<stolb;stolbs++){
                System.out.print("["+arr[strings][stolbs] + "] ");
            }
            System.out.println();
        }

    }

    void multiply(int i){
        for(int strings = 0; strings<string;strings++){
            for(int stolbs = 0;stolbs<stolb;stolbs++){
                setValue(strings,stolbs,(arr[strings][stolbs]*2));
            }
        }
    }

    
    void plus_Matrixes(Matrix other) {
        for (int strings = 0; strings < string; strings++) {
            for (int stolbs = 0; stolbs < stolb; stolbs++) {
                arr[strings][stolbs] = arr[strings][stolbs] + other.arr[strings][stolbs];
            }

        }
    }


    Matrix multiplyMatrix(Matrix other) {
        if (this.stolb != other.string) {
            System.out.println("Ошибка! Нельзя умножить: столбцы первой != строки второй.");
            return null;
        }

        Matrix result = new Matrix(this.string, other.stolb);
        for (int i = 0; i < this.string; i++) {
            for (int j = 0; j < other.stolb; j++) {
                int sum = 0;
                for (int k = 0; k < this.stolb; k++) {
                    sum += this.arr[i][k] * other.arr[k][j];
                }
                result.arr[i][j] = sum;
            }
        }
        return result;
    }
    
}


public class Task3 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2,2);
        matrix.print();
        matrix.setValue(1,1,2);
        matrix.setValue(0,1,4);

        matrix.multiply(2);
        matrix.print();
        
        Matrix b = new Matrix(2,2);
        b.setValue(0,0,2);
        b.setValue(0,1,2);
        b.setValue(1,0,2);
        b.setValue(1,1,2);

        matrix.plus_Matrixes(b);
        matrix.print();

        Matrix c = matrix.multiplyMatrix(b);
        c.print();

    }
}
