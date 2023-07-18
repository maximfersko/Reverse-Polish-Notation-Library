package com.fersko.reversePolishNotation;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReversePolishNotationTest {

    @Test
    public void firstSuiteRPN() {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation( "8 * 23456 - ( ( ( ( ( ( ( ( ( ( 8 * ( 2 + 2 ) ) - 3 ) ) - 3 ) * 2 ) - 100 ) - 1 ) / 10 ) ) * 10 )"
        );
        assertEquals(187697., reversePolishNotation.getResult(), 0.001);
    }

    @Test
    public void secondSuiteRPN() {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation( "(15 / ( 7 - ( 1 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) * 15 / ( 7 - ( 200 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) * ( 15 / ( 7 - ( 1 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) +  15 / ( 7 - ( 1 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) ) * 100.072165)"
        );
        assertEquals(-3993., Math.round(reversePolishNotation.getResult()), 0.001);
    }

}
