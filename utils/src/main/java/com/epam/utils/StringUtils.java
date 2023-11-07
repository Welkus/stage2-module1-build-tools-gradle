package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            return args.stream().map(Double::parseDouble).allMatch(n -> n > 0);

        } catch (NullPointerException e) {
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
