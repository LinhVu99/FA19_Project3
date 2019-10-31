import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MesoLexicographical extends MesoSortedAbstract
{
	public MesoLexicographical(HashMap<String, Integer> asciiVal)
	{
		Map<String, Integer> sorted = sortedMap(asciiVal);
		
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
			System.out.println(entry.getKey());
	}
	
	public Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted)
	{
		Map<String, Integer> sorted = new TreeMap<>(unsorted);
		return sorted;
	}
}