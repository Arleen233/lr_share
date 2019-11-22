package com.liang.share.lrshare.utils;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version V0.0.1
 * @Description: 处理时间的工具类
 */
public class DateUtils {
    private static String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

    private static String DEFAULT_SECONDS_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String convertDateToStringDay(Timestamp timestamp) {
        if (timestamp == null) {
            return null;
        }
        DateTime dateTime = new DateTime(timestamp.getTime());
        return dateTime.toString(DEFAULT_DATE_PATTERN);
    }

    public static String convertDateToString(Timestamp timestamp) {
        if (timestamp == null) {
            return null;
        }
        DateTime dateTime = new DateTime(timestamp.getTime());
        return dateTime.toString(DEFAULT_SECONDS_DATE_PATTERN);
    }

    public static Date convertStringToDate(String stringDateTime) {
        if (StringUtils.isEmpty(stringDateTime)) {
            return null;
        }
        DateTime dateTime = DateTimeFormat.forPattern(DEFAULT_SECONDS_DATE_PATTERN).parseDateTime(stringDateTime);
        return dateTime.toDate();
    }

    public static Timestamp now() {
        return new Timestamp(new DateTime().getMillis());
    }

    public static String getCurrentTime() {
        return getCurrentTime(DEFAULT_SECONDS_DATE_PATTERN);
    }

    public static String getCurrentTime(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date());
    }
}
