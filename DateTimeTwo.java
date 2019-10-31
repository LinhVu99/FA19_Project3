import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.DayOfWeek;

public class DateTimeTwo {
	private LocalDate current;
	private Map<LocalDate, Integer> dates;
	
	public DateTimeTwo()
	{
		
	}
	
	public void daysOfCurrentMonth()
	{
		current = LocalDate.now();
		DayOfWeek tenthDay = current.withDayOfMonth(10).getDayOfWeek();
		DayOfWeek eighteenthDay = current.withDayOfMonth(18).getDayOfWeek();
		System.out.println("The tenth day of this month is " + tenthDay + " and eighteenth is " + eighteenthDay);
	}
	
	public void daysOfAnyMonth(int month, int year)
	{
		LocalDate fifteenthDay = LocalDate.of(year, month, 15);
		LocalDate lastDay = LocalDate.of(year, month, fifteenthDay.lengthOfMonth());
		System.out.println("For the year (" + year + ") and month (" + month + "), the fifteenth day is " + 
				fifteenthDay.getDayOfWeek() + " and the last day is " + lastDay.getDayOfWeek());
	}
	
	public void compareYear() throws IOException
	{
		BufferedReader file = new BufferedReader(new FileReader("Dates.txt"));
		dates = new HashMap<LocalDate, Integer>();
		LocalDate date;
		String input;
		current = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yyyy");
		long yearDifference;
		long monthDifference;
		long dayDifference;
		
		for (int i = 0; i < 10; ++i)
		{
			input = file.readLine();
			date = LocalDate.parse(input, format);
			dates.put(date, i);
			
			yearDifference = ChronoUnit.YEARS.between(date, current);
			monthDifference = ChronoUnit.MONTHS.between(date, current);
			dayDifference = ChronoUnit.DAYS.between(date, current);
			
			if (date.isLeapYear())
				System.out.println(date.getYear() + " is a leap year, and Difference: " + yearDifference + 
						" years, " + monthDifference + " months, and " + dayDifference + " days.");
			else
				System.out.println(date.getYear() + " is not a leap year, and Difference: " + yearDifference + 
						" years, " + monthDifference + " months, and " + dayDifference + " days.");
		}
		
		file.close();
	}
	
	public void dateHashMap()
	{
		for (Map.Entry<LocalDate, Integer> entry : dates.entrySet())
			System.out.println(entry.getKey() + ":" + entry.getValue());
	}
	
	public void dateHashMapSorted()
	{
		TreeMap<LocalDate, Integer> sorted = new TreeMap<>(dates);
		for (Map.Entry<LocalDate, Integer> entry : sorted.entrySet())
			System.out.println(entry.getKey() + ":" + entry.getValue());
	}
}
