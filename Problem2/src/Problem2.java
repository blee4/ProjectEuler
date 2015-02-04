/**
 * Created by SixDays on 2/4/15.
 */
public class Problem2 {
    public static void main(String[] args) {
        int prev = 1, curr = 2, sum = 0;

        while (curr < 4000000) {
            if ((curr % 2) == 0) {
                sum += curr;
            }
            curr = prev + curr;
            prev = curr - prev;
        }
        System.out.println(sum);
    }
}
