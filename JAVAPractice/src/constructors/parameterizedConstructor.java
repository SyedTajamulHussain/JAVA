package constructors;

public class parameterizedConstructor {
    //The parameterized constructor is used to provide different values to
    // distinct objects. However, you can provide the same values also.
    String name;
    int id;
    //creating a parameterized constructor
    parameterizedConstructor(String i ,int n){
        name =i;
        id = n;
    }

    public static void main(String[] args) {
        parameterizedConstructor pc =new parameterizedConstructor("haadiya",1);
        parameterizedConstructor pc1 =new parameterizedConstructor("Sidra",2);
        parameterizedConstructor pc2 =new parameterizedConstructor("Sidra",2);
        pc.mymethod();
        pc1.mymethod();
    }

    public void mymethod(){
        System.out.println(name + "  " + id);

    }
}



