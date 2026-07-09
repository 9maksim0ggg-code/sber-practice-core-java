import java.io.*;

class Hero {
    String name;
    int lvl;
    Weapon weapon;

    Hero(String name,int lvl,Weapon weapon){
        this.name = name;
        this.lvl = lvl;
        this.weapon = weapon;
    }
    String getName(){
        return name;
    }
    int getLvl(){
        return lvl;
    }
    Weapon getWeapon(){
        return weapon;
    }
    String writeHero(){
        return getName()+"/"+getLvl()+"/"+Weapon.getWeapon();
    }



}

class Weapon{
    static String nameWeapon;
    static int damage;
    Weapon(String nameWeapon,int damage){
        this.nameWeapon = nameWeapon;
        this.damage = damage;
    }

    static String getWeapon(){
        return nameWeapon+"/"+damage;
    }
}

class Reader{
    void readHero() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("day7/load.txt"));
        String line = reader.readLine();
        String elements[] = line.split("/");
        System.out.println("Поля выгруженного hero:\n"+"name:"+elements[0]+", lvl:" +elements[1] +
                "\nЕго оружие:" + elements[2] +", damage:"+ elements[3]);
        reader.close();
    }
}
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("day7/load.txt"));
        Weapon axe = new Weapon("axe",10);
        Hero hero = new Hero("Max",35,axe);

        writer.write(hero.writeHero());
        writer.close();

        //Выгружаем нашего героя
        Reader reader = new Reader();
        reader.readHero();


    }
}
