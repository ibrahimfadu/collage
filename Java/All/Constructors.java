public class Constructors {
    String languages;
    String name;
    //Parametirezed constructor
    Constructors(String lang){
        languages=lang;
        System.out.println(languages+" Programming language");}
    //Default constructor
    Constructors(){
        System.out.println("Default constructors");
        name="Java";
    }
    
public static void main(String[] args) {
    Constructors c=new Constructors();
    System.out.println("The name is "+c.name);
    Constructors c1=new Constructors("Java");
    Constructors c2=new Constructors("Python");
}

    }

