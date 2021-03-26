package co.com.claro.qdn.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lramiria
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
public class EJBFechas {

    /**
     * 
     * @param fecha1
     * @return String
     */
    public static String convertDateToString(Date fecha1) {

        SimpleDateFormat formatoFecha = new SimpleDateFormat(
                "dd/MM/yyyy HH:mm:ss");
        String fecha2 = formatoFecha.format(fecha1);

        return fecha2;
    }

    /**
     * 
     * @param fecha1
     * @return String
     */
    public static String convertDateToStringSinHora(Date fecha1) {

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fecha2 = formatoFecha.format(fecha1);

        return fecha2;
    }

    /**
     * 
     * @param fecha1
     * @return Date
     * @throws ParseException 
     */
    public static Date convertStringToDate(String fecha1) throws 
            ParseException {

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        Date fecha2 = formatoFecha.parse(fecha1);

        return fecha2;
    }

    /**
     * 
     * @param fecha1
     * @return String
     * @throws ParseException 
     */
    public static String convertStringToString(String fecha1) throws 
            ParseException {

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        Date fecha2 = formatoFecha.parse(fecha1);

        return fecha2.toString();
    }

    /**
     * 
     * @param fecha1
     * @return String
     * @throws ParseException 
     */
    public static String convertStringToStringddMMyyyy24(String fecha1) throws 
            ParseException {

        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date fecha2 = formatoFecha.parse(fecha1);

        return fecha2.toString();
    }

    /**
     * 
     * @param fecha1
     * @return String
     * @throws ParseException 
     */
    public static String convertDateToStringddMMyyyy24(Date fecha1) throws 
            ParseException {

        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fecha2 = formatoFecha.format(fecha1);

        return fecha2;
    }

}
