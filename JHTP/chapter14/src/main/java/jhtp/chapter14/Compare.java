package jhtp.chapter14;

import java.util.Scanner;

public class Compare{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter first string ");
        String s1 = sc.nextLine();

        System.out.println("please enter second string ");
        String s2 = sc.nextLine();

        switch(s1.compareTo(s2)){
            case 0:
                System.out.println("s1 is equal to s2");
                break;
            case 1:
                System.out.println("s1 is gereater than s2");
                break;
            case -1:
                System.out.println("s2 is greater than s1");
                break;
            default:
                System.out.println("no case matched");
        }
        sc.close();
    }
}