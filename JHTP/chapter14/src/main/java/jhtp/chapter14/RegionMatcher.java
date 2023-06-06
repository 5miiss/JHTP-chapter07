package jhtp.chapter14;

import java.util.Scanner;

public class RegionMatcher {
    
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter first string ");
        String s1 = sc.nextLine();

        System.out.println("please enter second string ");
        String s2 = sc.nextLine();

        System.out.println("please enter start index in s1 to search ");
        int startIndexS1 = sc.nextInt();
        
        System.out.println("please enter start index in s2 to search ");
        int startIndexS2 = sc.nextInt();

        System.out.println("please enter number of characters toi search ");
        int searchedChars = sc.nextInt();

       System.out.println( s1.regionMatches(true, startIndexS1, s2, startIndexS2, searchedChars));

        sc.close();
    }
}
