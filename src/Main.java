public class Main {

    public static void main(String[] args) {

        /*
        It's an easy way, but I belive you want me to control everything
        for (int i=500;i<600;i++){
            if (isPrime(i))
                System.out.println(i + " is a prime number that has 3 digits");
        }
         */

    // It's pretty bad for performance but I just wanted to show my program works on limits of Integer in Java.
    for (int i=Integer.MIN_VALUE;i<Integer.MAX_VALUE;i++){
        if (isPrime(i)&& isStartingWithFive(i) && isThreeDigits(i) && isPositive(i))
            System.out.println(i + " is a prime number, has three digits and starts with 5.");
    }
    }

    public static boolean isPrime(int number){
        for (int i=2;i<number;i++){
            if (number %i == 0)
                return false;
        }
        return true;
    }
    public static boolean isStartingWithFive(int number){
        if (String.valueOf(number).startsWith("5"))
            return true;

        return false;
    }
    public static boolean isThreeDigits(int number){
        if (number>=100 && number<=999)
            return true;

        return false;
    }
    public static boolean isPositive(int number){
        if (number >=1)
            return true;

        return false;
    }
}