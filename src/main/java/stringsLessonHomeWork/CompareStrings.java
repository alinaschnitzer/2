package stringsLessonHomeWork;

public class CompareStrings {

    public String expectedTxt1 = "cat";
    public String expectedTxt2 = "category";

    public static void main(String[] args) {
        CompareStrings compareStrings = new CompareStrings();
        boolean success = compareStrings.compareStrings("cat", "category");
        System.out.println(success);
        compareStrings.oneStringPartOfAnother();
    }
    public boolean compareStrings(String txt1, String txt2) {
        boolean success = true;
        if (txt1 == null || txt2 == null){
            System.out.println("Cannot compare Strings ");
        }
        else if (txt1.equals(expectedTxt1) && txt2.equals(expectedTxt2)){
            System.out.println("The Strings are equal ");
        }
        return success;
    }
    public void oneStringPartOfAnother() {
        String txt1 = "cat";
        String txt2 = "category";
        System.out.println("Cat is part of Category " + txt2.contains(txt1));
    }
}