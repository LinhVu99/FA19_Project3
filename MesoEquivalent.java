import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MesoEquivalent {
	private String stID;
	private MesoAsciiCal asciiAvg;
	private int avg;
	
	public MesoEquivalent(String stID)
	{
		this.stID = stID;
		asciiAvg = new MesoAsciiCal(new MesoStation(stID));
		avg = asciiAvg.calAverage();
	}
	
	public ArrayList<MesoStation> readFile() throws IOException
	{
		BufferedReader input = new BufferedReader(new FileReader("Mesonet.txt"));
		ArrayList<MesoStation> stations = new ArrayList<MesoStation>();
		String station = "";
		String[] stationInfo;
		MesoStation ms;
		
		for (int i = 0; i < 3; ++i)
			station = input.readLine();
		
		station = input.readLine();
		
		while (station != null)
		{
			station = station.trim();
			stationInfo = station.split("\\s+");
			ms = new MesoStation(stationInfo[0]);
			stations.add(ms);
			station = input.readLine();
		}
		
		input.close();
		return stations;
	}
	
	public HashMap<String, Integer> calAsciiEqual() throws IOException
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put(stID, avg);
		ArrayList<MesoStation> stations = readFile();
		int calAsciiAvg;
		
		for (MesoStation ms : stations)
		{
			asciiAvg = new MesoAsciiCal(ms);
			calAsciiAvg = asciiAvg.calAverage();
			if (calAsciiAvg == avg)
				map.put(ms.getStID(), calAsciiAvg);
		}
		
		return map;
	}
}
