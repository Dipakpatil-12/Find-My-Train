package Java_programming;

    // You have to implement a library using Java Class "Library"
    // Methods: addBook, issueBook, returnBook, showAvailableBooks
    // Properties: Array to store the available books,
    // Array to store the issued books

    class Liabrary{
        String[] books;
        int no_of_books;

        Liabrary(){
            this.books = new String[100];
            this.no_of_books = 0;
        }
        void addBook(String book){
            this.books[no_of_books]= book;
            no_of_books++;
            System.out.println(book+" has been added");
        }
        void showAvailableBooks(){
            System.out.println("Available books are: ");
            for (String book:this.books) {
                if(book==null){
                    continue;
                }
                System.out.println("* "+book);
            }
        }
        void issueBook(String book){
            for (int i=0; i<this.books.length; i++){
                if(this.books[i].equals(book)){
                    System.out.println("The book has been issued!!");
                    this.books[i]=null;
                    return;
                }
            }
            System.out.println("This book does not exist!!");
        }
        void returnBook(String book){
            addBook(book);
            System.out.println("The book has been returned,Thank you!!");
        }
    }
    public class CWH_61_Ex4_Sol {
        public static void main(String[] args) {

            Java_programming.Liabrary CentralLiabrary = new Java_programming.Liabrary();

            CentralLiabrary.addBook("Think and grow rich");
            CentralLiabrary.addBook("Algorithm");
            CentralLiabrary.addBook("C++");
            CentralLiabrary.addBook("Atomic Habits");

            CentralLiabrary.showAvailableBooks();

            CentralLiabrary.issueBook("C++");

            CentralLiabrary.showAvailableBooks();

            CentralLiabrary.returnBook("C++");

            CentralLiabrary.showAvailableBooks();
        }
}
