package Day4;

public class Nto1 {
    public static void main(String[] args) {
        int n = 20;
        print(n);
    }
    public static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println(n+" ");
        print(n-1);
    }
}
