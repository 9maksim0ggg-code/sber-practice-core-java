package OOP;

class PizzaOrder{
    private String name;

    enum Size {
        SMALL("Маленькая"),
        MEDIUM("Средняя"),
        LARGE("Большая");

        private String nameSize;
        Size(String size){
            this.nameSize = size;
        }

        public String getNameSize(){
            return nameSize;
        }

    }


    private Size size;
    private String address;
    private boolean soup;
    private boolean acccept = false;


    PizzaOrder(){}

    PizzaOrder(String name,Size size,boolean soup,String adres){
        this.name = name;
        this.size = size;
        this.soup = soup;
        this.address = adres;
    }

    void order(){
        acccept = true;
        System.out.print("Принят заказ. " + size.getNameSize() + " пицца '"+name+"'");
        if (soup == true) {
            System.out.print(" с соусом на адрес: " + address + "\n");
        }
        else {
            System.out.println(" без соуса на адрес: " + address + "\n");
        }

    }

    void cancel(){
        acccept = false;
        System.out.println("Заказ был отменен");
    }


    void setName(String name){
        this.name = name;
    }
    void setAddress(String address){
        this.address = address;
    }

    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }

    void to_String(){
        System.out.println("================\nВся информация по вашему заказу:");
        System.out.print("Состав: пицца "+name);
        if (soup == true) {
            System.out.print(" с соусом"+ "\n");
        }
        else {
            System.out.println(" без соуса"+ "\n");
        }
        System.out.println("Адрес заказа: " + address);
    }



}

public class Task5 {
    public static void main(String[] args) {
        PizzaOrder order1 = new PizzaOrder("4 сыра", PizzaOrder.Size.SMALL, true,"Гончарная 33");
        order1.order();
        order1.cancel();
        order1.to_String();

        PizzaOrder order2 = new PizzaOrder(order1.getName(), PizzaOrder.Size.MEDIUM, false,"Гончрпофя 33" );
        order2.setAddress("Гончарная 33");
        order2.order();
        order2.to_String();

    }
}
