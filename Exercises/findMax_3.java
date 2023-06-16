/**
 * @author yd
 */
public class findMax_3 {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int max = 0;
        for (int i : m) { // enhanced for loop
            if (i > max) {
                max = i;
            }
        }
        /*
         for (int i = 0; i < m.length; i += 1) {
         if (m[i] > max) {
         max = m[i];
         }
         }
        */
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
        System.out.println(forMax(numbers));
    }
}