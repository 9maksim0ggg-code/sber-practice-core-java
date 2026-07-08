package Task1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        List<Photo> photos = Arrays.asList(
                new Photo("1.jpg", "url"),
                new Photo("2.jpg", "url")
        );

        Pet pet = new Pet("Мурка", Status.AVAILABLE, photos);


        Animal animal = PetToAnimalConverter.convertToAnimal(pet);

        System.out.println("\nПараметры нашего animal который произошел из конвертации:");
        System.out.println(animal.toString());


    }
}
