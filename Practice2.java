import java.io.IOException;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    // Write your code here
        long countA = 0;
        long nLetter = n % s.length();
        long repeatTillN = n / s.length();
        for(char c : s.toCharArray()){
            if( c == 'a'){
                countA++;
            }
        }
        countA *= repeatTillN;
        
        for(int i = 0; i < nLetter; i++){
            if( s.charAt(i) == 'a'){
                countA++;
            }
        }
        
        return countA;
    }

}
public class Practice2 {
    public static void main(String[] args) throws IOException {
        String s = "aba";
        System.out.println(Result.repeatedString(s, 10));
    }
}
