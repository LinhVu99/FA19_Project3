import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DateSortingUsingAlgorithm {
	private HashMap<LocalDate, Integer> dates;
	
	public DateSortingUsingAlgorithm() throws IOException
	{
		BufferedReader file = new BufferedReader(new FileReader("SortingDates.txt"));
		dates = new HashMap<LocalDate, Integer>();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String input;
		LocalDate date;
		
		for (int i = 0; i < 20; ++i)
		{
			input = file.readLine();
			input = input.trim();
			input = input.replace(" ", "");
			date = LocalDate.parse(input, format);
			dates.put(date, i);
		}
		
		file.close();
	}
	
	public void dateHashMapSortedDescending()
	{
		TreeMap<LocalDate, Integer> sorted = new TreeMap<>(Collections.reverseOrder());
		sorted.putAll(dates);
		
		for (Map.Entry<LocalDate, Integer> entry : sorted.entrySet())
			System.out.println(entry.getKey());
	}
	
	public void dateHashMapSorted()
	{
		TreeMap<LocalDate, Integer> sorted = new TreeMap<>(dates);
		
		for (Map.Entry<LocalDate, Integer> entry : sorted.entrySet())
			System.out.println(entry.getKey());
	}
}