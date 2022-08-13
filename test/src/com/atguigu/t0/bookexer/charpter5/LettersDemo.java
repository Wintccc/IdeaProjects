package com.atguigu.t0.bookexer.charpter5;

/**
 * @author Wint
 * @create 2022-08-11 13:54
 */
public class LettersDemo {
    public static void main(String[] args) {

        char[] letters = new char[26];
        for (int i = 0 ; i < letters.length ; i++){
            letters[i] = (char)('a' + i);
        }
        for (int i = 0 ; i < letters.length ; i++){
            System.out.println(letters[i] + "->" + (char)(letters[i] - 32));
        }
    }
}
