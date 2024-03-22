class Book {
    private String title;
    private Author author;
    private int yearOfPublication;
    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
class Author {
    private String firstName;
    private String lastName;
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Alfred", "Bester");
        Author author2 = new Author("Henrik", "Böll");
        Book book1 = new Book("Tiger Tiger", author1, 1992);
        Book book2 = new Book("Stranger", author2, 1808);
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", published in " + book1.getYearOfPublication());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", published in " + book2.getYearOfPublication());
        book1.setYearOfPublication(1222);
        System.out.println("Modified Book 1: " + book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", published in " + book1.getYearOfPublication());
    }
}