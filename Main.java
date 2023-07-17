
public class Main {
    public static void main(String[] args) {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation( "(15 / ( 7 - ( 1 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) * 15 / ( 7 - ( 200 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) * ( 15 / ( 7 - ( 1 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) +  15 / ( 7 - ( 1 + 1 ) ) * 3 - ( 2 + ( 1 + 1 ) ) ) * 100.072165)"
        );
        System.out.println(reversePolishNotation.getResult());
        System.out.println(new ReversePolishNotation( "x + 6", 8).getResult());
    }
}
