package de.hrw.progra2.assignment3;

public class MiddleCharacter {

    public static String middleCharacter(String string){
        if (string.length() < 3){
            return "theres no middle charakter in given string";
        }

        else if (string.length() % 2 == 0){
            return (string.charAt((string.length() / 2) - 1) + String.valueOf(string.charAt(string.length() / 2)));
        }

        else{
            return String.valueOf(string.charAt(string.length() / 2));
        }

    }


    public static String middleCharacter(char[] array){
        return middleCharacter(new String(array));
    }

    public static void main(String[] args) {

        char[] array = {'F', 'A', 'L', 'L', 'O', 'U', 'T'};
        System.out.println("Middle-character");
        System.out.println("[A]: Radioaktivität = " + middleCharacter("Radioaktivität"));
        System.out.println("[B]: Fallout = " + middleCharacter(array));
    }
}
