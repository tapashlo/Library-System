public class Author{
    String name;
    String email;
    String nationality;

    //Null Constructor

    public Author(){

    }

    //Constructor with parameters

    public Author(String name, String email, String nationality){
        this.name = name;
        this.email = email;
        this.nationality = nationality;
    }

    //Getters

    public String getName(){
        return name;

    }

    public String getEmail(){
        return email;
    }
    public String getNationality(){
        return nationality;
    }

    //Displaying Output with Override toString()
@Override
    public String toString(){
        return "Author: "+getName()+", Email: "+getEmail()+", Nationality: "+getNationality();

        


    }
}