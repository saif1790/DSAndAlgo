import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class DateDemo
{

  public static void main(String[] args) throws ParseException {
	
	  String dt = "2022-11-06";  
	  
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	  LocalDateTime now = LocalDateTime.now(); 
	  System.out.println(now);
	   int hour = now.getHour();
	   System.out.println(hour);
	   if(hour==15)
	   {
	   //System.out.println(dtf.format(now));  
	  Calendar c = Calendar.getInstance();
	  c.setTime(sdf.parse(dt));
	   
	  c.add(Calendar.DATE, 1);  
	  dt = sdf.format(c.getTime()); 
	  System.out.println(dt);
	   }
}
}
