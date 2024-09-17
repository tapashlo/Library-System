public class Book{
    String title;
    double price;
    Author author;

    //Null Constructor

    public Book(){
        
    }

    //Constructor with parameters

    public Book(String title, double price, Author auth){
        this.title = title;
        this.price = price;
        author = auth;
    }

    //Getters

    public String getTitle(){
        return title;

    }

    public double getPrice(){
        return price;
    }

    public String getAuthor(){
        return author.name;
    }

    //Displaying Output with Override toString method. 

@Override
    public String toString(){
        return "Book: "+getTitle()+", Price: "+getPrice();

    }


}