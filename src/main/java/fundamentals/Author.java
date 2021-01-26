package fundamentals;
//Write an application that consists of few classes:
//Author class, representing an author – poem writer, which consists of fields surname and nationality
// (both of type String)
//Poem class, representing poem, which consists of fields creator (type Author) and stropheNumbers
// (type int – numbers of strophes in poem)
//Main class, with main method, inside which you will:
//Create three instances of Poem class, fill them with data (using constructor and/or setters) and store them in array
//Write a surname of an author, that wrote a longest poem (let your application calculate it!)
public class Author {
    public String surname;
    public String nationality;

    public Author(){
        surname = "Adi";
        nationality = "romanian";
    }
}

