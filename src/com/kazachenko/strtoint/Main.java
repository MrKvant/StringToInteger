package com.kazachenko.strtoint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text;
        try {
            text = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing parameter");
            return;
        }
        Integer num = stringToInteger(text);
        System.out.println(num);
    }

    private static Integer stringToInteger(String text) {
        String regex = "^\\s*[-+]?\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        String result = matcher.find() ? matcher.group() : "0";
        try {
            return Integer.valueOf(result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
