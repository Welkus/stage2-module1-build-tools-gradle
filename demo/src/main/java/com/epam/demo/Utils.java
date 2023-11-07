package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {

        try {
            return args.stream().map(Double::parseDouble).allMatch(n -> n > 0);

        } catch (NullPointerException e) {
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}