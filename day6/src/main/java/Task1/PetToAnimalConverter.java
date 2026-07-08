package Task1;

import java.lang.reflect.Field;
import java.util.*;
public class PetToAnimalConverter{
    PetToAnimalConverter(Pet otherpet){}

    static Animal convertToAnimal(Pet otherPet) throws IllegalAccessException, NoSuchFieldException {
        Animal animal = new Animal();

        Class<?> classPet = otherPet.getClass();
        Class<?> classAnimal = animal.getClass();

        Field[] fieldsPet = classPet.getDeclaredFields();

        for(Field field : fieldsPet){
            field.setAccessible(true);
            Object value = field.get(otherPet);
            System.out.println(value);
            String fieldName = field.getName();
            System.out.println(fieldName);

            if (fieldName == "name"){
                Field titleField = classAnimal.getDeclaredField("title");
                titleField.setAccessible(true);
                titleField.set(animal,(String)value);
                titleField.setAccessible(false);
            }
            if (fieldName == "status"){
                Field statusField = classAnimal.getDeclaredField("isAvailable");
                statusField.setAccessible(true);
                statusField.set(animal,true);
                statusField.setAccessible(false);
            }
            if (fieldName == "photoList"){
                List<Photo> photos = (List<Photo>) value;
                Map<String,String> photomap = new HashMap<>();
                if (photos != null){
                    for (Photo photo : photos){
                        photomap.put(photo.getName(),photo.getURL());
                    }
                }


                Field photoField = classAnimal.getDeclaredField("photosMap");
                photoField.setAccessible(true);
                photoField.set(animal,photomap);
                photoField.setAccessible(false);
            }


        }
    return animal;


    }
}
