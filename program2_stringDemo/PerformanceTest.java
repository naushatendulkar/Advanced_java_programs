/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
public class PerformanceTest {

    public static void main(String[] args) {
        // StringBuilder Performance
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("AIET");
        }
        long endBuilder = System.nanoTime();
        long durationBuilder = endBuilder - startBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // StringBuffer Performance
        long startBuffer = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sbf.append("AIET");
        }
        long endBuffer = System.nanoTime();
        long durationBuffer = endBuffer - startBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

        // Comparison Result
        if (durationBuilder < durationBuffer) {
            System.out.println("✅ StringBuilder is faster than StringBuffer.");
        } else if (durationBuilder > durationBuffer) {
            System.out.println("✅ StringBuffer is faster than StringBuilder (rare case).");
        } else {
            System.out.println("Both took the same amount of time.");
        }
    }
}
