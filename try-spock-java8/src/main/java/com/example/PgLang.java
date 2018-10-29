package com.example;

import java.util.List;

public class PgLang {

    public static String[] findMatchWords(List<String> pgList, String searchWord) {
        if (pgList == null) {
            return null;
        }
        if (searchWord == null) {
            return null;
        }
        return pgList.stream().filter(pg -> pg.contains(searchWord)).toArray(String[]::new);
    }

}
