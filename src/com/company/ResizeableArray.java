package com.company;


public class ResizeableArray {
    private int size;
    private int objectsStored = 0;
    private int[] array;

    ResizeableArray(int size){
        array = new int[size];
    }

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
