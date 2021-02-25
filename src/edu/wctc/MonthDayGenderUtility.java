package edu.wctc;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.validator.GenericValidator;

//using commons-validator-1.7.jar to test

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException{
        String yearString = Integer.toString(year);
        String monthString = Integer.toString(month);
        String dayString = Integer.toString(day);

        String dateString = yearString + "-" + monthString + "-" + dayString;

        if (genderCode != CODE_MALE && genderCode != CODE_FEMALE ){
            throw new UnknownGenderCodeException(genderCode);
        }
        //format month/day as date then confirm whether is valid
        if (GenericValidator.isDate(dateString, "yyyy-MM-dd", true) == true){
            throw new InvalidBirthdayException(year, month, day);
        }
        else
        {
            if (genderCode == CODE_MALE){
                return ((month - 1)*40+day+MOD_MALE);
            }
            else {
                return ((month - 1)*40+day+MOD_FEMALE);
            }
        }
    }

}
