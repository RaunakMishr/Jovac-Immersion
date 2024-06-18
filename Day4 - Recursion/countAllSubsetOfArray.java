package Day4;
//write a program to count all the subsets of an array using recursion
public class countAllSubsetOfArray {
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
    public static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //to be in new String
        subsequences(str, idx+1, newString+currChar);

        //not to be new String
        subsequences(str, idx+1, newString);
    }
}
