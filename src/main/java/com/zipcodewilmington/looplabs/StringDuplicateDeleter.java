package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] newArray = new String[array.length];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;

            for (String string : array) {
                if (array[i] == string) {
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

        String[] newArrayAgain = new String[array.length-nullCounter];
        for (int i = 0; i < newArrayAgain.length; i++){
            newArrayAgain[i] = newArray[i];
        }

        return newArrayAgain;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] newArray = new String[array.length];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;

            for (String string : array) {
                if (array[i] == string) {
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

        String[] newArrayAgain = new String[array.length-nullCounter];
        for (int i = 0; i < newArrayAgain.length; i++){
            newArrayAgain[i] = newArray[i];
        }
        return newArrayAgain;
    }
}
