package randomPrograms;

public class reverseString {

    public static void main(String[] args) {
        String name = "Tajamul";
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.reverse();
        System.out.println("Reverse String logic using StringBuilder" + sb);
        int index = 5;
        char character5 = name.charAt(index);
        //The char keyword is a data type that is used to store a single character.
        System.out.println("finding specific character from string based on index" + character5);
    }

}
