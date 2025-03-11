package Chap7.override;

public class CalculatorEx {
    public static void main(String[] args){
        double r = 3;

        Calculator calculator = new Calculator();
        double area = calculator.areaCircle(r);
        System.out.println(area);
        System.out.println();

        Computer computer = new Computer();
        double area2 = computer.areaCircle(r);
        System.out.println(area2);
    }
}
