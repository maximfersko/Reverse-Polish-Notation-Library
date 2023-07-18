package com.fersko.reversePolishNotation;


public class Main {
    public static void main(String[] args) {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation( "(15 / ( 7 - ( 1 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) * 15 / ( 7 - ( 200 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) * ( 15 / ( 7 - ( 1 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) +  15 / ( 7 - ( 1 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) ) * 100.072165)"
        );
        System.out.println(Math.round(reversePolishNotation.getResult()));
        System.out.println(new ReversePolishNotation( "x + 6", 8).getResult());
        System.out.println(new ReversePolishNotation( "cos(9)").getResult());
        System.out.println(new ReversePolishNotation( "cos(9)").getResult());
        System.out.println(new ReversePolishNotation( "8 * 23456 - ( ( ( ( ( ( ( ( ( ( 8 * ( 2 + 2 ) ) - 3 ) ) - 3 ) * 2 ) - 100 ) - 1 ) / 10 ) ) * 10 )").getResult());
    }
}
