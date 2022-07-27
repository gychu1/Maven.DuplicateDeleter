package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Integer[] newArray = new Integer[array.length];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;

            for (Integer integer : array) {
                if (array[i] == integer) {
                    counter++;
                }
            }
            if (counter < maxNumberOfDuplications){
                newArray[newIndex]=array[i];
                newIndex++;
            }
        }

        int nullCounter = 0;
        for (int i = 0; i<newArray.length; i++){
            if(newArray[i] == null){
                nullCounter++;
            }
        }

        Integer[] newArrayAgain = new Integer[array.length-nullCounter];
        for (int i = 0; i < newArrayAgain.length; i++){
            newArrayAgain[i] = newArray[i];
        }

        return newArrayAgain;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] newArray = new Integer[array.length];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;

            for (Integer integer : array) {
                if (array[i] == integer) {
                    counter++;
                }
            }
            if (counter != exactNumberOfDuplications){
                newArray[newIndex]=array[i];
                newIndex++;
            }
        }

        int nullCounter = 0;
        for (int i = 0; i<newArray.length; i++){
            if(newArray[i] == null){
                nullCounter++;
            }
        }

        Integer[] newArrayAgain = new Integer[array.length-nullCounter];
        for (int i = 0; i < newArrayAgain.length; i++){
            newArrayAgain[i] = newArray[i];
        }
        return newArrayAgain;
    }
}
