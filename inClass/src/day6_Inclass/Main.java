package day6_Inclass;
import java.lang.reflect.InvocationTargetException;
import  java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        FooBar fooBar = new FooBar();
        for(Method method : fooBar.getClass().getMethods()){
            if(method.isAnnotationPresent(Run.class)){
                method.invoke(fooBar);
            }
        }
    }
}
