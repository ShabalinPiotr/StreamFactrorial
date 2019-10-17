
import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        System.out.println("Вы ввели число " + number);
        System.out.println("Факториал " + ffactorial(number));
    }
    public static BigInteger ffactorial (long number) {
        return LongStream.rangeClosed(1,number)
                .mapToObj(i->BigInteger.valueOf(i))
                .reduce(BigInteger.ONE,BigInteger::multiply);
    }
}
