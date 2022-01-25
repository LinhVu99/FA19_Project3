# 'FALL 2019 PROJECT 3' - linhv
	DateTimeOne Class
		- Use LocalDateTime with method getSecond() to get the value of second now
		- Use Calendar and SimpleDateFormat to get current date/time with format MM/dd/yyyy HH:mm a
		- Create sleepForFiveSec() method by using Thread
		- For dateTimeOfOtherCity() method, use TimeZone to get the time zone of those cities and set that time zone on calendar and format, then print out the time at those cities
		- For dateTimeDifferentZone() method, do the same thing  and put the values into the HashMap with keys are the names of time zones and values are the time and date
		- Use TreeMap to sort the map and print out style 1
		- Create HashMap map2 and put time/date of different time zones into the key set, sort the map, and print out the key set only for style 3
		- Create HashMap map3 as the same way as map2, put the map into the array, sort that array in reverse order, and print out the key set for style 5
		 
	DateTimeTwo Class
		- Create DateTimeTwo class with private variables current type LocalDate and dates type Map<LocalDate, Integer>
		- Find the 10th day and the 18th day of this month by using getDayOfWeek() method of DayOfWeek class
		- Do the same thing for daysOfAnyMonth() method
		- Read the "Dates.txt" file by using BufferedReader
		- Create a HashMap named dates and put the date as the key and the index as the value
		- Calculate the difference in years, months, and days using ChronoUnit
		- Print out the dates HashMap
		- Sort the dates HashMap using TreeMap and print it out
		
	MesoAsciiCal Class
		- Find the sum of the ASCII values of 4 letters of the station ID
		- Take the average by taking floor or ceiling of the average value
		
	MesoEquivalent Class
		- Read the "Mesonet.txt" file by using BufferedReader
		- Store the name of the stations into an ArrayList called stations
		- Create a HashMap called map to store the values of station ID and the ASCII average
		- Loop through the stations array, if the ASCII average of that station equals the average of this station, put that into the map
		
	MesoLexicographical Class
		- Print out the unsorted map of station ID and their ASCII values
		- Sort the map using Tree Map and print out the sorted map
		
	DateSortingUsingAlgorithm Class
		- Read the "SortingDates.txt" file by using BufferedReader
		- Create a HashMap named dates and store values of the date and the index into the map
		- Use TreeMap to sort the map in natural order and reverse order
