
public class Main {
    public static void main(String[] args) {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation(" 3 * (99 - 10 - 100 * 100 / 2 - 1)");
        System.out.println(reversePolishNotation.getResult());
    }
}
