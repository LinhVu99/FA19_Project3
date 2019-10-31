import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;
 
public class DateTimeOne extends MesoDateTimeOneAbstract
{
	private HashMap<String, String> map;
	
	public DateTimeOne()
	{
		
	}
   
	public int getValueOfSecond()
	{
		LocalDateTime now = LocalDateTime.now();
		System.out.println("The value of Second now: " + now.getSecond());
		return now.getSecond();
	}
   
	public void dateTimeNow()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm a");
		Calendar c = new GregorianCalendar();
		System.out.println("Current Date/Time: " + sdf.format(c.getTime()));
	}
   
	public void sleepForFiveSec()
	{
		try
		{
			Thread.sleep(5000L);
		}
		catch (InterruptedException ie)
		{
			
		}
	}
   
	public void dateTimeOfOtherCity()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Calendar c = new GregorianCalendar();
		System.out.println("Time on Server: " + sdf.format(c.getTime()));
		
		TimeZone tz = TimeZone.getTimeZone("GMT+00:00");
		sdf.setTimeZone(tz);
		c.setTimeZone(tz);
		System.out.println("GMT: " + sdf.format(c.getTime()));
		
		tz = TimeZone.getTimeZone("GMT+06:00");
		sdf.setTimeZone(tz);
		c.setTimeZone(tz);
		System.out.println("BST (90E): " + sdf.format(c.getTime()));
		
		tz = TimeZone.getTimeZone("GMT-05:00");
		sdf.setTimeZone(tz);
		c.setTimeZone(tz);
		System.out.println("CST (90W): " + sdf.format(c.getTime()));
	}
   
	public void dateTimeDifferentZone()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		Calendar c = new GregorianCalendar();
		map = new HashMap<>();
		
		TimeZone tz = TimeZone.getTimeZone("GMT+00:00");
		sdf.setTimeZone(tz);
		c.setTimeZone(tz);
		System.out.println("GMT: " + sdf.format(c.getTime()));
		map.put("GMT", sdf.format(c.getTime()));
		
		tz = TimeZone.getTimeZone("GMT+06:00");
		sdf.setTimeZone(tz);
		c.setTimeZone(tz);
		System.out.println("BST: " + sdf.format(c.getTime()));
		map.put("BST", sdf.format(c.getTime()));
		
		tz = TimeZone.getTimeZone("GMT-05:00");
		sdf.setTimeZone(tz);
		c.setTimeZone(tz);
		System.out.println("CST: " + sdf.format(c.getTime()));
		map.put("CST", sdf.format(c.getTime()));
		
		map.put("ZST", "11/05/2018 19:59");
		map.put("AST", "10/01/2020 19:59");
	}
   
	public void timeZoneHashMap()
	{
		System.out.println("Print Style 1:");
		TreeMap<String, String> sorted = new TreeMap<>(map);
		for (Entry<String, String> entry : sorted.entrySet()) 
        	System.out.println(entry.getKey() + " " + entry.getValue().toString());
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		Calendar c = new GregorianCalendar();
		map2.put(map.get("GMT"), sdf.format(c.getTime()));
		map2.put(map.get("BST"), sdf.format(c.getTime()));
		map2.put(map.get("CST"), sdf.format(c.getTime()));
		map2.put(map.get("ZST"), sdf.format(c.getTime()));
		map2.put(map.get("AST"), sdf.format(c.getTime()));
		sorted = new TreeMap<>(map2);
		System.out.println("Print Style 3:");
		for (Map.Entry<String, String> entry : sorted.entrySet())
			System.out.println(entry.getKey());
		
		HashMap<String, String> map3 = new HashMap<String, String>();
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		map3.put(map.get("GMT"), sdf.format(c.getTime()));
		map3.put(map.get("BST"), sdf.format(c.getTime()));
		map3.put(map.get("CST"), sdf.format(c.getTime()));
		map3.put(map.get("ZST"), sdf.format(c.getTime()));
		map3.put(map.get("AST"), sdf.format(c.getTime()));
		
		Arrays.sort(map3.keySet().toArray(), Collections.reverseOrder());
		System.out.println("Print Style 5: Final sorted Array:");
		for (int i = 0; i < 5; ++i)
			System.out.println(map3.keySet().toArray()[i]);
	}
}