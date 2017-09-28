package test;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test regarding the Ascending Minima Algorithm implementation.
 */

public class AscendingMinimaTest
        extends TestCase {

    /**
     * Testing the first step of the Ascending Minima Algorithm.
     * @throws Exception
     */
    public void testFirstStep() throws Exception {

        int[] ar = new int[]{1,2,5,7,8,9};

        for (int i = 0; i < ar.length; i++) {

            assertEquals(ar[i], AscendingMinima.firstStep(new ArrayList<Integer>(Arrays.asList(1, 3, 3, 2, 5, 8, 7, 8, 9))).get(i));

        }

    }

    /**
     * Test if the elements that are being removed from the initial array
     * are correctly removed.
     * @throws Exception
     */
    public void testRemoveElements() throws Exception {

        //First test, @ar and @list have the same first element but it
        //appears only one time (index 0).

        int[] ar = new int[]{2, 3, 4, 5};

        for (int i = 0; i < ar.length; i++) {

            assertEquals(ar[i], AscendingMinima.removeElements(new ArrayList<Integer>(Arrays.asList(1, 5, 8, 14, 25)),new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))).get(i));

        }

        //First test, @ar and @list have the same first element but it
        //appears more than one time.

        ar = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < ar.length; i++) {

            assertEquals(ar[i], AscendingMinima.removeElements(new ArrayList<Integer>(Arrays.asList(1, 1, 8, 14, 25)),new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))).get(i));

        }

    }

    /**
     * Testing about the placement of the new element.
     * @throws Exception
     */
    public void testPlaceNewElement() throws Exception {

        //First place a value that is greater than some and less than
        //some other values.

        int[] ar = new int[]{1, 2, 5, 6};

        for (int i = 0; i < ar.length; i++) {

            assertEquals(ar[i], AscendingMinima.placeNewElement(new ArrayList<Integer>(Arrays.asList(1, 2, 5, 7, 8, 9)),6).get(i));

        }

        //Place a value that is the greatest of all.

        ar = new int[]{1, 2, 5, 7, 8, 9, 10};

        for (int i = 0; i < ar.length; i++) {

            assertEquals(ar[i], AscendingMinima.placeNewElement(new ArrayList<Integer>(Arrays.asList(1, 2, 5, 7, 8, 9)),10).get(i));

        }

        //Place a value that is the smaller one.

        ar = new int[]{0};

        for (int i = 0; i < ar.length; i++) {

            assertEquals(ar[i], AscendingMinima.placeNewElement(new ArrayList<Integer>(Arrays.asList(1, 2, 5, 7, 8, 9)),0).get(i));

        }

    }

    /**
     * Test if the remaining elements from the difference between the
     * array size and the window size, are correct.
     * @throws Exception
     */
    public void testRemainingElements() throws Exception {

        int[] ar = new int[]{7, 8, 9};

        for (int i = 0; i < ar.length; i++) {

            assertEquals(ar[i], AscendingMinima.remainingElements(new ArrayList<Integer>(Arrays.asList(1, 2, 5, 7, 8, 9)),3).get(i));

        }
    }

    /**
     * Test the total Ascending Minima Algorithm.
     * @throws Exception
     */

    public void testAscendingMinimaAlgorithm() throws Exception {

        int[] ar = new int[]{1, 4};

        for (int i = 0; i < ar.length; i++) {

            assertEquals(ar[i], AscendingMinima.ascendingMinimaAlgorithm(new ArrayList<Integer>(Arrays.asList(2, 6, 7, 3, 1, 9, 8, 16, 23, 4)),3).get(i));

        }

    }

}
