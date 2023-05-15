package com.chapter07.leetcode;

public class Solution {
    public String mergeAlternately(String word1, String word2) {

            int length1 = word1.length();
            int length2 = word2.length();
            String newString = "";
            if (length1 == length2)
            {
                for (int i = 0; i < length1; i++) {
                    char c = word1.charAt(i);
                    char c1 =word2.charAt(i);
                    newString += String.valueOf(c) +String.valueOf(c1);
                }
                return newString;
            }
            else if(length1 > length2)
            {
                
                 for (int i = 0; i < length1; i++) {
                    if(i < length2)
                     newString += String.valueOf(word1.charAt(i))+String.valueOf(word2.charAt(i));

                    newString += String.valueOf(word1.charAt(i));
                }
                return newString;

            }
            else if(length1 < length2)
            {
                
                 for (int i = 0; i < length2; i++) {
                    if(i < length1)
                     newString += String.valueOf(word1.charAt(i))+String.valueOf(word2.charAt(i));

                    newString += String.valueOf(word2.charAt(i));
                }
                return newString;

            }
            return newString;

            }
}
