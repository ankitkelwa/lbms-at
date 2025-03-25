
package lms;

import lms.Book;
import lms.Patron;
import lms.Reception;

public class Main {
    public static void main(String[] args) {

        Reception Branch1 = new Reception();

        Book book1=new Book(101,"Java","JavaWriter");
        Book book2 =new Book(102,"AdvanceJava","AdvWriter"); 
        Branch1.addBook(Book1);
        Branch1.addBook(Book2);

        Patron patron =new Patron(1, "Shubham", "Hore", "horeshubham@gmail");
        Branch1.addPatron(Member1);

        Branch1.checkout(1,101);
        Branch1.returnBook(1,101);

        //Can add multiple Branch support too
        
        
    }

}