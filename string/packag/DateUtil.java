package packag;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil 
{
	public static Date firstDateForMonth(Date value)
	{
		if(value==null)
		{
			return null;
		}
	Calendar c=Calendar.getInstance();
	c.setTime(value);
	c.set(Calendar.DAY_OF_MONTH,1);
	c.set(Calendar.HOUR_OF_DAY,0);
	c.set(Calendar.MINUTE,0);
	c.set(Calendar.SECOND,0);
	c.set(Calendar.MILLISECOND,0);
	return c.getTime();
	}
	public static void main(String[]args)throws Exception
	{
		DateFormat df =new SimpleDateFormat("yyyy-mm-dd");
		System.out.println(DateUtil.firstDateForMonth(new Date()));
		System.out.println(DateUtil.firstDateForMonth(
				df.parse("2017-05-28")));
		System.out.println(DateUtil.firstDateForMonth(
				df.parse("2017 04 23")));
		System.out.println(DateUtil.firstDateForMonth(
				df.parse("2017-04-227")));
	}
}
