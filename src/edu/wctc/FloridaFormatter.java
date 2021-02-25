package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        //return SSSS-FFFY-YDDD-NN (Soundex - FFF = sum of first name and middle initial codes, YY = two year birth digit, DDD = md/gender. nn=0
       String soundexCode = driversLicense.getSoundexCode();
       String initialCode = String.valueOf(driversLicense.getFirstNameMiddleInitial());
       String yearCode = String.valueOf(driversLicense.getBirthYear());
       String genderCode = String.valueOf(driversLicense.getBirthMonthDayGender());

       String driversLicenseNumber = soundexCode+"-"+initialCode+"-"+yearCode+"-"+genderCode+"0";

        return driversLicenseNumber;
    }
}
