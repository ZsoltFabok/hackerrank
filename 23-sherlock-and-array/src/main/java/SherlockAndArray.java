import java.util.List;


public class SherlockAndArray {

    static String balancedSums(List<Integer> args) {
        int sum = 0;
        for (Integer arg : args) {
            sum += arg;
        }

        int curr = 0;
        for (Integer arg : args) {
            if (curr == sum - arg - curr) {
                return "YES";
            }
            curr += arg;
        }
        return "NO";
    }
}
