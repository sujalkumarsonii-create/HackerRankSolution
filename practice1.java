import java.util.*;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        int[] frequency = new int[101];
        int maxLength = 0;
        for(int i : a){
            frequency[i]++;
        }
        for(int i = 1; i <= 100; i++){
            maxLength = Math.max(maxLength, frequency[i] + frequency[i - 1]);
        }
        return maxLength;
    }

}
public class practice1 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(5);
        a.add(5);
        System.out.println(Result.pickingNumbers(a));
    }
}
