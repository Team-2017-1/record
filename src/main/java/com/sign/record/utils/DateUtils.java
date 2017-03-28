package com.sign.record.utils;



import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * 日期工具类
 * @author blue
 */
public class DateUtils {
	
	private static final Logger logger = Logger.getLogger(DateUtils.class);
	public static SimpleDateFormat MINUTESDF=new SimpleDateFormat("yyyy-MM-dd HH:mm");
	public static SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public final static DateFormat YYYYMMDDHHMMSS = new SimpleDateFormat("yyyyMMddHHmmss");
	public final static DateFormat YYYY_MM_DD_HH_MM_SS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public final static DateFormat YYYY_MM_DD_HH_MM = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	public final static DateFormat YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd");
	public final static DateFormat YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
	
	/**
	 * 格式化String类型 日期
	 * 
	 * @param strDate
	 * @param format
	 * @return
	 */
	public static String formatDate(String strDate, String format) {
		SimpleDateFormat dateFm = new SimpleDateFormat(format);
		Timestamp ts = toTimestamp(strDate);
		if (ts == null)
			return "";
		return dateFm.format(ts);
	}

	/**
	 * 格式化String 类型日期
	 * 
	 * @param strDate
	 * @return
	 */
	public static String formatDate(String strDate) {
		return formatDate(strDate, "yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 格式化String 类型日期
	 * 
	 * @param strDate
	 * @return
	 */
	public static String formatDateStr(String strDate) {
		if (strDate == null) {
			return "";
		}
		
		return formatDate(strDate.trim(), "yyyy-MM-dd");
	}

	/**
	 * 格式化Date类型日期
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String formatDate(Date date, String format) {
		SimpleDateFormat dateFm = new SimpleDateFormat(format);
		return dateFm.format(date);
	}

	/**
	 * 格式化Date类型日期
	 * 
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date) {
		if (date == null) {
			return null;
		}
		return formatDate(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 格式化Long类型日期 单位：毫秒
	 * 
	 * @param timstamp 单位：毫秒
	 * @return
	 */
	public static String formatDate(Long time) {
		Timestamp timestamp = new Timestamp(time);
		return DateUtils.formatDate(timestamp, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * Date转String 日期格式
	 * 
	 * @param str
	 * @return
	 */
	public static Date toDate(String date) {
		try {
			if (date == null || date.equals(""))
				return null;
			SimpleDateFormat myFormatter = new SimpleDateFormat((date.indexOf(":") > 0) ? "yyyy-MM-dd HH:mm:ss" : "yyyy-MM-dd");
			return myFormatter.parse(date);
		}
		catch (Exception e) {
			logger.error(e);
			return null;
		}
	}

	private static Timestamp toTimestamp(String str) {
		try {
			if (str.equals(""))
				return null;
			if (str.indexOf(":") <= 0)
				str += " 00:00:00";
			return Timestamp.valueOf(str);
		}
		catch (Exception e) {
			logger.error(e);
			return null;
		}
	}
	
	/**
	 * 开始日期和结束日期的毫秒数
	 * 
	 * @return
	 */
	public static long getMillisecond(Date startDate, Date endDate) {

		if (startDate == null || endDate == null) {
			return 0;
		}

		// 得到毫秒数
		long startTime = startDate.getTime();
		long endTime = endDate.getTime();
		//long dayCount = (endTime - startTime) / (24 * 3600 * 1000);// 天数
		
		return endTime - startTime;
	}
	
	/**
	 * 指定转换格式比较两个时间是否相等
	 * @param dateOne
	 * @param dateTwo
	 * @param format
	 * @return
	 */
	public static boolean isCompareDate(Date dateOne, Date dateTwo, String format){
		
		try {
			
			String dateOneStr = "";
			String dateTwoStr = "";
			if (dateOne == null || dateTwo == null) {
				return false;
			} 
			
			if (format == null || "".equals(format)) {// 默认：yyyy-MM-dd HH:mm:ss
				
				dateOneStr = dateToString(dateOne);
				dateTwoStr = dateToString(dateTwo);
			} else if (format.length() == 10) {// yyyy-MM-dd
				
				dateOneStr = dateToYMDStr(dateOne);
				dateTwoStr = dateToYMDStr(dateTwo);
			} else if (format.length() == 16) {// yyyy-MM-dd HH:mm

				dateOneStr = dateToYMDHMStr(dateOne);
				dateTwoStr = dateToYMDHMStr(dateTwo);
			} else {
				
				return false;
			}
			
			// 转为时间格式进行比较
			Date newDateOne = parseDate(dateOneStr);
			Date newDateTwo = parseDate(dateTwoStr);
			if (newDateOne.getTime() == newDateTwo.getTime()) {
				
				return true;
			}
		} catch (Exception e) {
			
			return false;
		}
		
		return false;
	}
	
	/**
	 * 
	 * 将字符串转换为指定格式日期格式
	 *
	 * @param str
	 * @return
	 * @throws ParseException
	 */
	public static Date parseDate(String str) throws ParseException {
		if (str == null || "".equals(str)) {

			return null;
		} else if (str.length() == 10) {

			return YYYY_MM_DD.parse(str);
		} else if (str.length() == 8) {

			return YYYYMMDD.parse(str);
		} else if (str.length() == 14) {

			return YYYYMMDDHHMMSS.parse(str);
		} else if (str.length() == 16) {

			return YYYY_MM_DD_HH_MM.parse(str);
		} else {

			return YYYY_MM_DD_HH_MM_SS.parse(str);
		}
	}
	
	/**
	 * 时间转换为yyyy-MM-dd HH:mm:ss格式的字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date) {
		if (date == null) {
			return "";
		}
		return YYYY_MM_DD_HH_MM_SS.format(date);
	}

	/**
	 * 时间转换为YYYY_MM_DD格式的字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToYMDStr(Date date) {
		if (date == null) {
			return "";
		}
		return YYYY_MM_DD.format(date);
	}
	
	/**
	 * 时间转换为YYYYMMDDHHMMSS格式的字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToYMDHMSStr(Date date) {
		if (date == null) {
			return "";
		}
		return YYYYMMDDHHMMSS.format(date);
	}
	
	/**
	 * 时间转换为yyyy-MM-dd HH:mm格式的字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToYMDHMStr(Date date) {
		if (date == null) {
			return "";
		}
		return YYYY_MM_DD_HH_MM.format(date);
	}
	
	/**
	 * 获取指定时间多少分钟之后的时间
	 * @param date
	 * @param minute
	 * @return
	 */
	public static Date getDateByMinute(Date date, int minute) {
		
		Calendar nowTime = Calendar.getInstance();
		nowTime.setTime(date);
		nowTime.add(Calendar.MINUTE, minute);
		return nowTime.getTime();
	}

	public static Date current() {
		return Calendar.getInstance().getTime();
	}
	
	/**把日期的秒数值(1316493045000)转化成日期类型，只保留分钟**/
	public static Date getMinute(String dateStr) throws ParseException {
		long l=Long.parseLong(dateStr);
		Date date = new Date(l);
		String result=MINUTESDF.format(date);
		Date date2=MINUTESDF.parse(result);
		return date2;
	}
	/**计算两个时间相隔的分钟数**/
	public static long calMinute(Date start,Date end){
		long interval = (end.getTime() - start.getTime())/(1000*60);
		return interval;
	}
	/**判断时间是否早于当前时间10分钟**/
	public static boolean calNowDate(Date start,Date end){
		BigDecimal b1=new BigDecimal(String.valueOf(start.getTime()));
		BigDecimal b2=new BigDecimal(String.valueOf(end.getTime()));
		BigDecimal b3=b1.subtract(b2);
		BigDecimal decimal=new BigDecimal(1000*60);
		BigDecimal b4=b3.divide(decimal);
		int a=b4.intValue();
		if (a>10)
			return true;
		else
			return false;
	}
	/**判断某个时间点是否在两个时间的先后顺序**/
	public static boolean isAfter(Date date1, Date date2) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date1);
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date2);
		return date2.after(date1);
	}
}

