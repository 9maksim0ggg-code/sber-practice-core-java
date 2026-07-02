package OOP;

class Author{
    private String name;
    private String sex;
    private String email;

    Author(){

    }

    Author(String name,String sex,String email){
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    String getName(){
        return this.name;
    }

    void to_String() {
        System.out.println("====================");
        System.out.println("ФИО автора: " + name);
        System.out.println("Пол автора: " + sex);
        System.out.println("Почта: " + email);
    }



}

class Book extends Author{
    private String name;
    private String author;
    Book(){
        name = "noname";
        author = "noneAuthor";
    }

    Book(String name,Author author){
        this.name = name;
        this.author = author.getName();
    }

    void to_String() {
        System.out.println("====================");
        System.out.println("Наименование вашей книги: " + name);
        System.out.println("Автор книги: " + author);
    }

    void getAuthor(Author author){

        System.out.println("\n\nИнформация об авторе у этой книги:");
        author.to_String();
    }
}

public class Task4 {
    public static void main(String[] args) {
        Author author = new Author("Мусин Максим Александрович","Мужчина", "9maksim0ggg@gmail.com");
        System.out.println(author.getName());
        author.to_String();

        Book book = new Book("Уроки по Джаве", author);
        book.to_String();

        book.getAuthor(author);

    }
}
