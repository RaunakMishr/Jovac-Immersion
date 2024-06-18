package Day4;

public class sumOfDigitsOfANumber {
    static int digit = 0;
    static int sum = 0;
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int n){
        if(n == 0) return sum;
        int digit = sumOfDigits(n%10);
        
        sum = sum + digit;
        sumOfDigits(n/2);
        return sum;
    }
     
    //call should be recurssive and converging to the base contdition
    //it should call itself and it should have a base condition

    //tail recursive functions can be optimised 



}


