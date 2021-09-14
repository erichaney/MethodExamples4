class Fraction
{
    int n;
    int d;
    
    Fraction(int n, int d)
    {
        this.n = n;
        this.d = d;
        
        if (d == 0)
        {
            throw new IllegalArgumentException(
            "The denominator cannot be zero.");
        }
    }
}