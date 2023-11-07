package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {

        return args.stream().map(Integer::parseInt).allMatch(n -> n > 0);
    }
}