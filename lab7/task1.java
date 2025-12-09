
public class CalculatorTask {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of two doubles : " + calc.add(5.5, 2.3));
        System.out.println("Addition of three integers: " + calc.add(3, 7, 9));
    }
}

class Calculator {
 
    int add(int a, int b) {
        return a + b;
    }

 
    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
