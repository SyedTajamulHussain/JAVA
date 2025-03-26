package randomPrograms;

public class IfElseExample {
    public static void main(String[] args) {
        ifElse();
    }
    public static void ifElse(){
        Integer rollNumber = -1;
        if (rollNumber > 5){
            System.out.println("Pass");
        } else if (rollNumber > 2) {
            System.out.println("Fail");
        } else if (rollNumber == 1) {

            System.out.println("no result");
        }
        else{
            System.out.println("Go to hell");
        }

    }
}
