import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch(day){
            // case 1 -> System.out.println("Monday");
            // case 2 -> System.out.println("Tueday");
            // case 3 -> System.out.println("Wednesday");
            // case 4 -> System.out.println("Thrusday");
            // case 5 -> System.out.println("Friday");
            // case 6 -> System.out.println("Saturday");
            // case 7 -> System.out.println("Sunday");
            // default -> System.out.println("write a valid no. corresponding to a weekday");
            

            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Weekdays");
            case 6:
            case 7: System.out.println("weekends");
            default -> System.out.println("write a valid no. corresponding to a weekday");
            
            //basically the above and the below code are totally same (its just that below one is the more optimised and cleaner version of the above one)

            //printing weekdays in a much lesser code
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekends");
            default -> System.out.println("enter a valid number: ");
        }
    }
}
