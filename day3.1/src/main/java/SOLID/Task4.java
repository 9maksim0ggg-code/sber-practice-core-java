//Нарушение логики
// Human и Robot безусловно являются Worker
// Но при этом очевиден тот факт что метод eat() прописаный у робот будет излишним так как он не ест
//Поэтому разделим интерфейсы под разные задачи

package SOLID;
interface Workable {
    void work();
}

interface Eateable{
    void eat();
}

class Human implements Workable,Eateable {
    @Override
    public void work() {
        System.out.println("Человек работает");
    }

    @Override
    public void eat() {
        System.out.println("Человек ест");
    }
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Робот работает");
    }


}


public class Task4 {
    public static void main(String[] args) {
        Human human = new Human();
        human.work();
        human.eat();
        Robot robot = new Robot();
        robot.work();
    }
}
