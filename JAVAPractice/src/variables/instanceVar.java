package variables;

//A variable declared inside the class but outside the body of the method, is called an instance variable.
// It is not declared as static.
//An instance variable is a variable that is specific to a certain object.
// It is declared within the curly braces of the class but outside of any method.
// The value of an instance variable can be changed by any method in the class,
// but it is not accessible from outside the class.
public class instanceVar {
    int id;
    String name;

    public instanceVar(){
        this.id = 1;
        this.name= "john";
        // Default Constructor
        // initializing Instance Variable
    }

    public static void main(String[] args) {
        instanceVar ins =new instanceVar();
        System.out.println(ins.name);
        System.out.println(ins.id);
    }


}
