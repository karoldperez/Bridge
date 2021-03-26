package co.com.claro.qdn.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;

/**
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 * @since 24/09/2018
 */
public class ValidationUtils {

    /**
     * 
     * @param str
     * @return boolean
     */
    public static boolean isNumeric(String str) {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);
        return str.length() == pos.getIndex();
    }

    /**
     * 
     * @param str
     * @param ptr
     * @return boolean
     */
    public static boolean isDate(String str, String ptr) {
        boolean ok = false;

        try {
            new SimpleDateFormat(ptr).parse(str);
            ok = true;
        } catch (ParseException e) {
        }

        return ok;
    }
}
