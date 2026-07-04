//Один класс отвечает за разные задачи, необходимо разбить

package SOLID;


class UserLogger {
    private java.util.Map<String, String> users = new java.util.HashMap<>();

    public java.util.Map<String, String> getUsers(){
        return users;
    }

    public void addUser(String username, String password) {
        getUsers().put(username, password);
    }

}


class Autorization extends Logs{
    Autorization(){}

    private java.util.Map<String, String> users;
    private UserLogger userLogger;
    Autorization(UserLogger userLogger){
        this.userLogger = userLogger;
        users = userLogger.getUsers();
    }


    boolean containsUsername(String username){
        if (users.containsKey(username)==true){
            return users.containsKey(username);
        }
        else{
            log("Такой пользователь уже есть");
            return users.containsKey(username);
        }

    }


}

class Logs{
    public void log(String message) {
        System.out.println("[" + java.time.LocalDateTime.now() + "] " + message);
    }

    public void logError(String error) {
        System.err.println("[ERROR " + java.time.LocalDateTime.now() + "] " + error);
    }
}


public class Task1 {
    public static void main(String[] args) {
        UserLogger userlogger = new UserLogger();
        Autorization autorization = new Autorization(userlogger);
        Logs logger = new Logs();


        userlogger.addUser("Максим", "maks123");
        System.out.println("Есть ли такой пользователь? : "+ autorization.containsUsername("Максvим"));
        logger.log("Не получается");
    }
}
