
public class EarthDay 
{
	public double ed;
	public EarthDay(double ed)
	{
	this.ed=ed;	
	}
	public EarthDay toEarthDay()
	{
		EarthDay edObj = new EarthDay(ed);
		return edObj;
	}
	public static String getEarthDay()
	{
		return " EARTH_DAY";
	}

}
