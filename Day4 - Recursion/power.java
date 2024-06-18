package Day4;

public class power {
    static int mod=(int)1e9+7;
    public static void main(String[] args) {
        long n = 3;
        long m = 3;
        System.out.println(pow(n,m));
    }
    // public static int Power(int n, int m){
    //     if(m == 0) return 1;
    //     if(n== 0) return 0;
    //     int half = Power(n, m/2);
    //     int full = half* half;
    //     if(m % 2 == 0){
    //         return full;
    //     }

    //     else{
    //         return n * full;
    //     }
    // }
    
    public static long pow(long a,long b){
        if(b==0){
            return 1;
        }
        long temp=pow(a,b/2);
        if(b%2==0){
            return (temp*temp)%mod;
        }
        else{
            return (a *temp*temp)%mod;
        }
    }
}
