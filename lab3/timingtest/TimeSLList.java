package timingtest;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        SLList<Integer> N = new SLList<>();
        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = new AList<>();

        int ops = 10000;
        int[] testSizes = {1000, 2000, 4000, 8000, 16000, 32000, 64000, 128000};

        for (int size: testSizes) {
            for (int i = 0; i < size; i ++) {
                N.addLast(i);
            }
            Stopwatch sw = new Stopwatch();
            for (int j = 0; j < ops; j++) {
                N.getLast();
            }

            double time = sw.elapsedTime();

            Ns.addLast(size);
            times.addLast(time);
            opCounts.addLast(ops);
        }
        printTimingTable(Ns, times, opCounts);
    }

}
