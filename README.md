
# Reverse Polish Notation Library
The Reverse Polish Notation (RPN) library is a Java library that provides functionality for evaluating mathematical expressions in Reverse Polish Notation. This documentation provides instructions on how to build and test the library, as well as an overview of the RPN algorithm.

## Building the Project
To build the RPN library, follow these steps:

1. Ensure that you have Java Development Kit (JDK) 8 or higher installed on your system.

2. Download the source code of the RPN library.

3. Open a terminal or command prompt and navigate to the project's root directory.

4. Execute the following command to build the project using Maven:

 ``` bash
mvn package
```

This command will compile the source code, run the tests, and package the library into a JAR file.

5. The built JAR file will be located in the target directory with the name Reverse-Polish-Notation-1.0.jar.

## Testing the Library

    The RPN library includes a set of unit tests to ensure the correctness of its functionality. To run the tests, follow these steps:

1. Ensure that you have built the project as described in the previous section.

2. Open a terminal or command prompt and navigate to the project's root directory.

3. Execute the following command to run the tests using Maven:

```bash
mvn test
```
Maven will execute the tests and provide the test results in the terminal.

    Note: The tests use JUnit 3.8.2 for the assertions.

## Reverse Polish Notation Algorithm
The Reverse Polish Notation (RPN) is a mathematical notation in which every operator follows all of its operands. The RPN algorithm eliminates the need for parentheses in mathematical expressions by representing them in postfix notation.

The RPN algorithm implemented in this library consists of the following steps:

1. Split the input mathematical expression into tokens, such as numbers, operators, and parentheses.

2. Convert the expression from infix notation to postfix notation, also known as Reverse Polish Notation. The algorithm uses a stack to convert the expression by following these rules:

* If a token is a number or variable, append it to the output. 
* If a token is an operator, push it onto the stack if its precedence is higher than the precedence of the top operator on the stack. If the precedence is lower or equal, pop operators from the stack and append them to the output until a lower precedence operator is encountered or the stack is empty. Then push the current operator onto the stack.
* If a token is an opening parenthesis, push it onto the stack.
* If a token is a closing parenthesis, pop operators from the stack and append them to the output until an opening parenthesis is encountered. Discard both parentheses.
* After all tokens are processed, pop any remaining operators from the stack and append them to the output.
3. Evaluate the postfix expression using a stack. Iterate through the tokens in the postfix expression and perform the following steps:

* If a token is a number, push it onto the stack.
* If a token is a variable, push its corresponding value onto the stack.
* If a token is a unary operator, pop one operand from the stack, apply the operator, and push the result back onto the stack.
* If a token is a binary operator, pop two operands from the stack, apply the operator, and push the result back onto the stack.
* After all tokens are processed, the result will be the value remaining on the stack.
* 
The RPN library provides the `ReversePolishNotation` class, which accepts a mathematical expression in infix notation and evaluates it using the RPN algorithm. The library supports various operators and functions, such as addition, subtraction, multiplication, division, exponentiation, trigonometric functions, logarithms, square roots, and more.

## Example Usage
To use the RPN library in your Java project, follow these steps:

1. Add the RPN library JAR file to your project's dependencies.

2. Import the necessary classes from the RPN library.

3. Create an instance of the ReversePolishNotation class, providing the mathematical expression as a parameter.

4. Call the getResult() method to evaluate the expression and obtain the result.

```java
import com.fersko.reversePolishNotation.ReversePolishNotation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result: " + new ReversePolishNotation("2 3 +").getResult());
    }
}
```
In this example, the RPN library evaluates the expression "2 + 3" and prints the result, which is 5.

Conclusion
The Reverse Polish Notation (RPN) library provides a convenient way to evaluate mathematical expressions using the RPN algorithm. By following the instructions in this documentation, you can easily build and test the library in your Java projects. The library supports various operators and functions, making it suitable for a wide range of mathematical calculations.