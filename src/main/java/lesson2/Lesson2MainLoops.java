package lesson2;

public class Lesson2MainLoops {
    public static void main(String[] args) {
        Lesson2MainLoops loops = new Lesson2MainLoops();
        //   loops.countNumbers(1);
        //  loops.countNumbers();
        //   loops.numberTemplets(9);
        loops.love7(7, 4);
        loops.love7(4, 1);
        loops.love7(2, 5);
    }

    public void countNumbers(int i) {
        while (i <= 100) {

            System.out.println(i);
            i = i + 1;
        }

    }

    public void countNumbers() {
        for (int i = 1; i <= 100; i++) {

            System.out.println(i);
        }
    }

    public void numberTemplets(int rows) {
        for (int i = 1; i <= rows; i++) {
//            if(i % 2== 0){
//                continue;
//            }
            if (i == 7) {
                break;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
    //1
    //1 2
    ///1 2 3
    ///1 2 3 4


    public void love7(int a, int b) {
        if (a == 7 || b == 7 || a + b == 7) {
            System.out.println("love 7 " + a + "," + b + true);
        } else {
            System.out.println("love 7 " + a + "," + b + false);
        }
    }
}










