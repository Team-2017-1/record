package com.sign.record.control;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sign.record.dto.Record;
import com.sign.record.dto.RecordExample;
import com.sign.record.service.RecordService;
import com.sign.record.utils.DateUtils;


@RestController
@RequestMapping("/v1/control/server")
public class RecControl {
	
	@Autowired
	private RecordService recordService;
	

	@RequestMapping(value = "/insertRecord" , method = RequestMethod.POST)
	 public String insertRecord(HttpServletRequest request) throws Exception{

		Record r1= new Record();
		Record r2= new Record();
		Record r3= new Record();
		Record r4= new Record();
		Record r5= new Record();
		Record r6= new Record();
		Record r7= new Record();
		
		try {
			String date1 = request.getParameter("date1");
			String fixedhours1 = request.getParameter("fixedhours1");
			String type1 = request.getParameter("type1");
			String week1 = request.getParameter("week1");
			String starttime1 = request.getParameter("starttime1");
			String endtime1 = request.getParameter("endtime1");
			String actualhours1 = request.getParameter("actualhours1");
			r1.setActualhours(actualhours1);
			r1.setWeek(Integer.parseInt(week1));
			r1.setStarttime(!StringUtils.isEmpty(starttime1)?DateUtils.parseDate(starttime1):null);
			r1.setEndtime(!StringUtils.isEmpty(endtime1)?DateUtils.parseDate(endtime1):null);
			if("0".equals(actualhours1)&&!StringUtils.isEmpty(starttime1)&&!StringUtils.isEmpty(endtime1)){
				r1.setActualhours(String.valueOf(DateUtils.calMinute(DateUtils.parseDate(starttime1), 
					DateUtils.parseDate(endtime1))/60-1.5));
			}
			r1.setDate(DateUtils.parseDate(date1));
			r1.setFixedhours(fixedhours1);
			r1.setType(Integer.parseInt(type1));
			//--------------------------------------
			String date2 = request.getParameter("date2");
			String fixedhours2 = request.getParameter("fixedhours2");
			String type2 = request.getParameter("type2");
			String week2 = request.getParameter("week2");
			String starttime2 = request.getParameter("starttime2");
			String endtime2 = request.getParameter("endtime2");
			String actualhours2 = request.getParameter("actualhours2");
			r2.setActualhours(actualhours2);
			r2.setWeek(Integer.parseInt(week2));
			r2.setStarttime(!StringUtils.isEmpty(starttime2)?DateUtils.parseDate(starttime2):null);
			r2.setEndtime(!StringUtils.isEmpty(endtime2)?DateUtils.parseDate(endtime2):null);
			if("0".equals(actualhours2)&&!StringUtils.isEmpty(starttime2)&&!StringUtils.isEmpty(endtime2)){
				r2.setActualhours(String.valueOf(DateUtils.calMinute(DateUtils.parseDate(starttime2), 
					DateUtils.parseDate(endtime2))/60-1.5));
			}
			r2.setDate(DateUtils.parseDate(date2));
			r2.setFixedhours(fixedhours2);
			r2.setType(Integer.parseInt(type2));
			//--------------------------------------
			String date3 = request.getParameter("date3");
			String fixedhours3 = request.getParameter("fixedhours3");
			String type3 = request.getParameter("type3");
			String week3 = request.getParameter("week3");
			String starttime3 = request.getParameter("starttime3");
			String endtime3 = request.getParameter("endtime3");
			String actualhours3 = request.getParameter("actualhours3");
			r3.setActualhours(actualhours3);
			r3.setWeek(Integer.parseInt(week3));
			r3.setStarttime(!StringUtils.isEmpty(starttime3)?DateUtils.parseDate(starttime3):null);
			r3.setEndtime(!StringUtils.isEmpty(endtime3)?DateUtils.parseDate(endtime3):null);
			if("0".equals(actualhours3)&&!StringUtils.isEmpty(starttime3)&&!StringUtils.isEmpty(endtime3)){
				r3.setActualhours(String.valueOf(DateUtils.calMinute(DateUtils.parseDate(starttime3), 
					DateUtils.parseDate(endtime3))/60-1.5));
			}
			r3.setDate(DateUtils.parseDate(date3));
			r3.setFixedhours(fixedhours3);
			r3.setType(Integer.parseInt(type3));
			//--------------------------------------
			String date4 = request.getParameter("date4");
			String fixedhours4 = request.getParameter("fixedhours4");
			String type4 = request.getParameter("type4");
			String week4 = request.getParameter("week4");
			String starttime4 = request.getParameter("starttime4");
			String endtime4 = request.getParameter("endtime4");
			String actualhours4 = request.getParameter("actualhours4");
			r4.setActualhours(actualhours4);
			r4.setWeek(Integer.parseInt(week4));
			r4.setStarttime(!StringUtils.isEmpty(starttime4)?DateUtils.parseDate(starttime4):null);
			r4.setEndtime(!StringUtils.isEmpty(endtime4)?DateUtils.parseDate(endtime4):null);
			if("0".equals(actualhours4)&&!StringUtils.isEmpty(starttime4)&&!StringUtils.isEmpty(endtime4)){
				r4.setActualhours(String.valueOf(DateUtils.calMinute(DateUtils.parseDate(starttime4), 
					DateUtils.parseDate(endtime4))/60-1.5));
			}
			r4.setDate(DateUtils.parseDate(date4));
			r4.setFixedhours(fixedhours4);
			r4.setType(Integer.parseInt(type4));  
			//--------------------------------------
			String date5 = request.getParameter("date5");
			String fixedhours5 = request.getParameter("fixedhours5");
			String type5 = request.getParameter("type5");
			String week5 = request.getParameter("week5");
			String starttime5 = request.getParameter("starttime5");
			String endtime5 = request.getParameter("endtime5");
			String actualhours5 = request.getParameter("actualhours5");
			r5.setActualhours(actualhours5);
			r5.setWeek(Integer.parseInt(week5));
			r5.setStarttime(!StringUtils.isEmpty(starttime5)?DateUtils.parseDate(starttime5):null);
			r5.setEndtime(!StringUtils.isEmpty(endtime5)?DateUtils.parseDate(endtime5):null);
			if("0".equals(actualhours5)&&!StringUtils.isEmpty(starttime5)&&!StringUtils.isEmpty(endtime5)){
				r5.setActualhours(String.valueOf(DateUtils.calMinute(DateUtils.parseDate(starttime5), 
					DateUtils.parseDate(endtime5))/60-1.5));
			}
			r5.setDate(DateUtils.parseDate(date5));
			r5.setFixedhours(fixedhours5);
			r5.setType(Integer.parseInt(type5));
			//--------------------------------------
			String date6 = request.getParameter("date6");
			String fixedhours6 = request.getParameter("fixedhours6");
			String type6 = request.getParameter("type6");
			String week6 = request.getParameter("week6");
			String starttime6 = request.getParameter("starttime6");
			String endtime6 = request.getParameter("endtime6");
			String actualhours6 = request.getParameter("actualhours6");
			r6.setActualhours(actualhours6);
			r6.setWeek(Integer.parseInt(week6));
			r6.setStarttime(!StringUtils.isEmpty(starttime6)?DateUtils.parseDate(starttime6):null);
			r6.setEndtime(!StringUtils.isEmpty(endtime6)?DateUtils.parseDate(endtime6):null);
			if("0".equals(actualhours6)&&!StringUtils.isEmpty(starttime6)&&!StringUtils.isEmpty(endtime6)){
				r6.setActualhours(String.valueOf(DateUtils.calMinute(DateUtils.parseDate(starttime6), 
					DateUtils.parseDate(endtime6))/60-1.5));
			}
			r6.setDate(DateUtils.parseDate(date6));
			r6.setFixedhours(fixedhours6);
			r6.setType(Integer.parseInt(type6));
			//--------------------------------------
			String date7 = request.getParameter("date7");
			String fixedhours7 = request.getParameter("fixedhours7");
			String type7 = request.getParameter("type7");
			String week7 = request.getParameter("week7");
			String starttime7 = request.getParameter("starttime7");
			String endtime7 = request.getParameter("endtime7");
			String actualhours7 = request.getParameter("actualhours7");
			r7.setActualhours(actualhours7);
			r7.setWeek(Integer.parseInt(week7));
			r7.setStarttime(!StringUtils.isEmpty(starttime7)?DateUtils.parseDate(starttime7):null);
			r7.setEndtime(!StringUtils.isEmpty(endtime7)?DateUtils.parseDate(endtime7):null);
			if("0".equals(actualhours7)&&!StringUtils.isEmpty(starttime7)&&!StringUtils.isEmpty(endtime7)){
				r7.setActualhours(String.valueOf(DateUtils.calMinute(DateUtils.parseDate(starttime7), 
					DateUtils.parseDate(endtime7))/60-1.5));
			}
			r7.setDate(DateUtils.parseDate(date7));
			r7.setFixedhours(fixedhours7);
			r7.setType(Integer.parseInt(type7));
			
			if(StringUtils.isEmpty(date1)||StringUtils.isEmpty(date2)||StringUtils.isEmpty(date3)||StringUtils.isEmpty(date4)
					||StringUtils.isEmpty(date5)||StringUtils.isEmpty(date6)||StringUtils.isEmpty(date7)){
				return "日期不能为空！";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			return "参数异常！";
		}
		
		RecordExample re = new RecordExample();
		re.or().andDateEqualTo(new Date()).andFixedhoursEqualTo("");
		
		
		recordService.insert(r1);
		recordService.insert(r2);
		recordService.insert(r3);
		recordService.insert(r4);
		recordService.insert(r5);
		recordService.insert(r6);
		recordService.insert(r7);
		
    	return "success";
	    }
	
	
	
	
	
	 
	
}
