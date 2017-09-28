package test;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Unit tests for finding min, max, mean and median values of arrays and
 * ArrayLists.
 */
public class AppTest 
    extends TestCase
{

    /**
     * This method is used about testing, on finding maximum value of an array.
     */
    public void testFindMax(){
        assertEquals(5,App.getMax(new int[]{1,2,3,4,5}));
    }

    /**
     * This method is used about testing, on finding minimum value of an array.
     */
    public void testFindMin(){
        assertEquals(1,App.getMin(new int[]{1,2,3,4,5}));
    }

    /**
     * This method is used about testing, on finding mean value of an array.
     */
    public void testFindMean(){
        assertEquals(3.0,App.getMean(new int[]{1,2,3,4,5}));
    }

    /**
     * This method is used about testing, on finding median value of an array.
     * The median value is also known as the 50th percentile, or second quantile.
     */
    public void testFindPercentile(){
        assertEquals(3.0,App.getPercentile(new int[]{1,2,3,4,5}));
    }

    /**
     * This method is used about testing, on finding maximum value of an ArrayList.
     */
    public void testFindMaxAL(){
        ArrayList<Integer> ar= new ArrayList<Integer>();
        for (int i=0; i<100; i++){
            ar.add(i);
        }
        assertEquals(99,App.getMaxAL(ar));
    }

    /**
     * This method is used about testing, on finding minimum value of an ArrayList.
     */
    public void testFindMinAL(){
        ArrayList<Integer> ar= new ArrayList<Integer>();
        for (int i=0; i<100; i++){
            ar.add(i);
        }
        assertEquals(0,App.getMinAL(ar));    }

    /**
     * This method is used about testing, on finding mean value of an ArrayList.
     */
    public void testFindMeanAL(){
        ArrayList<Integer> ar= new ArrayList<Integer>();
        for (int i=0; i<100; i++){
            ar.add(i);
        }
        assertEquals(49.5,App.getMeanAL(ar));    }

    /**
     * This method is used about testing, on finding median value of an ArrayList.
     * The median value is also known as the 50th percentile, or second quantile.
     */
    public void testFindPercentileAL(){
        ArrayList<Integer> ar= new ArrayList<Integer>();
        for (int i=0; i<100; i++){
            ar.add(i);
        }
        assertEquals(49.5,App.getPercentileAL(ar));    }

}
