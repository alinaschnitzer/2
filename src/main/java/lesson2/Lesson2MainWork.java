package lesson2;

public class Lesson2MainWork {
    public static void main(String[] args) {
        Lesson2MainWork loops = new Lesson2MainWork();
        //      loops.printOddEvenNumbers("The number ", 1);
       // loops.summaryTheNumber();
        loops.starTemplate();
    }

 //   public void printOddEvenNumbers(String theNumber, int i) {
   //     for (i = 1; i <= 100; i++) {
   //         if (i % 2 == 0 && i % 3 == 0) {
   //             System.out.println("The number " + i + " is divisible by two and three");
      //      } else if (i % 3 == 0) {
      //          System.out.println("The number " + i + " is divisible by three");
      //      } else if (i % 2 == 0) {
      //          System.out.println("The number " + i + " is even");
     //       } else {
     //           System.out.println("The number " + i + " is odd");
        //    }
     //   }
 //   }

 //  public void summaryTheNumber() {
   //     int a = 1;
    //    int b = 3;
      //  int sum = b*(b+1)/2 - a*(a + 1)/2 +a;
        //System.out.println("The result is " + sum);
    public void starTemplate(){
        for (int i = 7; i <0; i--){
            for (int j=0; j<=1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }




    }





