class MathExamples
{   
    static double average(double a, double b)
    {
        return (a + b) /2;
    }
    
    static double average(double a, double b, double c)
    {
        return (a + b + c) /3;
    }
    
    static boolean isEven(int number)
    {
        if (number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Returns true if the input number is divisible by the input divisor.
     */
    static boolean isDivisibleBy(int number, int divisor)
    {
        if (number % divisor == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    static String coinFlip()
    {
        if (Math.random() > 0.5)
        {
            return "HEADS";
        }
        else   
        {
            return "TAILS";
        }
    }
    
    /**
     * Returns the factorial of the given number.
     * 
     * For example:
     * factorial(5) = 1 * 2 * 3 * 4 * 5
     */
    static int factorial(int number)
    {
        int product = 1;
        
        while (number > 0)
        {
            product = product * number;
            number = number - 1;
        }
        
        return product;
    }
   
    static int ageInSeconds(int years)
    {
        return years * 365 * 24 * 60 * 60;
    }
    
    static double solveHypotenuse(double a, double b)
    {
        return Math.sqrt(a*a + b*b);
    }
    
    static double squareRoot(double n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException(
            "Input must be non-negative.");
        }
        
        double guess = n;
        int counter = 0;
        
        while (guess * guess != n && counter < 20)
        {
            guess = average(guess, n / guess);
            System.out.println(guess);
            counter = counter + 1;
        }
        
        return guess;
    }
    
    
}