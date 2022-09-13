package be.abis.courseadmin.util;

public abstract class StringUtils {
    public static String capitalize(String s){
        String firstLetter = s.substring(0,1);
        String rest = s.substring(1);
        return firstLetter.toUpperCase() + rest;
    }
}
