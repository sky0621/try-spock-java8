package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SomeCodeJUnitTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // コード、バリデーション結果
                {null, true},
                {"", true},
                {"C01", true},
                {"C001", false},
                {"A01", false},
        });
    }

    private String コード;
    private boolean バリデーション結果;

    public SomeCodeJUnitTest(String コード, boolean バリデーション結果) {
        this.コード = コード;
        this.バリデーション結果 = バリデーション結果;
    }

    @Test
    public void 与えられたコードに対するバリデーション結果が返る() {
        assertEquals(this.バリデーション結果, new SomeCode(this.コード).validate());
    }

}
