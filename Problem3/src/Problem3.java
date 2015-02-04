import java.util.ArrayList;
import java.util.List;

/**
 * Created by SixDays on 2/4/15.
 */
public class Problem3 {
    public static void main(String[] args) {
        long num = 600851475143L;
        long divider = 2;
        List<Long> factors = new ArrayList<>();

        while (num > 1) {
            while ((num % divider) == 0) {
                factors.add(divider);
                num /= divider;
            }
            divider++;
        }
        System.out.println(factors.toString());
    }
}
