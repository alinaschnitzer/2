package loops1.lesson4HomeWork;

import java.util.ArrayList;

public class ArraysHomeWorks {
        public ArrayList<Integer> listSquare (){
                ArrayList <Integer> num = new ArrayList<Integer>();

                num.add(1);
                num.add(2);
                num.add(3);
                num.add(6);
                num.add(8);
                num.add(-6);
                num.add(-8);
                num.add(-1);

           num.replaceAll(n -> n *n);

                return num;
        }
}