package com.example

import spock.lang.Specification

class SomeCodeTest extends Specification {

    def "与えられたコードに対するバリデーション結果が返る"() {
        expect:
        new SomeCode(コード).validate() == バリデーション結果

        where:
        コード   | バリデーション結果
        null   | true
        ""     | true
        "C01"  | true
        "C001" | false
        "A01"  | false
    }

}