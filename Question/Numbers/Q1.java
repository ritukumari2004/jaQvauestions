

public class Q1 {
    public static void main(String[] args) {
        int num1 = 36, num2 = 60, hcf;

        hcf = getHCF (num1, num2);
        System.out.println ("The HCF: " + hcf);
}

// This method improves complexity of repeated substraction
// By efficient use of modulo operator in euclidean algorithm
static int getHCF (int a, int b)
{
    return b == 0 ? a : getHCF (b, a % b);
    }
    
}
