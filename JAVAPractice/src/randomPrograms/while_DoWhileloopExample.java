package randomPrograms;

public class while_DoWhileloopExample {
    public static void main(String [] args){
        //whileLoopExample();
        DoWhileLoopExample();
    }
    public static void whileLoopExample(){
        int i = 0;
        while (i < 5){
            System.out.println("number is less then 4");
        }
    }
    public static void DoWhileLoopExample(){
        int s = 100;
        do{
            System.out.println(s);
            s--;
        }
        while (s > 1);
    }

}

