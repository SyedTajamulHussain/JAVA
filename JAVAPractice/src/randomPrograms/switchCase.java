package randomPrograms;

public class switchCase {
    public static void main(String[] args) {
        switchCaseExample();
    }
    public static void switchCaseExample(){
        String season = "winter";

        switch (season ) {
            case "Autum":
                System.out.println("it is autum");
                break;

            case "winter":
                System.out.println("it is winter");
                break;
            default:
                System.out.println("season does not match.");
        }
    }
}
