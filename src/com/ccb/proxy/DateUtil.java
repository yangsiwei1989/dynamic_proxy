package com.ccb.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String dateTransfe(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
