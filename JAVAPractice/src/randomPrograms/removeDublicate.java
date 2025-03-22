package randomPrograms;


import java.util.ArrayList;
import java.util.HashSet;



public class removeDublicate {


    public static void main(String[] args) {
        removeduplicates();

    }

    public static void removeduplicates(){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(1);
        ar.add(2);

        //for(Object ob:ar)
            System.out.println("with duplicates "+ ar);


        HashSet<Integer> se = new HashSet<Integer>(ar);
        //for(Object ob:se)
            System.out.println("after removing duplicates " +se);

    }
//    public static void reverseTheinteger(){
//        int input;
//        input = 123;
//        int rminder;
//        while (input !=0){
//            rminder=input%10;
//
//        }
//
//        System.out.println("enter no" );
//    }
}
