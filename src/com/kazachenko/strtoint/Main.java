package com.kazachenko.strtoint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "  -4815 ABC 162342";
        Integer num = stringToInteger(text);
        System.out.println(num);
    }

    private static Integer stringToInteger(String text) {
        String regex = "[-+]?\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        String result;
        if (matcher.find()) {
            result = matcher.group();
        } else {
            result = "0";
        }
        return Integer.valueOf(result);
    }
}
