package rahulshettyacademy.coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalanderDemo {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DECEMBER));
		System.out.println(cal.get(Calendar.MARCH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.MINUTE));
		
		
		
		
		

	}

}
