package loops1;

public class LoopHomeWork {
    public static void main(String[] args) {
        LoopHomeWork loops = new LoopHomeWork();
        loops.countSummary(1, 3);

    }

    public void countSummary(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; ++i)
        {
            sum += i;
        }
            System.out.println("The result is " + sum);
        }
 }






