package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        try {
            return Double.parseDouble(str) > 0;

        } catch (NullPointerException e) {
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
