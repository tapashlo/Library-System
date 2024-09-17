public class Main{
    public static void main(String[] args){
        
        //Creating Author and Book Object
        
        Author author = new Author("J.K Rowling","jk.rowling@example.com","British");
        Book book = new Book("Harry Potter and the Philosopher's Stone.",19.99,author);



        //Displaying output

        System.out.println(book);
        System.out.println(author);
    }
}