package de.hrw.progra2.assignment3;

import java.util.Arrays;

public class MiddleCharacter {

    public static String middleCharacter(String string){
        if (string.length() < 3){
            return "theres no middle charakter in given string";
        }

        else if (string.length() % 2 == 0){
            return (String.valueOf(string.charAt((string.length() / 2) - 1)) + String.valueOf(string.charAt(string.length() / 2)));
        }

        else{
            return String.valueOf(string.charAt(string.length() / 2));
        }

    }


    public static String middleCharacter(char[] array){
        return middleCharacter(new String(array));
    }

    public static void main(String[] args) {
        System.out.println(middleCharacter("Ka"));
        char[] array = {'K', 'a', 'u', 's', 'a', 'r'};
        System.out.println(middleCharacter(array));
    }
}
