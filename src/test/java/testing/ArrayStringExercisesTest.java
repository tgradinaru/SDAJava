package testing;

import org.junit.jupiter.api.Test;
import testing.fundamentals.ArrayStringExercises;

import static org.junit.jupiter.api.Assertions.*;
//import static org.assertj.core.api.Assertions.assertThat;
// import testing.fundamentals.ArrayStringExercises;

public class ArrayStringExercisesTest {

    ////////////////////////////////////////

    @Test
    void shouldReplaceSpaceInString() {
        //Given
        String inputText = "Textul pe care il testam";
        String expectedResult = "Textul:pe:care:il:testam";
        ArrayStringExercises arrayEx = new ArrayStringExercises();
        //When
        String actualResult = arrayEx.changeSpaceInString(inputText);
        //Then
        assertEquals(expectedResult, actualResult);
    }

    /*    @Test
        void shouldAppendLength() { // DE RESCRIS
            //Given
            String inputText = "TextTestXX";
            String expectedResult = "TextTestXX10";
            ArrayStringExercises arrayEx = new ArrayStringExercises();
            //When
            String actualResult = arrayEx.appendLength(inputText);
            //Then
            //assertEquals(expectedResult, actualResult);

            //assertThat(actualResult).endsWith("10");
        }*/

    @Test
    void shouldAppendLength() {
//        Given
        String text = "Characters";
        String expectedResult = "Characters10";
        ArrayStringExercises arrayEX = new ArrayStringExercises();
//        When
        String actualResult = arrayEX.appendLength(text);
//        Then
        assertEquals(expectedResult, actualResult);
        //assertThat(actualResult).endsWith("10");
    }

    @Test
    void shouldReplaceEvenNumbers() {
        //Given
        int[] array = {1, 2, 4, 5, 6};
        int[] expectedArray = {1, 1, 2, 5, 3};
        ArrayStringExercises arrayEx = new ArrayStringExercises();
        //When
        int[] resultedArray = arrayEx.replaceEvenNumbers(array);
        //Then
        assertArrayEquals(expectedArray, resultedArray);
    }

    //Finds the position of the min element from the array (if they are multiple elements,
    // the last position, if there aren’t => return -1)
    @Test
    void shoulFindMinElement() {
        //Given
        int[] array = {2, 4, 56, 43, 1, 9, 10};
        int expectedResult = 4;
        ArrayStringExercises arrayEx = new ArrayStringExercises();
        //When
        int actualResult = arrayEx.findMinPositionElement(array);
        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnDefaultValueForEmptyArray() {
        //Given
        int[] array = {};
        int expectedResult = -1;
        ArrayStringExercises arrayStringExercises = new ArrayStringExercises();

        //When
        int actualResult = arrayStringExercises.findMinPositionElement(array);

        //Then
        assertEquals(expectedResult, actualResult);
    }


//TDD TDD TDD


///////////////////////////////////////
}