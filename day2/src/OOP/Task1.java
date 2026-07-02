package OOP;

class Phone{
    String number;
    String model;
    int weight;

    void receiveCall(String name){
        System.out.printf("Звонит {name}");
    }

    String getNumber(){
        return ("ваш номер: " + this.number);
    }

    Phone(String number, String model,int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //Конструктор по умолчанию
    Phone(){
    }

    void receiveCall(String name,String number){
        System.out.println("Вам звонил аббонент: "+name+ "  его номер: " + number);
    }


    public String to_String(){
        return "Информация о вас:" + " Number:" + this.number+ " Model:" + this.model + " Weight:" + this.weight;


    }

}

public class Task1 {
    public static void main(String[] args) {
        String number = "79005593801";
        String model = "iphone-11";
        int weight = 35;
        Phone iphone = new Phone(number,model,weight);
        System.out.println("Используем метод getNumber: " + iphone.getNumber());

        iphone.receiveCall("Антон","+79005003888");
        System.out.println(iphone.to_String());

    }
}