package edu.wctc;

public class UnknownGenderCodeException extends Exception {

    //constructor to call Exception's constructor with a message that the gender code is unknown
    private String invalidGenderCode = "Supplied gender code is invalid.";

    public UnknownGenderCodeException(char genderCode) {
        super(String.format("%d is an invalid gender code.", genderCode));
    }

}
