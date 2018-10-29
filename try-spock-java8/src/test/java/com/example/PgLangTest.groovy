package com.example

import spock.lang.Specification

class PgLangTest extends Specification {

    def "与えられたプログラミング言語の中から探索ワードを含む言語のみ返す"() {
        expect:
        PgLang.findMatchWords(プログラミング言語群, 探索ワード) == 結果群

        where:
        プログラミング言語群              | 探索ワード  | 結果群
        ["Java", "C++", "Go", "C"]    | "C"      | ["C++", "C"]
        ["Ruby", "Elixir", "Python"]  | "y"      | ["Ruby", "Python"]
        ["Scala", "Groovy", "Kotlin"] | "oo"     | ["Groovy"]
        null                          | "J"      | null
        ["C#", "JavaScript"]          | null     | null
        ["PHP", "Closure", "Lisp"]    | ""       | ["PHP", "Closure", "Lisp"]
    }

}
