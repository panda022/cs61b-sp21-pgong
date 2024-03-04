package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
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
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = Ns;

//        //for N = 1000,100-900
//        AList<Integer> aList1 = new AList<>();
//        for (int i = 0; i < 900; i++) {
//            aList1.addLast(i);
//        }
//        //for N = 1000, addLast
//        Ns.addLast(1000);
//        Stopwatch sw = new Stopwatch();
//        aList1.addLast(1);
//        double timeInSeconds = sw.elapsedTime();
//        times.addLast(timeInSeconds);
//        int[] numbers = new int[] {1000, 2000,4000,8000,16000,32000,64000,128000,2000000,4000000,6000000,8000000,10000000};
        int[] numbers = new int[] {1000, 2000,4000,8000,16000,32000,64000,128000};
        for (int num : numbers) {
            helpTimeAListConstruction(Ns,  times, opCounts,num);
        }
        printTimingTable(Ns,  times, opCounts);

    }
    public static void helpTimeAListConstruction(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts,int number){
        //for N = 1000,100-900
        AList<Integer> aList = new AList<>();
        Ns.addLast(number);
        Stopwatch sw = new Stopwatch();
        for (int i = 0; i < number; i++) {
            aList.addLast(i);
        }
        double timeInSeconds = sw.elapsedTime();
        times.addLast(timeInSeconds);
    }

}
