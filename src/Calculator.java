// This is a calculator
public class Calculator {

//  If dividing or using modulo by zero
    public void invalidInput() {
        throw new IllegalArgumentException("Invalid Argument: Cannot divide by 0");
    }

    public int add(int value1, int value2) {
        return value1 + value2;
    }

    public int subtract(int value1, int value2) {
        return value1 - value2;
    }

    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public int divide(int value1, int value2) {
        if(value2 == 0) {
            invalidInput();
        }
        return value1 / value2;
    }

    public int modulo(int value1, int value2) {
        if(value2 == 0) {
            invalidInput();
        }
        return value1 % value2;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Droid firstDroid = new Droid("Codey");
        Droid secondDroid = new Droid("R2D2");
//        System.out.println(myCalculator.add(5, 7));
//        System.out.println(myCalculator.subtract(45, 11));
//        System.out.println(myCalculator.divide(45, 0));
        System.out.println(firstDroid);
        firstDroid.performTask("Rebooting");
        firstDroid.performTask("Uploading");
        firstDroid.performTask("Waiting...");
        firstDroid.batteryReport();

        firstDroid.energyTransfer(secondDroid, 30);
    }
}