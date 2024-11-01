package variables;

public class localVar {
    public static void main(String[] args) {
        localVariable();

    }
    public static void localVariable(){
        int a = 5;
        System.out.println(a);
    }

    public static void localVariable2(){
        //System.out.println(a);

// A variable declared inside the body of the method is called local variable. You can use this variable
// only within that method and the other methods in the class aren't even aware that the variable exists.
        //A local variable cannot be defined with "static" keyword.
    }
}
