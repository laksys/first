package in.laksys;

import java.util.stream.IntStream;

public class App {
    public static int gcd(int m, int n){
        if( n == 0)
            return m;
        else
            return gcd(n, m%n);
    }
    public static boolean isPrime(int num){
        return num > 1 &&
                IntStream.rangeClosed(2, num/2)
                        .noneMatch(e-> num % e == 0);
    }
    public static boolean isPerfect(int num){
        return num == IntStream.range(1,num)
                .filter(e-> num % e == 0)
                .sum();
    }
    public static boolean isArmstrong(int num){
        int temp = num, digit, sum=0;

        while( temp > 0 ) {
            digit = temp % 10;
            temp = temp / 10;
            sum += digit * digit * digit;
        }
        return num == sum;
    }
}
