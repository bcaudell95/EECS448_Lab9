public class Model {
    public enum Operation {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, NULL
    }

    public static Operation currentOperation = Operation.NULL;
    public static double solution = 0;
    private static double previousSolution = 0;

    private static double firstNumber;
    private static double secondNumber;

    public static double calculate(double firstReceivedNumber, double secondReceivedNumber) throws Exception {
        previousSolution = solution;
        firstNumber = firstReceivedNumber;
        secondNumber = secondReceivedNumber;

        switch (currentOperation) {
            case ADDITION:
                add();
                break;
            case SUBTRACTION:
                subtract();
                break;
            case MULTIPLICATION:
                multiply();
                break;
            case DIVISION:
                divide();
                break;
            case NULL:
                throw new Exception("No Operation Selected");
        }
        return solution;
    }

    private static void divide() throws Exception {
        if(secondNumber == 0) {
            throw new Exception("Cannot divide by 0.");
        } else {
            solution = firstNumber / secondNumber;
        }
    }

    private static void multiply() {
        solution = firstNumber * secondNumber;
    }

    private static void subtract() {
        solution = firstNumber - secondNumber;
    }

    private static void add() {
        solution = firstNumber + secondNumber;
    }
}
