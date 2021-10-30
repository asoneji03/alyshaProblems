package com.sg.dateTimeAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {

        String input1 = "natfzg";
        String input2 = "natfGZ";
        Boolean isAnagram = anagramCheck(input1, input2);
        System.out.println("Strings are anagrams: " + isAnagram);

    }

    public static Boolean anagramCheck(String str1, String str2) {

        Boolean output = true;

        if (str1.length() != str2.length() || str1.equals(str2)) {
            output = false;
        } else {
            HashMap<String, Integer> lettersInput1 = traverseString(str1);
            HashMap<String, Integer> lettersInput2 = traverseString(str2);
            if (!(lettersInput1.equals(lettersInput2))) {
                output = false;
            }
        }
        return output;
    }

    public static HashMap<String, Integer> traverseString(String str){
        HashMap <String, Integer> map1 = new HashMap<String, Integer>();

        //variable to track total count of letter at given index
        int countOfChar = 0;
        for (int i = 0; i < str.length(); i++) {
            String currentChar = String.valueOf(str.charAt(i)).toUpperCase();
            if(!(map1.containsKey(currentChar))){
                map1.put(currentChar, 1);
            }else{
                countOfChar = map1.get(currentChar)+1;
                map1.put(currentChar, countOfChar);
            }

        }
        return map1;
    }
}
