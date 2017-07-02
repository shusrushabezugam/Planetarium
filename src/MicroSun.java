
public class MicroSun 
{
	public double relativeMass;
	public MicroSun(double relativeMass)
	{
	this.relativeMass=relativeMass;	
	}
	public MicroSun toMicroSun1()
	{
		MicroSun misObj = new MicroSun(relativeMass);
		return misObj;
	}
	public static String getMicroSun()
	{
		return "MICRO_SUN";
	}
}
