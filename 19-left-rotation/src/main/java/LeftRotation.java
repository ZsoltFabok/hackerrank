
public class LeftRotation {
    static String leftRotation(int[] array, int d) {
        StringBuilder sb = new StringBuilder();

        for (int i = d; i < array.length; i++) {
            sb.append(array[i]).append(" ");
        }

        for (int i = 0; i < d; i++) {
            sb.append(array[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
