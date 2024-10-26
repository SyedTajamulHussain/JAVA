package constructors;



//A constructor is called "Default Constructor" when it doesn't have any parameter.
public class defaultConstructor {
    //creating default constructor
    defaultConstructor(){
        System.out.println("this is default constructor");
    }

    public static void main(String[] args) {
        //calling default constructor
        defaultConstructor cnst = new defaultConstructor();

    }
}
