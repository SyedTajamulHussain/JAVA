package constructors;

public class ConstructorPracticeProgram {
    static int Roll_Number  ;
    static int Standard  ;
    static String Subject ;
    static String Student_Name ;
    static String Result;
    //Create a constructor
    ConstructorPracticeProgram (int rn , int st, String sub, String StuName , String result) {
       Roll_Number = rn;
       Standard = st;
       Subject =sub;
       Student_Name = StuName;
       Result = result;

    }


    public static void main(String[] args) {
        ConstructorPracticeProgram st = new ConstructorPracticeProgram(25,2, "Math","Haadiya","Pass") ;
        ClassTestResults();

    }

    public static void ClassTestResults(){
       // ConstructorPracticeProgram st = new ConstructorPracticeProgram(25,2, "Math","Haadiya","Pass") ;
        System.out.println("Student roll number is  " + Roll_Number + " Student current Standard is  " + Standard + " "+Student_Name + " is purshuing " + " " +" " + Subject + " " + Student_Name + " final result is " +  Result);
    }
}
