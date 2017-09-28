package test;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.ArrayList;

/**
 * Java app, containing functions for finding the minimum, maximum, mean and
 * median values of arrays and ArrayLists.
 */

public class App
{
    /**
     * Void Constructor.
     */
    public App(){ }

    /**
     * Uses DescriptiveStatistics to get maximum value of an array.
     *
     * @param ar            Input array of integers.
     * @return              Maximum value of array.
     */
    public static int getMax(int[] ar){

        DescriptiveStatistics temp = new DescriptiveStatistics();

        for(int i=0; i<ar.length; i++){

            temp.addValue(ar[i]);
        }

        int ret=(int)temp.getMax();

        return ret;
    }

    /**
     * Uses DescriptiveStatistics to get minimum value of an array.
     *
     * @param ar            Input array of integers.
     * @return              Minimum value of array.
     */
    public static int getMin(int[] ar){

        DescriptiveStatistics temp = new DescriptiveStatistics();

        for(int i=0; i<ar.length; i++){

            temp.addValue(ar[i]);
        }

        int ret=(int)temp.getMin();

        return ret;
    }

    /**
     * Uses DescriptiveStatistics to get mean value of an array.
     *
     * @param ar            Input array of integers.
     * @return              Mean value of array.
     */
    public static double getMean(int[] ar){

        DescriptiveStatistics temp = new DescriptiveStatistics();

        for(int i=0; i<ar.length; i++){

            temp.addValue(ar[i]);

        }

        return temp.getMean();
    }

    /**
     * Uses DescriptiveStatistics to get median value of an array.
     *
     * @param ar            Input array of integers.
     * @return              Median value of array.
     */
    public static double getPercentile(int[] ar){

        DescriptiveStatistics temp = new DescriptiveStatistics();

        for(int i=0; i<ar.length; i++){

            temp.addValue(ar[i]);

        }

        return temp.getPercentile(50);
    }

    /**
     * Uses DescriptiveStatistics to get maximum value of an ArrayList.
     *
     * @param ar            Input ArrayList of integers.
     * @return              Maximum value of ArrayList.
     */
    public static int getMaxAL(ArrayList<Integer> ar){

        DescriptiveStatistics temp = new DescriptiveStatistics();

        for(int i=0; i<ar.size(); i++){

            temp.addValue(ar.get(i));

        }

        int ret=(int)temp.getMax();

        return ret;
    }

    /**
     * Uses DescriptiveStatistics to get minimum value of an ArrayList.
     *
     * @param ar            Input ArrayList of integers.
     * @return              Minimum value of ArrayList.
     */
    public static int getMinAL(ArrayList<Integer> ar){

        DescriptiveStatistics temp = new DescriptiveStatistics();

        for(int i=0; i<ar.size(); i++){

            temp.addValue(ar.get(i));

        }

        int ret=(int)temp.getMin();

        return ret;
    }

    /**
     * Uses DescriptiveStatistics to get mean value of an ArrayList.
     *
     * @param ar            Input ArrayList of integers.
     * @return              Mean value of ArrayList.
     */
    public static double getMeanAL(ArrayList<Integer> ar){

        DescriptiveStatistics temp = new DescriptiveStatistics();

        for(int i=0; i<ar.size(); i++){

            temp.addValue(ar.get(i));

        }

        return temp.getMean();
    }

    /**
     * Uses DescriptiveStatistics to get median value of an ArrayList.
     *
     * @param ar            Input ArrayList of integers.
     * @return              Median value of ArrayList.
     */
    public static double getPercentileAL(ArrayList<Integer> ar){

        DescriptiveStatistics temp = new DescriptiveStatistics();

        for(int i=0; i<ar.size(); i++){

            temp.addValue(ar.get(i));

        }

        return temp.getPercentile(50);
    }
}
