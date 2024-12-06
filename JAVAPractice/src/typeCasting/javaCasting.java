package typeCasting;

public class javaCasting {
   static int no =  9;
   static double dbl = 9.70d;
    public static void main(String[] args) {
        wideningCasting();
        narrowingCasting();

    }

    public static void narrowingCasting(){
        System.out.println("with out casting "+dbl);

        //cast it into double, this is called narrow casting
        int mydouble =(int) dbl;
        System.out.println("casting it to int " +mydouble);
    }
    public static void wideningCasting(){
     //widening Casting (automatically) - converting a smaller type to a larger type size
        double dblm = no;
        System.out.println("widening casting it to double automatically " +dblm);
    }
}
