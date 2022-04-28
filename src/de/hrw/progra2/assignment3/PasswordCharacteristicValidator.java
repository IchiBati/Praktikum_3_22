package de.hrw.progra2.assignment3;


import java.util.regex.*;

public class PasswordCharacteristicValidator {

    private static boolean hasLength(String password){
        return password.length() >= 12;
    }

    private static boolean hasUpperLower(String password){
        Pattern p = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])");
        Matcher m = p.matcher(password);
        return m.find();

    }

    private static boolean isMixOfAlphaNum(String password){
        Pattern p = Pattern.compile("(?=.*[0-9])");
        Matcher m = p.matcher(password);
        return m.find() && hasUpperLower(password);
    }

    private static boolean containsSpecialChar(String password){
        Pattern p = Pattern.compile("(?=.*[!@#?])");
        Matcher m = p.matcher(password);
        return m.find();
    }

    private static boolean containsNotChar(String password){
        Pattern p = Pattern.compile("(?=.*[<>])");
        Matcher m = p.matcher(password);
        return !m.find();
    }

    public static boolean isStrongPassword(String password){
        return hasLength(password)
                && hasUpperLower(password)
                && isMixOfAlphaNum(password)
                && containsSpecialChar(password)
                && containsNotChar(password);
    }





    public static void main(String[] args) {



        System.out.println("Sicheres Passwort: \"DiesesPasswortIst1sicheres!\" =  " + isStrongPassword("DiesesPasswortIst1sicheres!"));
        System.out.println("Unsicheres Passwort: \"DiesesLeiderNicht\" = " + isStrongPassword("DiesesLeiderNicht"));




    }
}
