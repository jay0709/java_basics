package code.hackerearth.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.text.DateFormatter;

public class CurrentDateTime {
	public static void main(String[] args) {
		String deviceTime = "Sun Nov  18 23:13:17 EST 2017";
		//Wed Nov  8 03:13:17 EST 2017
		
		String actualTimeInSRP;
		String actualTimeInDevice = null;
		String dtdayofweek = deviceTime.substring(0,3).toUpperCase();
		String dtDay = deviceTime.substring(9,10);
		int dtTime = Integer.parseInt(deviceTime.substring(10,deviceTime.indexOf(":")));
		if(dtTime>12){
			dtTime = dtTime-12;
			actualTimeInSRP = Integer.toString(dtTime)+"PM";
		}
		else 
			actualTimeInSRP = Integer.toString(dtTime)+"AM";
			
		System.out.println(dtdayofweek +":" + dtDay +":"+ actualTimeInSRP);
		
		String srpDate = "Wed 11/12, 2PM"; // driver.findElement(oh.openTimeInSRP).getText().toLowerCase();
		String srpDayOfWeek = srpDate.substring(0, 3).toUpperCase();
		String srpDay = srpDate.substring(srpDate.indexOf("/")+1, srpDate.indexOf(","));
		String srpTime = srpDate.substring(11,srpDate.length());
		
		System.out.println(srpDayOfWeek);
		System.out.println(srpDay);
		System.out.println(srpTime);
		
		if(Integer.parseInt(srpDay) < Integer.parseInt(dtDay)){
			System.out.println("Day is showing for the next month OpenHouse");
		}
	}



}
