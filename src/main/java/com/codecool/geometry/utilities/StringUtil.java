package com.codecool.geometry.utilities;

public class StringUtil {
    public static String center(String text, int len) {
        if (len <= text.length())
            return text.substring(0, len);
        int before = (len - text.length()) / 2;
        if (before == 0)
            return String.format("%-" + len + "s", text);
        int rest = len - before;
        return String.format("%" + before + "s%-" + rest + "s", "", text);
    }
}
