package jhtp.chapter14;

import java.util.Scanner;

public class indexingString{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter text");
        String text = sc.nextLine();

        
        // System.out.println("please enter char");
        // char c = sc.nextLine().charAt(0);

        // System.out.println("the searched char present in source string "+ getIndex(text,c) + " number of times");
        // System.out.println();

        print(getRepeatedTimes(text, 65), 65);
        System.out.println();
        print(getRepeatedTimes(text, 97), 97);
        sc.close();
    }

    public static int getIndex(String text, int c){

        String temp = text;
        int counter = 0;
        while(temp.indexOf(c) != -1){
            temp = temp.substring(temp.indexOf(c) + 1);
            counter++;
            if(temp.indexOf(c) == -1){
                break;
            }
        }
        return counter;
    }


    public static int[] getRepeatedTimes(String text, int alphapet){
        int[] arr = new int[26];
        
        for(int i = 0; i < 26; i++){
            arr[i] = getIndex(text, alphapet++);
        }
        return arr;
    }

    public static void print(int[] arr, int alphapet){
        for(int i = 0; i < 26; i++){
            System.out.println("letter " + (char)alphapet++ + " was repeated " + arr[i] + " times");
        }
    }
}