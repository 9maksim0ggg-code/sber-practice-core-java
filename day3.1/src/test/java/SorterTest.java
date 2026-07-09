import MAVEN.Sorter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import MAVEN.Task;
class SorterTest {

    @Test
    void testBubbleSort() {
        int length = 100;
        int[] vector = new int[length];
        for (int i = 0;i<length;i++){
            vector[i] = (int) (Math.random()*length);
       }
        Sorter sorter = new Sorter(vector);
        sorter.sorting_Bubble();

    }

    @Test
    void testFastSort() {
        int length = 100;
        int[] vector = new int[length];
        for (int i = 0;i<length;i++){
            vector[i] = (int) (Math.random()*length);
        }
       Sorter sorter = new Sorter(vector);
        sorter.fast_method();

    }
}