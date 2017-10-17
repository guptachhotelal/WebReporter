package com.webreporter.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chhotelal
 */
public class DateUtil {

    private static final Logger LOG = Logger.getLogger(DateUtil.class.getName());
    public static final String DATE_FORMAT_SHORT = "dd/MM/yyyy";
    public static final String DATETIME_FORMAT_LONG = "dd/MM/yyyy hh:mm a";

    public static String formatDate(Date date, String format) {
        if (format != null && format.trim().length() == 0) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(date);
        }
        return null;
    }

    public static Date parseDate(String date, String format) {
        if (format != null && format.trim().length() > 0) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            try {
                return sdf.parse(date);
            } catch (ParseException ex) {
                Logger.getLogger(DateUtil.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return null;
    }

    private DateUtil() {
    }
}
