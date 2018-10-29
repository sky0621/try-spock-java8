package com.example;

public class SomeCode {

    private String code;

    public SomeCode(String code) {
        this.code = code;
    }

    public boolean validate() {
        if (this.code == null) {
            return true;
        }
        if (this.code.equals("")) {
            return true;
        }
        if (this.code.length() != 3) {
            return false;
        }
        if (!this.code.startsWith("C")) {
            return false;
        }
        return true;
    }
}
