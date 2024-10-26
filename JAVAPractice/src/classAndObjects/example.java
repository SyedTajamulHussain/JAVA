package classAndObjects;

public class example {
    static exampleTwo useData = new exampleTwo();

    public static void main (String args[]){
        getdataFromMethod();
        example.FetchDataThroughRefrence();
    }
    public static void getdataFromMethod(){
        exampleTwo.StudentData();
    }

    public static void FetchDataThroughRefrence(){
        useData.name1 ="Hussain";
        useData.id=1;
        System.out.println(useData.name1 + useData.id);

    }
}
