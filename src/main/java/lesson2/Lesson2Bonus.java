package lesson2;

public class Lesson2Bonus {
    public static void main(String[] args) {
        Lesson2Bonus bonus = new Lesson2Bonus();
        bonus.answerCell(false,false,false);
        bonus.answerCell(false,false,true);
        bonus.answerCell(true,false,false);

    }
    public void answerCell (boolean isMorning, boolean isMom, boolean isAsleep){
      if (!isMorning && !isMom && !isAsleep){
          System.out.println("answer Call "  + true);
      }
      else if (!isMorning && !isMom && isAsleep){
          System.out.println("answer Call " + false);
      }
      else if (isMorning && !isMom && !isAsleep) {
          System.out.println("answer Call " + false);
      }
       }



    }





















