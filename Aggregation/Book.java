public class Book{
    String title;
    int pages;

    Book(String tittle, int pages) {
        this.title = tittle;
        this.pages = pages;
    }

    void displayInfo(){
        System.out.printf("This book is named %s\n", title);
        System.out.printf("It has %d in it\n", pages);
    }
    
}