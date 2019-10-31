
public class MesoAsciiCal extends MesoAsciiAbstract 
{
	private String stID;
	
	public MesoAsciiCal(MesoStation ms)
	{
		stID = ms.getStID();
		calAverage();
	}
	
	public int calAverage()
	{
		int asciiTotal = 0;
		
		for (int i = 0; i < 4; ++i)
			asciiTotal = asciiTotal + (int)stID.charAt(i);
		
		double asciiAverage = asciiTotal / 4.0;
		int average = 0;
		
		if ((asciiAverage - Math.floor(asciiAverage)) < 0.25)
			average = (int)Math.floor(asciiAverage);
		else
			average = (int)Math.ceil(asciiAverage);
		
		return (average + 79) / 2;
	}
}