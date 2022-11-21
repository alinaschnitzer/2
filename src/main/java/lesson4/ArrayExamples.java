package lesson4;

import java.util.*;

public class ArrayExamples {
    public void stringsArray() {
        String[] buttons = {"OK", "Cancel", "Login", "SingUp"};
        //       buttons[4] = "Exit";
        int length = buttons.length;
//        System.out.println(buttons[2]);
//        System.out.println("length: " + length);
//         for(int i = 0; i<buttons.length; i++){
//            System.out.println(buttons[i]);
//         }
        for (String button : buttons) {
            System.out.println(button);
        }
    }

    public void stringArrayWithSize() {
        String[] array = new String[5];
        array[0] = "OK";
        array[1] = "Cancel";
        array[2] = "Login";
        array[3] = "SighUp";
        array[4] = "Exit";
        System.out.println("length: " + array.length);
    }

    public void integersArray() {
        int[] id = {12, 3, 5, 8};
        System.out.println(id[2]);

    }
    public void arrayListExample() {
        ArrayList<String> buttons = new ArrayList<>();
        buttons.add("Ok");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("Exit");

        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i));
        }
    }
       


//        for (String button : buttons) {
//            System.out.println(button);
//        }
//        System.out.println("The size of the list " + buttons.size());
//
//        buttons.add("SighUp");
//        for (String button : buttons) {
//            System.out.println(button);
//        }
//        buttons.remove("Exit");
//        System.out.println();
//        for (String button : buttons) {
//            System.out.println(button);
//        }
//
//        buttons.clear();
//        System.out.println(buttons.size());
//    }

        public void arrayListSortingExample(){
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(123);
            arrayList.add(1);
            arrayList.add(23);
            arrayList.add(98);

            Collections.sort(arrayList);

            for (Integer i: arrayList){
                System.out.println(i);
            }
        }

        public void hashMapExamples(){
            HashMap<String,String> hashMap = new HashMap<String,String>();
            hashMap.put("John", "Toronto");
            hashMap.put("Kate", "Moscow");
            hashMap.put("Moshe", "Tel-Aviv");
            hashMap.put("Moshe", "Jerusalem");
            System.out.println(hashMap);


            System.out.println(hashMap.get("Moshe"));

            hashMap.remove("John");

            System.out.println(hashMap.size());

        }
        public void hashSetExample(){
            HashSet<String> hashSet= new HashSet<>();
            hashSet.add("John");
            hashSet.add("Kate");
            hashSet.add("Moshe");

            System.out.println(hashSet);

            List<String> list = new ArrayList<String>(hashSet);
            Collections.sort(list);
            System.out.println(list);
        }




    }


