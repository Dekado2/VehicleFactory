/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import utils.Constants;
import utils.E_PartCategory;
import utils.E_SecretQuestion;
import utils.E_UserType;
import utils.E_VehicleType;

/**
 *
 *
 */
public class InputCheck {


private InputCheck()
{}

public static Integer TryConvertingStringtoInteger (String str, Integer num)
{
    try {
       num = Integer.parseInt(str);
    }
    catch (NumberFormatException nf) {
        return null;
    }
    return num;
}

public static Double TryConvertingStringtoDouble (String str, Double num)
{
    try {
       num = Double.parseDouble(str);
    }
    catch (NumberFormatException nf) {
        return null;
    }
    return num;
}

public static E_PartCategory TryConvertingStringtoPCEnum (String str, E_PartCategory cat)
{
    try {
       cat = E_PartCategory.valueOf(str);
    }
    catch (Exception nf) {
        return null;
    }
    return cat;
}

public static E_VehicleType TryConvertingStringtoVTEnum (String str, E_VehicleType cat)
{
    try {
       cat = E_VehicleType.valueOf(str);
    }
    catch (Exception nf) {
        return null;
    }
    return cat;
}

public static E_UserType TryConvertingStringtoUTEnum (String str, E_UserType cat)
{
    try {
       cat = E_UserType.valueOf(str);
    }
    catch (Exception nf) {
        return null;
    }
    return cat;
}

public static E_SecretQuestion ConvertStringtoSQ (String sq, E_SecretQuestion cat)
{
    try {
             if (sq.equals("What is your pet's name?"))
                 sq="PetName";
             else if (sq.equals("In what city were you born?"))
                 sq="CityBirth";
             else if (sq.equals("What is your favorite movie?"))
                 sq="Movie";
             else if (sq.equals("What high school did you attend?"))
                 sq="HighSchool";
            cat = E_SecretQuestion.valueOf(sq);
    }
    catch (Exception e){
        return null;
    }
    return cat;
}

public static Date TryConvertingStringtoDate (String str)
{
        String pattern = "dd/MM/yyyy'T'HH:mm";
        Date date;
        try {
            date = new SimpleDateFormat(pattern).parse(str);
        } catch (ParseException ex) {  
            return null;
        }
        return date;
}

public static Date TryConvertingStringtoDateTwo (String str)
{
        String pattern = "E MMM dd HH:mm:ss Z yyyy";
        Date date;
        try {
            date = new SimpleDateFormat(pattern).parse(str);
        } catch (ParseException ex) {  
           return null;
        }
        return date;
}

public static Calendar CalendarGetTimeDate (Date date)
{
    Calendar cal=Calendar.getInstance();
    try{
    cal.setTime(date);
    }
    catch (NullPointerException e){
        return null;
    }
    return cal;
}

public static boolean BirthdateBeforeEmployment (Calendar birthday,Calendar employmentdate)
{
  if (birthday.before(employmentdate))
      return true;
      return false;
}

public static boolean IDLength (String id)
{
    if (id.length() == Constants.ID_DIGITS && Constants.isNumeric(id))
        return true;
    return false;
}

public static boolean VINLength (String vin)
{
    if (vin.length() != Constants.NUM_OF_VIN_CHARACTERS) return false;
        return true;
}

public static boolean VINLetters (String vin)
{
    for (char ch : Constants.FORBIDDEN_VIN_CHARACTERS) {
            if (vin.indexOf(ch) != -1)
                return false;
        }
    return true;
}

public static String IllegalFileChars (String str)
{
    str=str.replace(":", "");
    str=str.replace("/", "");
    str=str.replace("*", "");
    str=str.replace("?", "");
    str=str.replace("*", "");
    str=str.replace("<", "");
    str=str.replace(">", "");
    str=str.replace("|", "");
    str=str.replace("\\", "");
    str=str.replace("\"", "");
    str=str.replace(" ", "");
    return str;
}

}