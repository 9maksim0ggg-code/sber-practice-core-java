import java.util.Vector;

class Pair<T>{
    T key;
    T value;
    Pair(){}

    Pair(T key,T value){
        this.key =  key;
        this.value = value;
    }

    T getKey(){
        return key;
    }

    T getValue(){
        return value;
    }

    T setKey(T newkey){
        key = newkey;
        return  key;
    }

    T setValue(T newvalue){
        value = newvalue;
        return value;
    }

    void printPair(){
        System.out.println("your pair [key,value]: [" + key+"] [" + value + "]");
    }

}


public class Task1 {
    public static void main(String[] args) {
        int key = 123;
        String value = "123ggg";
        Pair pair = new Pair<>(key,value);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        double newkey = -63.5;
        pair.setKey(newkey);
        System.out.println(pair.getKey());

        Vector v = new Vector();
        v.add(1);
        v.add(2);
        pair.setValue(v);
        pair.printPair();



    }
}
