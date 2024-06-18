package Day4;

import java.util.ArrayList;

public class AllSubsetsOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
        //basecase
        if(n == 0){
            printSubset(subset);
            return;
        }
        
        //addhoga
        subset.add(n);
        findSubsets(n-1, subset);

        //add nhi hoga
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }
    public static void printSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

}
