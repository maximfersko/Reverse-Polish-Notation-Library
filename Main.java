
public class Main {
    public static void main(String[] args) {
        // ReversePolishNotation reversePolishNotation = new ReversePolishNotation("(7+99-88)^2*cos(x)");

        ReversePolishNotation reversePolishNotation = new ReversePolishNotation("99 - 10 - 100 * 100 / 2");
        System.out.println(reversePolishNotation.getResult());
    }
}
