import java.util.*;

public class assignmentques {
    public static void main(String args[]) {
        // ques 1:

        Scanner sc = new Scanner(System.in);
        // System.out.print("enter the number: ");
        // int num = sc.nextInt();

        // if(num>0){
        // System.out.println("number is positive");
        // }
        // else if(num<0){
        // System.out.println("number is negative");
        // }
        // else{
        // System.out.println("it is equal to 0");
        // }

        // ques 2:
        // double temp = 103.5;
        // if(t e mp>1 00){
        // System.out.println("you have fever");
        // e lse{
        // System.out.println("you dont have fear");
        // }

        // ques 3:
        int weeknum = sc.nextInt();

        switch (weeknum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid weekday");
        }
    }
}
