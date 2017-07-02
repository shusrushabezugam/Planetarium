
public class EarthMass 
{
	public double rem;
	public EarthMass(double rem)
	{
	this.rem=rem;	
	}
	public EarthMass toEarthMass1()
	{
		EarthMass emObj = new EarthMass(rem);
		return emObj;
	}
    public static String getEarthMass()
    {
    	return "EARTH_MASS";
    }
    
}
