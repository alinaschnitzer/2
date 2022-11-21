import module8.DaysOfWeek;
import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DaysOfWeekTest {


    @Test
    public void positiveTest() {
        int dayNumber = 5;
        String expectedResult = "Thursday";


        String actualResult = DaysOfWeek.getDay(5);
        assertEquals(expectedResult,actualResult,"Days is not correct");

    }

    @Test
    public void negativeTest() {
        int num1 = -1;
        int num2 = 10;
        String expectedResult = "The number should be equal or larger than 1";
        String expectedResult2 = "The number should be equal or smaller than 7";

        String actualResult = DaysOfWeek.getDay(-1);
        assertEquals(expectedResult, actualResult, "The number should be equal or larger than 1");

        String actualResult2 = DaysOfWeek.getDay(10);
        assertEquals(expectedResult2,actualResult2,"The number should be equal or smaller than 7");
    }



    @Test
    @DisplayName("NullPointerException")
    public void errorTest() {
        int dayNumber = 1;
        String expectedResult = "Sunday";

        assertThrows(NullPointerException.class, () -> {
            DaysOfWeek.getDay(null);
        });
    }

}

