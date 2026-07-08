import java.util.LinkedHashMap;
import java.util.Map;

class Swapper<T>{
    Swapper(){}

    private Map<T,T> mapClone = new LinkedHashMap<>();

    public Map<T,T> swap(Map<T,T> otherMap){
        for (Map.Entry<T, T> object : otherMap.entrySet()){
            T key = object.getKey();
            T value = object.getValue();
            mapClone.put(value,key);
        }
        return mapClone;
    }


}


public class Task1 {
    public static void main(String[] args) {
        Swapper swapper = new Swapper<>();

        Map<String,String> map = new LinkedHashMap<>();
        map.put("Максим","Мусин");
        map.put("Василий","Джавович");
        map.put("Джодж","Пайтоновец");
        System.out.println(map);

        Map<String,String> mapswap = swapper.swap(map);
        System.out.println(mapswap);
    }


}
