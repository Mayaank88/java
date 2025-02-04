import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {//in intelijidea , we can press alt+enter to convert this switch synatx into something new :)
                // case "Mango":
                // System.out.println("King of Fruits");
                // break;
                
                // case "Apple":
                // System.out.println("A sweet red fruit");
                // break;
                
                // case "Orange":
                // System.out.println("A round fruit");
                // break;    
                
                // case "Grapes":
                // System.out.println("A small fruit");
                // break;
                
                // default:
                // System.out.println("Please select a valid fruit name !!!");
                // break;
                
                

                //this is a better/cleaner way to write switch cases 
                //also break conditions are not required here.
                case "Mango" -> System.out.println("King of all fruit");
                case "Apple" -> System.out.println("A sweet red fruit");
                case "Orange" -> System.out.println("A round fruit");
                case "Grapes" -> System.out.println("A small fruit");
                default -> System.out.println("Please select a valid fruit name !!!");
        }

    }
    
}