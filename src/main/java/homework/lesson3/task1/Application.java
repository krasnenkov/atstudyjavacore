package homework.lesson3.task1;

public class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.summ(4, 2));
        System.out.println(calc.substract(5, 3));
        System.out.println(calc.multiply(2, 6));
        System.out.println(calc.divide(5, 3));
    }

}
