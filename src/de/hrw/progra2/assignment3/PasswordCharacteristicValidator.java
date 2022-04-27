package de.hrw.progra2.assignment3;

import java.lang.management.GarbageCollectorMXBean;
import java.nio.charset.StandardCharsets;
import java.util.regex.*;

public class PasswordCharacteristicValidator {

    public static boolean isStrong(String password){
        return
    }

    private static boolean hasLength(String password){
        return password.length() == 12;
    }

    private static boolean hasUpperLower(String password){
        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(password);

    }

    public static void main(String[] args) {
        
    }
}
