package SOLID;
import java.util.Vector;


interface UserStorage {
    void addUser(String username);
    void save();
}

class Database implements UserStorage {
    private Vector<String> users = new Vector<>();
    private String databaseName;

    Database(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void addUser(String username) {
        users.add(username);
        System.out.println("Пользователь добавлен в базу " + databaseName);
    }

    @Override
    public void save() {
        System.out.println("База '" + databaseName + "' сохранена. Пользователи: " + users);
    }
}

class UserService {
    private UserStorage storage;

    UserService(UserStorage storage) {
        this.storage = storage;
    }

    public void createUser(String username) {
        storage.addUser(username);
        storage.save(); // сохраняем после добавления
    }
}

public class Task5 {
    public static void main(String[] args) {
        Database database = new Database("База #143");
        UserService service = new UserService(database);
        database.save();
        System.out.println();
        service.createUser("Максим");
        service.createUser("Анна");
        
    }
}