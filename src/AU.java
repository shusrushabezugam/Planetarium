
public class AU
{
	public double au;
	public AU(double au)
	{
		this.au=au;
	}
	public AU toAU1()
	{
		AU auObj = new AU(au);
		return auObj;
	}
	public static String getAstroUnit()
	{
		return "AU";
	}
}


