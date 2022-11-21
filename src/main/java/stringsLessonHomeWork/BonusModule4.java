package stringsLessonHomeWork;

public class BonusModule4 {
    public static void main(String[] args) {
        BonusModule4 bonus4 = new BonusModule4();
//        System.out.println(bonus4.addChars("dog"));
//        System.out.println(bonus4.addChars("red"));
//        System.out.println(bonus4.addChars("xy"));

//        System.out.println(bonus4.maxStart("max"));
//        System.out.println(bonus4.maxStart("paz"));
//        System.out.println(bonus4.maxStart("pax"));

//        System.out.println(bonus4.fizzString("fig"));
//        System.out.println(bonus4.fizzString("dib"));
//        System.out.println(bonus4.fizzString("fib"));

//        System.out.println(bonus4.bigThere("xycbibrt"));
//        System.out.println(bonus4.bigThere("b9b"));
//        System.out.println(bonus4.bigThere("bid"));

//        System.out.println(bonus4.isPlural("change"));
//        System.out.println(bonus4.isPlural("changes"));
//        System.out.println(bonus4.isPlural("dudes"));
//        System.out.println(bonus4.isPlural("magic"));

        System.out.println(bonus4.stringTimes("Hi",2));
        System.out.println(bonus4.stringTimes("Hi",3));
        System.out.println(bonus4.stringTimes("Hi",1));

    }

//    public String addChars(String text1) {
//
//        String str  = text1.charAt(text1.length() - 1) + text1 + text1.charAt(text1.length() - 1);
//        return str;
//    }


//    public boolean maxStart(String str) {
//        String str2 = "";
//        for (int i = 1; i <= 2; i++) {
//            str2 = str2 + String.valueOf(str.charAt(i));
//        }
//        if (str2.equals("ax")) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public String fizzString(String str) {
//        if (str.startsWith("f") && str.endsWith("b")) {
//            return "FizzBuzz";
//        }
//        else if (str.startsWith("f")) {
//            return "Fizz";
//        }
//        else if (str.endsWith("b")) {
//            return"Buzz";
//        }
//        return str;
//    }


//    public boolean bigThere(String txt1) {
//        boolean result = false;
//
//        int lenght = txt1.length();
//        for (int i = 0; i < lenght - 1; i++) {
//            if (txt1.charAt(i) == 'b' && txt1.charAt(i + 2) == 'b') {
//            return true;
//            }
//        }
//        return result;
//    }

//    public boolean isPlural (String txt1){
//      boolean result = false;
//       int lenght = txt1.length();
//       for (int i = 0; i< lenght; i++){
//           if (txt1.charAt(i) == 's'){
//               return true;
//           }
//       }
//        return result;
//    }


    public String stringTimes (String txt1, int n){
        String str = "";
        for ( int i =0; i<n; i++){
            str = str + txt1;
        }
        return str;
    }
}













