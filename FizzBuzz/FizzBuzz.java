public class FizzBuzz {
    public void fizzBuzz(int number) {
        if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 15 == 0)
            System.out.println("FizzBuzz");
    }
}