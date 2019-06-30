package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        System.out.println(" Sum a<b " + sumOfNumbers.GetSum(-1, 0));
        System.out.println(" Sum a>b " + sumOfNumbers.GetSum(0, -1));

    }
}
