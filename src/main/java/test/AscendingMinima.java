package test;

import java.util.ArrayList;

/**
 * Java app, implimenting the Ascending Minima Algorithm.
 */

public class AscendingMinima {

    /**
     * Void Constructor.
     */
    public AscendingMinima(){ }

    /**
     * Finding Ascending Minima.
     * Given an array, the first step of Ascending Minima Algorithm is
     * implemented, in order to produce an array of minimas.
     * @param ar            Input array for Ascending Minima.
     * @return              Result array containing the minimas.
     */

    public static ArrayList firstStep(ArrayList<Integer> ar) {
        int min, tempInd = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Declare first value of the array as the minimum value.

        min = ar.get(0);

        //Run While-loop until the end of the array is reached.

        while (tempInd <= (ar.size() - 1)) {

            //Keep the min value, every time the loop starts.

            min = ar.get(tempInd);

            for (int i = tempInd; i < ar.size(); i++) {

                //Keep minimum and index values.

                if (ar.get(i) <= min) {
                    tempInd = i;
                    min = ar.get(i);
                }
            }

            //Add the minimum element to the list and increase the index.

            list.add(min);
            tempInd++;
        }
        return list;
    }

    /**
     * Comparing the first values of each array. If the values are the same
     * and the first value of the @list array doesn't appear again in
     * the @ar array, then both values are removed. Elsewise, only the
     * first value of the @ar array is removed.
     *
     * @param ar                Input (initial) array.
     * @param list              Produced array by Ascending Minima.
     * @return                  New @list array, after the window moves.
     */
    public static ArrayList removeElements(ArrayList<Integer> ar, ArrayList<Integer> list) {

        int temp = ar.get(0);

        // Remove first value of the @ar array and check if it is also
        // the first value in the @list array.

        if (list.get(0) == temp) {
            ar.remove(0);

            //If the first value of the @ar array, doesn't appear again
            //in the @list array, remove both.

            if (!ar.contains(temp)) list.remove(0);
        }

        return list;
    }

    /**
     * Places new element which the window-moving produced.
     * @param list              Produced array by the Ascending Minima.
     * @param el                New element, produced by the window-moving.
     * @return                  New @list array, probably with new minima.
     */


    public static ArrayList placeNewElement(ArrayList<Integer> list, int el) {

        int index = -1, max, con, counter = 0;

        //Declare as max the last array value.

        max = list.get(list.size() - 1);

        //Find index where the value must be placed.

        for (int i = (list.size() - 1); i >= 0; i--) {
            if (el <= list.get(i)) {
                counter++;
            } else {
                index = i + 1;
                break;
            }
        }

        //If the new value is greater than all the others, then it pushes
        //in the array.

        if (counter == list.size()) {
            list.clear();
            list.add(el);
        }


        //If the value is placed in the array, the values that are greater
        //than the new element, pop from the array.

        if (index != -1) {
            con = index;
            int initSize = list.size();

            for (int i = (index); i < initSize; i++) {
                list.remove(con);
            }

            //When popping ends, the new element is added.

            list.add(index, el);
        }

        return list;
    }

    /**
     * Pushes the remaining elements of the difference between the window
     * size k and the actual array, in a new array.
     * @param ar                    Initial total array.
     * @param k                     Window size of the Ascending Minima.
     * @return                      Remaining values that exceed the window size.
     */
    public static ArrayList remainingElements(ArrayList<Integer> ar, int k) {
        int initSize = (ar.size());
        ArrayList<Integer> remElem = new ArrayList<Integer>();

        //If window size exceeds the array size, then scale to the actual array size.
        //Could do " System.exit(0) " .

        if (k > initSize) {
            System.out.println("Window size exceeds array size!");
            System.out.println("Window size scaling to actual array size!");
            k=initSize;
        }
        else {

            //Push the remaining elenets in the new array.

            for (int i = k; i < initSize; i++) {
                remElem.add(ar.get(i));
            }

        }

        return remElem;
    }

    /**
     * The total Ascending Minima Algorithm, including all the created
     * functions.
     * @param ar                    Input array to execute Ascending Minima.
     * @param k                     Window size.
     * @return                      The final Ascending Minima array.
     */
    public static ArrayList ascendingMinimaAlgorithm(ArrayList<Integer> ar, int k) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> remElements = new ArrayList<Integer>();

        //Find elements that exceed window size.

        remElements = remainingElements(ar,k);

        //Execute first step of the algorithm.

        list = firstStep(ar);

        //For each window-moving.

        for (int i=0; i<remElements.size(); i++){

            //First remove the first values of each array if possible.

            list = removeElements(ar,list);

            //Then place the new element, provided by the window-moving.

            list = placeNewElement(list,remElements.get(i));

        }

        //Return the final result.

        return list;

    }
}

