
public class SolarMass
{
	public double relativeMass;
	public SolarMass(double relativeMass)
	{
	this.relativeMass=relativeMass;	
	}
	public SolarMass toSolarMass1()
	{
		SolarMass smObj = new SolarMass(relativeMass);
		return smObj;
	}
	public static String getSolarMass()
	{
		return "SOLAR_MASS";
	}
}
