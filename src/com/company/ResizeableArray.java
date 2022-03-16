package com.company;

/**
 * An array with extended capabilities including:
 * automatic resizing (up and down), removal of elements
 * at specified indices, and finding a specified index value.
 */
public class ResizeableArray {
    private int size;
    private int objectsStored = 0;
    private int[] array;

    ResizeableArray(int size){
        array = new int[size];
    }

    /**
     * Inserts at the end of the array.
     * @param numToInsert - The number to insert.
     */
    public void insert(int numToInsert){
        if(array.length <= objectsStored) {
            int[] tempArray = array.clone();
            array = new int[array.length*2];
            System.arraycopy(tempArray,0, array, 0, tempArray.length);
        }
        int insertIndex = objectsStored;
        objectsStored++;
        array[insertIndex] = numToInsert;
    }

}
