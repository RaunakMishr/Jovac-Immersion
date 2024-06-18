package Day4;

public class factorial {
    public static void main(String[] args) {
        printFact(1, 5, 1);
    }
    private static void printFact(int i, int n, int fact){
        if(i == n){
            fact *=i;
            System.out.println(fact);
            return;
        }
        fact *=i;
        printFact(i+1, n, fact);
    }
}
